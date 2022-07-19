package ru.netology.stats.StatsService;

public class StatsService {
    public long sumSales(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public double midSales(long[] sales) {
        long sum = sumSales(sales);
        int length = sales.length;
        return ((double) sum) / length;
    }

    public int amountOfMonthsMidSalesHigher(long[] sales) {
        double midSalesMonth = midSales(sales);
        int amountOfHighSales = 0;
        for (long sale : sales) {
            if (sale >= midSalesMonth) {
                amountOfHighSales++;
            }
        }
        return amountOfHighSales;
    }

    public int amountOfMonthsMidSalesLower(long[] sales) {
        double midSalesMonth = midSales(sales);
        int amountOfLowSales = 0;
        for (long sale : sales) {
            if (sale < midSalesMonth) {
                amountOfLowSales++;
            }
        }
        return amountOfLowSales;
    }


    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth + 1;
    }
}
