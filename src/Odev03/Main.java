package Odev03;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age, ticketType, km;
        double  total;
        boolean isDoubleWay; //true: Tek Yön, false: Gidiş-Dönüş

        System.out.print("Mesafeyi km türünden giriniz: ");
        km = input.nextInt();
        System.out.print("Yaşınızı giriniz: ");
        age = input.nextInt();
        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
        ticketType = input.nextInt();

        if(km > 0 && age > 0 && (ticketType == 1 || ticketType == 2)){
            total = km * 0.10;
            isDoubleWay = ticketType == 2;

            if(age < 12){
                total -= total * 0.5;
            }else if(age <= 24){
                total -= total * 0.1;
            } else if (age >= 65) {
                total -= total * 0.3;
            }

            if(isDoubleWay) {
                total -= total * 0.2;
                total *= 2;
            }

            System.out.println("Toplam tutar: " + total);
        }else{
            System.out.println("Hatalı Giriş!");
        }
    }
}
