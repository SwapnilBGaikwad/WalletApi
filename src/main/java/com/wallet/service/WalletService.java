package com.wallet.service;

import com.wallet.model.Wallet;
import com.wallet.repository.WalletRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class WalletService {
    private WalletRepository repository;

    @Autowired
    public WalletService( WalletRepository repository ) {
        this.repository = repository;
    }

    public double getBalance( final String userId ) {
        final Wallet wallet = repository.findOne( userId );
        if ( wallet == null ) {
            return 0d;
        }
        return wallet.getBalance();
    }

    public boolean addUser( final Wallet wallet ) {
        System.out.println( "Wallet : " + wallet );
        return repository.save( wallet ) != null;
    }
}
