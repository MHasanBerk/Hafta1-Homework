package Odev09;

public class Main {
    public static void main(String[] args) {
        boolean isPrime;

        for(int i = 2; i <= 100; i++){
            isPrime = true; //Her döngü de isPrime true olarak atanıyor.

            for(int j = 2; j < i; j++){ //İkinci döngüde i değerinin asal olup olmadığı kontrol ediliyor.
                if(i % j == 0){
                    isPrime = false; //Kendisinden küçük herhangi bir sayıya bölünüyorsa, false olarak atanıyor.
                    break;
                }
            }

            if(isPrime){
                System.out.println(i);
            }
        }
    }
}