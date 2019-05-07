package com.wallet.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity(name = "wallet")
public class Wallet implements Serializable {
    @Id
    @Column(name = "user_id")
    private String userId;
    @Column(name = "balance")
    private Double balance;

    public Wallet() {
    }

    public Wallet(String userId, double balance) {
        this.userId = userId;
        this.balance = balance;
    }

    public String getUserId() {
        return userId;
    }

    public Double getBalance() {
        return balance;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Wallet{" +
                "userId='" + userId + '\'' +
                ", balance=" + balance +
                '}';
    }
}
