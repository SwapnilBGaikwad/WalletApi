package com.wallet.service;

import com.wallet.model.Wallet;
import com.wallet.repository.WalletRepository;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class WalletServiceTest {
    @Test
    public void return_balance_of_user_from_given_userId() {
        WalletRepository repository = mock( WalletRepository.class );
        final WalletService service = new WalletService( repository );

        String userId = "dummy@mail.com";
        when( repository.findOne( userId ) ).thenReturn( new Wallet( userId, 10d ) );

        final double balance = service.getBalance( userId );
        assertEquals( 10, balance, 0.0 );
    }
}