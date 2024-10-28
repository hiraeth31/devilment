package LessonFour.ChapterOne;

public class Triangle {

    public double side1, side2, side3;
    private static int numberOfObjects = 0;

    public Triangle(double side1, double side2, double side3)
            throws IllegalTriangleException {
        if (side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1) {
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
            numberOfObjects++;
        } else {
            throw new IllegalTriangleException(side1, side2, side3);
        }
    }

    public static int getNumberOfObjects() {
        return numberOfObjects;
    }
}
