package LessonsOneTwo;

public class Main {
    public static void main(String[] args) {

        //region Для первой работы
        /*
        //Задание первое
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
        LessonsOneTwo.StopWatch sw = new LessonsOneTwo.StopWatch();
        int[] myArray = getRandomArray(); // дергаем метод для получения рандомного неотсортированного массива
        sw.start(); // запускаем таймер
        sw.bubbleSort(myArray);
        sw.end(); // останавливаем
        System.out.println("Отсортировало за: " + sw.getElapsedTime()); // у меня справляется за 13,225 в среднем

        LessonsOneTwo.ArrayGuts arrayGuts = new LessonsOneTwo.ArrayGuts();
        double[][] myAnotherArray = arrayGuts.CreateArray();
        for (int i = 0; i < myAnotherArray.length; i++) {
            for (int j = 0; j < myAnotherArray[i].length; j++) {
                System.out.print(myAnotherArray[i][j] + " ");
            }
        }
        */
        //endregion

        double[][] myArray = ArrayGuts.CreateArray();
        Location location = ArrayGuts.locateLargest(myArray);
        System.out.println("Макс. значение: " + location.maxValue +
                " строка: " + location.row +
                " столбец: " + location.column);


    }

    /*region Для первой работы
    public static int[] getRandomArray(){
        int arraySize = 1000; // для задания размера массива
        int[] array = new int[arraySize];
        Random rnd = new Random();
        for(int i = 0;i < arraySize;i++){ // рандомно пихаю туда числа
            array[i] = rnd.nextInt();
        }
        return array;
    }
    //endregion*/
}