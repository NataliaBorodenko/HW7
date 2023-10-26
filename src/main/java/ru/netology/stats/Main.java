package ru.netology.stats;

import java.lang.reflect.Array;
import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        StatsService service = new StatsService();
        long[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };


        System.out.println(Arrays.toString(sales));
        System.out.println("Сумма продаж -" + service.summaSales(sales));
        System.out.println("Средняя сумма продаж - " + service.mediumSales(sales));
        System.out.println("Номер месяца с максимальными продажами - " + service.monthMaxSales(sales));
        System.out.println("Номер месяца с минимальными продажами - " + service.monthMinSales(sales));
        System.out.println("Количество продаж меньше средней - " + service.quantityMonthMinMedium(sales));
        System.out.println("Количество продаж меньше средней - " + service.quantityMonthMaxMedium(sales));
    }
}
