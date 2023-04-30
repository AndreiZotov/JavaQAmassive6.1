package ru.netology.stats;

import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Test;

class StatsServiceTest {
    @Test
    public void testSum() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.sum(sales);

        long expected = 180;

        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void Average() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.average(sales);

        long expected = 180/12;

        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void monthMaxSale() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.monthMaxSale(sales);

        long expected = 8;

        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void monthMinSale() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.monthMinSale(sales);

        long expected = 9;

        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void testMonthBelowAverage() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.monthBelowAverage(sales);

        long expected = 5;

        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void testMonthHigherAverage() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.monthHigherAverage(sales);

        long expected = 5;

        Assertions.assertEquals(expected, actual);

    }

}