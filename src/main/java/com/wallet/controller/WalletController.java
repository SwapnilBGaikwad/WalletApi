package com.wallet.controller;

import com.wallet.model.Wallet;
import com.wallet.service.WalletService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/")
public class WalletController {
    private WalletService service;

    public WalletController(WalletService service) {
        this.service = service;
    }

    @GetMapping(path = "/balance")
    @ResponseBody
    public List<Wallet> getWalletBalance() {
        final List<Double> balances = new ArrayList<>();
        balances.add(10.0);
        balances.add(20.0);
        return service.get(balances);
    }

    @PostMapping(path = "/add-user")
    @ResponseBody
    public Wallet addUser(@RequestBody Wallet wallet) {
        System.out.println("Wallet : " + wallet);
        return service.addUser(wallet);
    }

}
