package Odev01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double height, weight, index; //index == body mass index

        System.out.print("Enter your height(m): ");
        height = input.nextDouble();

        System.out.print("Enter your weight(kg): ");
        weight = input.nextDouble();

        index = weight/(height * height);

        System.out.println("Your body mass is: " + index);
    }
}
