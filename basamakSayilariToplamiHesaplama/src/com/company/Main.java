package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner input=new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        int sayi=input.nextInt();
        int toplam=0;
        int adet=0;

        while(sayi != 0)
        {
            toplam=(sayi%10)+toplam;
            sayi /= 10;
            ++adet;
        }
        System.out.println(toplam);
    }
}
