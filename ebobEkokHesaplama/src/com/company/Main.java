package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("İlk sayıyı giriniz: ");
        int sayi1 = input.nextInt();
        System.out.println("İkinci sayıyı giriniz: ");
        int sayi2 = input.nextInt();
        int i = 2;
        int ebob = 1;
        int ekok=1;
        int carpim=sayi1*sayi2;
        while (i > 1) {
            while (sayi1 % i == 0 && sayi2 % i == 0) {
                if (i % 2 != 0 || i == 2) {
                    while (sayi1 % i == 0 && sayi2 % i == 0) {
                        ebob = ebob * i;
                        sayi1 = sayi1 / i;
                        sayi2 = sayi2 / i;
                        i++;
                    }
                }

            }
            i++;
        }
        ekok=(carpim/ebob);
        System.out.println("Ebob: " + ebob);
        System.out.println("Ekok: " + ekok);
    }
}
