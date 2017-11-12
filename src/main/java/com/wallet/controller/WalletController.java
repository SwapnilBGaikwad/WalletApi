package com.wallet.controller;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
@RequestMapping( "/" )
public class WalletController {
    @RequestMapping( method = RequestMethod.GET )
    public Integer getWalletBalance( @ModelAttribute int count ) {
        return count + 100;
    }

}
