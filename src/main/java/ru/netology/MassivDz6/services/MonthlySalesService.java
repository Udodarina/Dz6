package ru.netology.MassivDz6.services;

public class MonthlySalesService {
    public long amountOfSales(long[] month) {
        long allSales = 0;
        for (long i : month) {

            allSales += i;

        }
        return allSales;
    }

    public long average(long [] month) {
        long allSales = 0;
        long average = 0;
        for (long i : month) {

            allSales += i;
            average = allSales / 12;

        }
        return average;
    }

    public int getMaxDay(long[] month) {
        int maxDay = 0;
        for (int i = 0; i < month.length; i++) {

            if (month[i] >= month[maxDay]) {
                maxDay = i;
            }
        }
        return maxDay;
    }

    public int getMinDay(long[] month) {
        int minDay = 0;
        for (int i = 0; i < month.length; i++) {

            if (month[i] <= month[minDay]) {
                minDay = i;
            }
        }
        return minDay;
    }

    public int numDayBelowAverage(long [] month) {
        int numberOfMonth = 0;
        long allSales = 0;
        long average = 0;
        for (long i : month) {

            allSales += i;
            average = allSales / 12;

        }

        for (int i = 0; i < month.length; i++) {

            if (month[i] < average) {
                numberOfMonth++;
            }
        }
        return numberOfMonth;
    }

    public int numDayAboveAverage(long[] month) {
        int numberOfMonth = 0; //объявляем переменную количество месяцев, которые >= среднего
        long allSales = 0; // обьявляем переменную сумма за год
        long average = 0; // объявляем переменную среднее значение
        for (long i : month) {

            allSales += i;
            average = allSales / 12;

        }

        for (int i = 0; i < month.length; i++) {

            if (month[i] >= average) {
                numberOfMonth++;
            }
        }
        return numberOfMonth;
    }

}