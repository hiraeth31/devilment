package LessonFour.ChapterOne;

public class Main {
    public static void main(String[] args) {
        try {
            new Triangle(3, 4, 5);
            new Triangle(30, 40, 50);
        }
        catch (IllegalTriangleException ex) { System.out.println(ex); }

        try {
            new Triangle(16, 2, 33);
        }
        catch (IllegalTriangleException ex) { System.out.println(ex); }

        System.out.println("Количество созданных объектов: " + Triangle.getNumberOfObjects());
    }
}
