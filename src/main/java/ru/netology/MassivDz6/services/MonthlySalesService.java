package ru.netology.MassivDz6.services;

public class MonthlySalesService {
    public int amountOfSales(int[] month) {
        int allSales = 0;
        for (int i : month) {

            allSales += i;

        }
        return allSales;
    }

    public int average(int[] month) {
        int allSales = 0;
        int average = 0;
        for (int i : month) {

            allSales += i;
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
        int numberOfMonth = 0;
        int allSales = 0;
        int average = 0;
        for (int i : month) {

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

    public int numDayAboveAverage(int[] month) {
        int numberOfMonth = 0; //объявляем переменную количество месяцев, которые >= среднего
        int allSales = 0; // обьявляем переменную сумма за год
        int average = 0; // объявляем переменную среднее значение
        for (int i : month) {

            allSales += i; // сумма за год
            average = allSales / 12; // среднее значение

        }

        for (int i = 0; i < month.length; i++) {

            if (month[i] >= average) {
                numberOfMonth++;
            }
        }
        return numberOfMonth;
    }

}