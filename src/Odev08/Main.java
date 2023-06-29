package Odev08;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;

        System.out.print("Basamak sayısını giriniz: ");
        num = input.nextInt();

        //i = num, because "j" and "k" variables are depend on it.
        for(int i = num; i > 0; i--){
            for(int j = 0; j < num - i ; j++){
                System.out.print(" ");
            }
            for(int k = 2 * i - 1; k > 0; k--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}