package com.wallet.service;

import com.wallet.model.Wallet;
import com.wallet.repository.WalletRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class WalletService {
    private WalletRepository repository;

    @Autowired
    WalletService(WalletRepository repository) {
        this.repository = repository;
    }

    public double getBalance(final String userId) {
        final Wallet wallet = repository.findOne(userId);
        if (wallet == null) {
            return 0d;
        }
        return wallet.getBalance();
    }

    @Transactional
    public Wallet addUser(final Wallet wallet) {
        System.out.println("Wallet : " + wallet);
        return repository.save(wallet);
    }

    @Transactional(readOnly = true)
    public List<Wallet> get(List<Double> balances) {
        return repository.getAllByIdAndBalance(balances)
                .filter(a -> a.getBalance() != null)
                .collect(Collectors.toList());
    }
}
