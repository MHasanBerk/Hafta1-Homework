package Odev02;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double armutKg, elmaKg, domatesKg, muzKg, patlicanKg;

        double  armut = 2.14,
                elma = 3.67,
                domates = 1.11,
                muz = 0.95,
                patlican = 5.00,
                toplam;

        System.out.print("Armut kaç kilo ? : ");
        armutKg = input.nextDouble();

        System.out.print("Elma kaç kilo ? : ");
        elmaKg = input.nextDouble();

        System.out.print("Domates kaç kilo ? : ");
        domatesKg = input.nextDouble();

        System.out.print("Muz kaç kilo ? : ");
        muzKg = input.nextDouble();

        System.out.print("Patlıcan kaç kilo ? : ");
        patlicanKg = input.nextDouble();

        toplam = (armut * armutKg) + (elma * elmaKg) + (domates * domatesKg)+ (muz * muzKg) + (patlican * patlicanKg);
        System.out.printf("Toplam tutar: %.2f", toplam);
    }
}
