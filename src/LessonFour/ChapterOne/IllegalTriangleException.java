package LessonFour.ChapterOne;

public class IllegalTriangleException extends Exception {

    public IllegalTriangleException(double side1, double side2, double side3) {
        super("Не соответствует правилу: " + side1 + ", " + side2 + ", " + side3);
    }

}
