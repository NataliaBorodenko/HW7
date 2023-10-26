package ru.netology.stats;

public class StatsService {
    public long summaSales(long[] sales) {
        long summa = 0;
        for (int i = 0; i < sales.length; i++) {
            summa = summa + sales[i];
        }
        return summa;
    }

    public long mediumSales(long[] sales) {
        long mediumSumma = 0;
        long summa = 0;
        for (int i = 0; i < sales.length; i++) {
            summa = summa + sales[i];
            mediumSumma = summa / (i + 1);
        }
        return mediumSumma;
    }

    public int monthMaxSales(long[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int monthMinSales(long[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int quantityMonthMinMedium(long[] sales) {
        long m = mediumSales(sales);
        int minMediumMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < m) {
                minMediumMonth++;
            }
        }
        return minMediumMonth;
    }

    public int quantityMonthMaxMedium(long[] sales) {
        long m = mediumSales(sales);
        int maxMediumMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > m) {
                maxMediumMonth++;
            }
        }
        return maxMediumMonth;
    }

}



