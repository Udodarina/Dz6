package ru.netology.MassivDz6.services;

public class MonthlySalesService {
    public int amountOfSales(int[] month) {
        int allSales = 0;
        for (int j : month) {

            allSales += j;

        }
        return allSales;
    }

    public int average(int[] month) {
        int allSales = 0;
        int average = 0;
        for (int j : month) {

            allSales += j;
            average = allSales / 12;

        }
        return average;
    }

    public int getMaxDay(int[] month) {
        int maxDay = 0;
        for (int i = 0; i < month.length; i++) {

            if (month[i] >= month[maxDay]) {
                maxDay = i;
            }
        }
        return maxDay;
    }

    public int getMinDay(int[] month) {
        int minDay = 0;
        for (int i = 0; i < month.length; i++) {

            if (month[i] <= month[minDay]) {
                minDay = i;
            }
        }
        return minDay;
    }

    public int numDayBelowAverage(int[] month) {
        int k = 0;
        for (int i = 0; i < month.length; i++) {

            if (month[i] < average(month)) {
                k++;
            }
        }
        return k;
    }

    public int numDayAboveAverage(int[] month) {
        int k = 0;
        for (int i = 0; i < month.length; i++) {

            if (month[i] >= average(month)) {
                k++;
            }
        }
        return k;
    }

}