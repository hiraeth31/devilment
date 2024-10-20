package LessonThree;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите 1 сторону: ");
        double side1 = in.nextDouble();
        System.out.println("Введите 2 сторону: ");
        double side2 = in.nextDouble();
        System.out.println("Введите 3 сторону: ");
        double side3 = in.nextDouble();
        System.out.println("Введите цвет: ");
        String color = in.next();
        System.out.println("Закрашен или нет?(bool): ");
        boolean isFilled = in.nextBoolean();

        Triangle triangle = new Triangle(side1, side2, side3);
        triangle.color = color;
        triangle.isFilled = isFilled;

        System.out.println("Площадь: " + triangle.getArea());
        System.out.println("Периметр: " + triangle.getPerimeter());
        System.out.println("Цвет: " + triangle.color);
        System.out.println("Закрашен или нет: " + triangle.isFilled);


    }
}