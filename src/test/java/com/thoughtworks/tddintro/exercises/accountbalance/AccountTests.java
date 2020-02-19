package com.thoughtworks.tddintro.exercises.accountbalance;

import org.junit.Ignore;
import org.junit.Test;


import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class AccountTests {
    private final Account account = new Account(50);
    @Test
    public void shouldIncreaseMyBalanceWhenIDepositMoney(){
        int originMoney = account.getMoney();
        account.deposit(50);
        assertThat(account.getMoney(),is(originMoney + 50));

    }

    @Test
    public void shouldDecreaseMyBalanceWhenIWithdrawMoney(){
        int originMoney = account.getMoney();
        account.withdraw(50);
        assertThat(account.getMoney(),is(originMoney - 50));

    }

    @Test

    public void shouldNotDecreaseMyBalanceWhenIWithdrawMoneyAndDoNotHaveEnoughToCoverTheWithdrawal(){
        int originMoney = account.getMoney();
        account.withdraw(100);
        assertThat(account.getMoney(),is(originMoney));
    }
}
