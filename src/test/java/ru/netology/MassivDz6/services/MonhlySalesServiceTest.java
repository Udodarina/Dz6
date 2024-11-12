package ru.netology.MassivDz6.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MonhlySalesServiceTest {

    @Test // сумма всех продаж за год
    public void sumOfAllSales() {
        MonthlySalesService service = new MonthlySalesService();

        long [] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedDay = 180;
        long actualDay = service.amountOfSales(month);

        Assertions.assertEquals(expectedDay, actualDay);
    }

    @Test
    public void averageSales() { // средняя ежемесячная сумма продаж за год
        MonthlySalesService service = new MonthlySalesService();


        long[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedDay = 15;
        long actualDay = service.average(month);

        Assertions.assertEquals(expectedDay, actualDay);
    }

    @Test
    public void numberMaxSales() { // номер элемента массива с максимальной суммой
        MonthlySalesService service = new MonthlySalesService();

        long[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedDay = 7;
        int actualDay = service.getMaxDay(month);

        Assertions.assertEquals(expectedDay, actualDay);
    }

    @Test
    public void numberMinSales() { // номер элемента массива с минимальной суммой
        MonthlySalesService service = new MonthlySalesService();

        long[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedDay = 8;
        int actualDay = service.getMinDay(month);

        Assertions.assertEquals(expectedDay, actualDay);
    }

    @Test
    public void belowAverage() { // количество дней, в которые ежемесячная сумма меньше среднего значения
        MonthlySalesService service = new MonthlySalesService();

        long[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedDay = 5;
        int actualDay = service.numDayBelowAverage(month);

        Assertions.assertEquals(expectedDay, actualDay);
    }

    @Test
    public void aboveAvarage() { // количество дней, в которые ежемесячная сумма больше среднего значения
        MonthlySalesService service = new MonthlySalesService();

        long[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedDay = 7;
        int actualDay = service.numDayAboveAverage(month);

        Assertions.assertEquals(expectedDay, actualDay);
    }
}

