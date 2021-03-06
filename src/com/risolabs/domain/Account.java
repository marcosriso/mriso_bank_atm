package com.risolabs.domain;

import com.risolabs.exception.AtmException;
import com.risolabs.exception.AccountWithoutFundsException;

import java.math.BigDecimal;

/**
 * Created by @mriso_dev on 23/08/17
 * This class represents the user's Account
 */
public class Account {

    private String username;
    private BigDecimal balance;
    private String accountNumber;

    public Account(final String username, BigDecimal balance, final String accountNumber) {
        this.username = username;
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    public String getUsername() {
        return username;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void withDrawFromBalance(BigDecimal withdraw) throws AtmException {
        int check = withdraw.compareTo(this.balance);
        if(check <= 0) {
            this.balance = balance.subtract(withdraw);
        }else{
            throw new AccountWithoutFundsException();
        }
    }

    public void DepositToBalance(BigDecimal deposit) {
        this.balance = balance.add(deposit);
    }

}
