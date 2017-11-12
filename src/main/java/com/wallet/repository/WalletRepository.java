package com.wallet.repository;

import com.wallet.model.Wallet;
import org.springframework.data.repository.CrudRepository;

public interface WalletRepository extends CrudRepository<Wallet, String> {
    @Override Wallet findOne( String userId );

    @Override <S extends Wallet> S save( S entity );
}
