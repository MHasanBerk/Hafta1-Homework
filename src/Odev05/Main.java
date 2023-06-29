package Odev05;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Yıl giriniz: ");
        int year = scan.nextInt();
        boolean isLeapYear = false;

        if(year % 100 == 0){
            if(year % 400 == 0){
                isLeapYear = true;
            }
        } else if (year % 4 == 0) {
            isLeapYear = true;
        }

        if(isLeapYear){
            System.out.println(year + " yılı bir artık yıldır.");
        }else{
            System.out.println(year + " yılı bir artık yıl değildir.");
        }
    }
}
