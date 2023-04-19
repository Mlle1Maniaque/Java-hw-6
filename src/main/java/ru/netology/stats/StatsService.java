package ru.netology.stats;

public class StatsService {
    public int getTotal(int[] sales) {
        int total = 0;
        for (int t : sales) {
            total += t;
        }
        return total;

    }

    public int getAverageMonth(int[] sales) {
        int average = getTotal(sales) / sales.length;
        return average;
    }

    public int getSalesPeak(int[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;

    }

    public int getMinSales(int[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int getBelowAverage(int[] sales) {
        int month = 0;
        for (int sale : sales) {
            if (sale < getAverageMonth(sales)) {
                month++;
            }
        }
        return month;
    }

    public int getAboveAverage(int[] sales) {
        int month = 0;
        for (int sale : sales) {
            if (sale > getAverageMonth(sales)) {
                month++;
            }
        }
        return month;
    }
}

