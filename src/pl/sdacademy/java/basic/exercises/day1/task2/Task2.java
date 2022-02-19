package pl.sdacademy.java.basic.exercises.day1.task2;

import java.util.Scanner;

public class Task2 {
//    private static final float PI = 3.14f;


    public static void main(String[] args) {
//        area = pi * r * r
//        perimeter = 2 * pi * r
        float diameter = getDiameterFromUser();

        float circumference = calculateCircumferenceOfACircle(diameter);
        System.out.println("Circumference Of A Circle: " = circumference);

        float area = calculateAreaOfACircle(diameter);
        System.out.println("Area Of A Circle: " + area);


    }

    private static float getDiameterFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert diameter:");
        return scanner.nextFloat();
    }

    private static float calculateCircumferenceOfACircle(float diameter) {
//        return PI * diameter;
        return (float) Math.PI * diameter;
    }

    private static float calculateAreaOfACircle (float diameter) {

        float radius = diameter/2;
        return (float) Math.PI * radius * radius;
    }




}
