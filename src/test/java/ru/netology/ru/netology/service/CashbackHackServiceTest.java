package ru.netology.ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;

class CashbackHackServiceTest {

    @Test
    void needToIncreaseThePurchaseAmountBy100() {
        CashbackHackService service = new CashbackHackService();

        int expected = 100;
        int actual = service.remain(900);
        Assert.assertEquals(actual, expected);
    }

    @Test
    void needToIncreaseThePurchaseAmountBy990() {
        CashbackHackService service = new CashbackHackService();

        int expected = 990;
        int actual = service.remain(10);
        Assert.assertEquals(actual, expected);
    }

    @Test
    void noNeedToIncreaseThePurchaseIfAmountIs1000() {
        CashbackHackService service = new CashbackHackService();

        int expected = 0;
        int actual = service.remain(1000);
        Assert.assertEquals(actual, expected);
    }

    @Test
    void needToIncreaseThePurchaseIfAmountIsMore1000() {
        CashbackHackService service = new CashbackHackService();

        int expected = 500;
        int actual = service.remain(1500);
        Assert.assertEquals(actual, expected);
    }

    @Test
    void noNeedToIncreaseThePurchaseIfAmountIs2000() {
        CashbackHackService service = new CashbackHackService();

        int expected = 0;
        int actual = service.remain(2000);
        Assert.assertEquals(actual, expected);
    }
}