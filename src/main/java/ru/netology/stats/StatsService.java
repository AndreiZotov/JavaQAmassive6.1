package ru.netology.stats;

public class StatsService {
    public long sum(long[] sales) { // вычисление суммы всех продаж за год
        long totalSale = 0; // в начале продаж не было,создал переменную

        for (long sale : sales) {
            totalSale += sale; //перебрал и сложил все продажи за год
        }
        return totalSale;// сумма всеех продаж за год
    }

    public long average(long[] sales) { //вычисление среднемесячной продажи за год

        return sum(sales) / sales.length;// вызываем метод суммы продаж и делим его на количество месяцев


    }

    public int monthMaxSale(long[] sales) { //вычисление максимальной месячной  продажи за год
        int monthMaximum = 0;
        for (int i = 0; i < sales.length; i++) { // перебираем все месяцы по очереди
            if (sales[i] >= sales[monthMaximum]) { // сравниваем обьём продаж за каждый месяц
                monthMaximum = i;// и наибольший запоминаем
            }
        }
        return monthMaximum + 1;
    }

    public int monthMinSale(long[] sales) { //вычисление минимальной месячной  продажи за год
        int monthMin = 0;
        for (int i = 0; i < sales.length; i++) { // перебираем все месяцы по очереди
            if (sales[i] <= sales[monthMin]) { // сравниваем обьём продаж за каждый месяц
                monthMin = i;// и наименьший запоминаем
            }
        }
        return monthMin + 1;
    }

    public int monthBelowAverage(long[] sales) {// вычисление количества месячных продаж ниже среднегодового уровня
        int counter = 0;//подключаем счётчик месяцев в которые продажи ниже среднего
        for (long sale : sales) {// перебираем все продажи по очереди
            if (sale < average(sales)) { //сравниваем со среднегодовыми продажами
                counter++;
            }

        }
        return counter;
    }

    public int monthHigherAverage(long[] sales) { // вычисление количества месячных продаж выше среднегодового уровня
        int counter = 0; //подключаем счётчик количества месяцев в которые продажи выше среднего

        long averageSale = average(sales);  //выделяем переменную ,чтобы не затрагивать другие методы
        // и не загружать вычислительные мощности компьютера

        for (long sale : sales) { // перебираем все продажи по очереди
            if (sale > averageSale) { //сравниваем со среднегодовыми продажами
                counter++;
            }

        }
        return counter;
    }
}
