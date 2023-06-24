package odevler;

import java.util.Scanner;

public class usHesabiYapanRecursive {
// Taban değeri giriniz :2 
// Üs değerini giriniz : 0
//Sonuç : 1
    
//Taban değeri giriniz : 2
//Üs değerini giriniz : 3
//Sonuç : 8
    
//Taban değeri giriniz : 5
//Üs değerini giriniz : 3
//Sonuç : 125    
    static int recurs(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Taban değerini giriniz : ");
        int base =scan.nextInt();
        System.out.print("Üs değerini giriniz : ");
        int exponent =scan.nextInt();
        int result =1;

        for (int i=1; i<=exponent;i++){
            result *= base;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("Sonuç : " + recurs());

    }
}
