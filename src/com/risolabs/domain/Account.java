package com.risolabs.domain;

import java.math.BigDecimal;

/**
 * Created by @mriso_dev on 23/08/17
 */
public class Account {

    private String username;
    private BigDecimal balance;
    private String accountNumber;

    public Account(String username, BigDecimal balance, String accountNumber) {
        this.username = username;
        this.balance = balance;
        this.accountNumber = accountNumber;
    }


    public String getUsername() {
        return username;
    }

}