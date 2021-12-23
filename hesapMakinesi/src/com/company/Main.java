package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner input=new Scanner(System.in);
        int sayi1,sayi2,select;
        System.out.println("İlk sayıyı giriniz: ");
        sayi1=input.nextInt();
        System.out.println("İkinci sayıyı giriniz: ");
        sayi2=input.nextInt();
        System.out.println("İşlem seçiniz:\n1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        select=input.nextInt();
        switch (select){
            case 1:
                System.out.println(sayi1+sayi2);
                break;
            case 2:
                System.out.println(sayi1-sayi2);
                break;
            case 3:
                System.out.println(sayi1*sayi2);
                break;
            case 4:
                System.out.println(sayi1/sayi2);
                break;
        }

    }
}
