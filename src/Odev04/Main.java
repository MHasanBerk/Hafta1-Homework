package Odev04;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int birthYear;
        String zodiac;
        System.out.print("Doğum yılınızı giriniz: ");
        birthYear = input.nextInt();

        switch (birthYear % 12) {
            case 0 -> zodiac = "Maymun";
            case 1 -> zodiac = "Horoz";
            case 2 -> zodiac = "Köpek";
            case 3 -> zodiac = "Domuz";
            case 4 -> zodiac = "Fare";
            case 5 -> zodiac = "Öküz";
            case 6 -> zodiac = "Kaplan";
            case 7 -> zodiac = "Tavşan";
            case 8 -> zodiac = "Ejderha";
            case 9 -> zodiac = "Yılan";
            case 10 -> zodiac = "At";
            case 11 -> zodiac = "Koyun";
            default -> zodiac = null;
        }

        System.out.print("Çin Zodyağı Burcunuz: " + zodiac);
    }
}
