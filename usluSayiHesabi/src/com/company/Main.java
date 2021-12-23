package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int sonuc=1;
        Scanner input = new Scanner(System.in);
        System.out.println("Üssü alınacak sayıyı giriniz: ");
        int sayi = input.nextInt();
        System.out.println("Üssü giriniz: ");
        int us = input.nextInt();
        for (int i = 1; i <= us;i++) {
            sonuc*=sayi;
        }
        System.out.println("Sonuç: "+sonuc);
    }
}
