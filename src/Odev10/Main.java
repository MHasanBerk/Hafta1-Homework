package Odev10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, fibo1 = 0, fibo2 = 1, sum;

        System.out.print("Fibonnaci serisi için eleman sayısını girin: ");
        num = input.nextInt();

        for(int i = 0; i < num; i++){
            System.out.println(fibo2);

            sum = fibo1 + fibo2;
            fibo1 = fibo2;
            fibo2 = sum;
        }
    }
}