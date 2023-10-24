package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    public void shouldFindSummaSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedSummaSales = 180;
        long actualSummaSales = service.summaSales(sales);
        Assertions.assertEquals(expectedSummaSales, actualSummaSales);
    }

    @Test
    public void shouldFindMediumSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedMediumSales = 15;
        long actualMediumSales = service.mediumSales(sales);
        Assertions.assertEquals(expectedMediumSales, actualMediumSales);
    }

    @Test
    public void shouldFindMonthMaxSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMonthMaxSales = 8;
        int actualMonthMaxSales = service.MonthMaxSales(sales);
        Assertions.assertEquals(expectedMonthMaxSales, actualMonthMaxSales);
    }

    @Test
    public void shouldFindMonthMinSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMonthMinSales = 9;
        int actualMonthMinSales = service.MonthMinSales(sales);
        Assertions.assertEquals(expectedMonthMinSales, actualMonthMinSales);
    }

    @Test
    public void shouldFindQuantityMonthMinMedium() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedQuantityMonthMinMedium = 5;
        int actualQuantityMonthMinMedium = service.QuantityMonthMinMedium(sales);
        Assertions.assertEquals(expectedQuantityMonthMinMedium, actualQuantityMonthMinMedium);
    }

    @Test
    public void shouldFindQuantityMonthMaxMedium() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedQuantityMonthMaxMedium = 5;
        int actualQuantityMonthMaxMedium = service.QuantityMonthMinMedium(sales);
        Assertions.assertEquals(expectedQuantityMonthMaxMedium, actualQuantityMonthMaxMedium);
    }
}

