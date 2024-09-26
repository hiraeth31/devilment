import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        //region Задание первое
        GregorianCalendar gc = new GregorianCalendar();
        Date date = gc.getTime();
        int year = gc.get(GregorianCalendar.YEAR);
        int month = gc.get(GregorianCalendar.MONTH) + 1; // прибавил единицу, потому что там нумерация идет
        // потому что The first month of the year in the Gregorian and Julian calendars is JANUARY which is 0;
        int day = gc.get(GregorianCalendar.DAY_OF_MONTH);
        date = new GregorianCalendar(year, month, day).getTime(); // попробовал через класс Date еще
        System.out.println(date);
        System.out.println("Год: " + year + " Месяц: " + month + " День: " + day);

        long value = 1234567898765L;
        gc.setTimeInMillis(value);
        year = gc.get(GregorianCalendar.YEAR);
        month = gc.get(GregorianCalendar.MONTH) + 1;
        day = gc.get(GregorianCalendar.DAY_OF_MONTH);
        System.out.println("Год: " + year + " Месяц: " + month + " День: " + day);

        //Второе задание
        // Не совсем понял, что значит сделать клиент для класса, поэтому вот
        StopWatch sw = new StopWatch();
        int[] myArray = getRandomArray(); // дергаем метод для получения рандомного неотсортированного массива
        sw.start(); // запускаем таймер
        sw.bubbleSort(myArray);
        sw.end(); // останавливаем
        System.out.println("Отсортировало за: " + sw.getElapsedTime()); // у меня справляется за 13,225 в среднем
    }

    public static int[] getRandomArray(){
        int arraySize = 100000; // для задания размера массива
        int[] array = new int[arraySize];
        Random rnd = new Random();
        for(int i = 0;i < arraySize;i++){ // рандомно пихаю туда числа
            array[i] = rnd.nextInt();
        }
        return array;
    }
}