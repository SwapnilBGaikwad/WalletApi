package com.wallet.repository;

import com.wallet.model.Wallet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.stream.Stream;

public interface WalletRepository extends JpaRepository<Wallet, String> {
    @Override
    Wallet findOne(String userId);

    @Override
    <S extends Wallet> S save(S entity);

    @Query("SELECT w FROM wallet w WHERE balance IN :amounts")
    Stream<Wallet> getAllByIdAndBalance(@Param("amounts") List<Double> balances);
}
