package Odev06;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numChoice, min, max, num = 0;

        System.out.print("Kaç tane sayı gireceksiniz: ");
        numChoice = input.nextInt();

        //As you can see, we get the first data from the user outside the for loop.
        System.out.print("1. Sayıyı giriniz: ");
        num = input.nextInt();

        //With this way we are assigning min and max values to compare later.
        max = num;
        min = num;

        for(int i = 1; i < numChoice; i++){

            //Getting the new number from user.
            System.out.printf("%d. Sayıyı giriniz: ", (i + 1));
            num = input.nextInt();

            //Comparing the new number with max and min values.
            if(num > max){
                max = num;
            }
            if(num < min){
                min = num;
            }
        }

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}