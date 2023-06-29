package Odev07;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, sum = 0;

        System.out.print("Bir sayı giriniz: ");
        num = input.nextInt();

        for(int i = 1; i < num; i++){
            if(num % i == 0){
                sum += i;
            }
        }

        if(sum == num && num != 0){
            System.out.println(num + " bir mükemmel sayıdır.");
        }else{
            System.out.println(num + " mükemmel sayı değildir.");
        }
    }
}