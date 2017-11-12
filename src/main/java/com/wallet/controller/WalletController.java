package com.wallet.controller;

import com.wallet.model.Wallet;
import com.wallet.service.WalletService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping( "/" )
public class WalletController {
    private WalletService service;

    public WalletController( WalletService service ) {
        this.service = service;
    }

    @RequestMapping( path = "/balance", method = RequestMethod.GET )
    @ResponseBody
    public Double getWalletBalance( @RequestParam String userId ) {
        return service.getBalance( userId );
    }

    @RequestMapping( path = "/add-user", method = RequestMethod.POST )
    @ResponseBody
    public boolean getWalletBalance1( @RequestParam String userId,
            @RequestParam Double balance ) {
        System.out.println( "Wallet : " + userId );
        System.out.println( "Wallet : " + balance );
        final Wallet wallet = new Wallet( userId, balance );
        System.out.println( "Wallet : " + wallet );
        return service.addUser( wallet );
    }

}
