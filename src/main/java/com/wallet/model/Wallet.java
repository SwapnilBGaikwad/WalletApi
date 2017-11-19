package com.wallet.model;

import javax.persistence.*;

@Entity
@Table( name = "wallets" )
public class Wallet {
    @Id
    private String userId;
    @Column
    private Double balance;

    public Wallet() {
    }

    public Wallet( String userId, double balance ) {
        this.userId = userId;
        this.balance = balance;
    }

    public Double getBalance() {
        return balance;
    }

    @Override public String toString() {
        return "Wallet{" +
                "userId='" + userId + '\'' +
                ", balance=" + balance +
                '}';
    }
}
