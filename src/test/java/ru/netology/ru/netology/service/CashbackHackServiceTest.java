package ru.netology.ru.netology.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashbackHackServiceTest {

    @Test
    void needToIncreaseThePurchaseAmountBy100() {
        CashbackHackService service = new CashbackHackService();

        int expected = 100;
        int actual = service.remain(900);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void needToIncreaseThePurchaseAmountBy990() {
        CashbackHackService service = new CashbackHackService();

        int expected = 990;
        int actual = service.remain(10);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    void noNeedToIncreaseThePurchaseIfAmountIs1000() {
        CashbackHackService service = new CashbackHackService();

        int expected = 0;
        int actual = service.remain(1000);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    void noNeedToIncreaseThePurchaseIfAmountIsMore1000() {
        CashbackHackService service = new CashbackHackService();

        int expected = 0;
        int actual = service.remain(2000);
        Assertions.assertEquals(expected, actual);
}