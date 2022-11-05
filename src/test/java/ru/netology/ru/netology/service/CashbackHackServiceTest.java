package ru.netology.ru.netology.service;

import org.junit.Assert;
import org.junit.Test;


class CashbackHackServiceTest {

    @Test
    void needToIncreaseThePurchaseAmountBy100() {
        CashbackHackService service = new CashbackHackService();

        int expected = 100;
        int actual = service.remain(900);
        Assert.assertEquals(expected, actual);
    }

    @Test
    void needToIncreaseThePurchaseAmountBy990() {
        CashbackHackService service = new CashbackHackService();

        int expected = 990;
        int actual = service.remain(10);
        Assert.assertEquals(expected, actual);
    }

    @Test
    void noNeedToIncreaseThePurchaseIfAmountIs1000() {
        CashbackHackService service = new CashbackHackService();

        int expected = 0;
        int actual = service.remain(1000);
        Assert.assertEquals(expected, actual);
    }

    @Test
    void needToIncreaseThePurchaseIfAmountIsMore1000() {
        CashbackHackService service = new CashbackHackService();

        int expected = 500;
        int actual = service.remain(1500);
        Assert.assertEquals(expected, actual);
    }

    @Test
    void nNeedToIncreaseThePurchaseIfAmountIs2000() {
        CashbackHackService service = new CashbackHackService();

        int expected = 0;
        int actual = service.remain(2000);
        Assert.assertEquals(expected, actual);
    }
}