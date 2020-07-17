package com.company;

public class Main {

    public static void main(String[] args) {
        double[] numbers = {10.1, 11.2, 12.3, 13.4, 14.5, 56.9, -34.7, 23.5, 38.5, 3.9, 2.8, 1.3, 4.7, 5.32, 10.7};
        double result = 0;

        for (double d : numbers) {
            result += d;
        }
        System.out.println("Среднее арифметическое" + result / numbers.length);



    }
}
