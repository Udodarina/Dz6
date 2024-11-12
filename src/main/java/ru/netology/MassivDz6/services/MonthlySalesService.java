package ru.netology.MassivDz6.services;
//сумма всех продаж
public class MonthlySalesService  {
    public long amountOfSales(long[] sales) {
        long sum = 0; // объявляем переменную для хранения суммы
        for (long sale : sales) { // проходим по каждому месяцу в году

            sum += sale; // добавляем выручку за текущий месяц к общей сумме

        }
        return sum; // возвращаем выручку за год
    }
//метод для расчета средней выручки в месяц
    public long average(long [] sales) {

        return amountOfSales(sales) /12; // подсчет и возврат среднего значения за месяц
    }
//поиск месяца с максимальной выручкой
    public int getMaxDay(long[] sales) {
        int maxDay = 0; // индекс месяца с макс продажами
        for (int i = 0; i < sales.length; i++) {

            if (sales[i] >= sales[maxDay]) {
                maxDay = i; // обновляем индекс максимума
            }
        }
        return maxDay; // возвращаем индекс массива с макс значением
    }
//метод для нахождения месяца с миним выручкой
    public int getMinDay(long[] sales) {
        int minDay = 0;
        for (int i = 0; i < sales.length; i++) {

            if (sales[i] <= sales[minDay]) {
                minDay = i;
            }
        }
        return minDay;
    }
// метод для подсчета количества месяцев с продажами ниже среднего
    public int numDayBelowAverage(long [] sales) {
        int numberOfMonth = 0;

        long average = average(sales);
        for (long sale : sales) {

            if (sale < average) {
                numberOfMonth++;
            }
        }
        return numberOfMonth;
    }
//метод для подсчета количества месяцев с продажами выше средного
    public int numDayAboveAverage(long[] sales) {
        int numberOfMonth = 0; //объявляем переменную количество месяцев, которые >= среднего

        long average = average(sales); // объявляем переменную среднее значение
        for (long sale : sales) {


            if (sale >= average) {
                numberOfMonth++;
            }
        }
        return numberOfMonth;
    }

}