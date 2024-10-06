import java.util.Random;

public class ArrayGuts {

    public static double[][] CreateArray(){
        double[][] array = new double[10][10];
        Random rnd = new Random();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                // тупой метод с округлением какой-то, не понял как ему указать чтобы до сотых округлил
                array[i][j] = Math.round(rnd.nextDouble(10, 100) * 100) / 100.0;
            }
        }
        return array;
    }

    public static Location locateLargest(double[][] array){
        int maxRow = 0, maxColumn = 0;
        double maxValue = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > maxValue){
                    maxValue = array[i][j];
                    maxRow = i;
                    maxColumn = j;
                }
            }
        }
        return new Location(maxRow, maxColumn, maxValue);
    }

}
