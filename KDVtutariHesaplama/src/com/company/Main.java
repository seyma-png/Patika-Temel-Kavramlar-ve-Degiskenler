package com.company;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double kdv=0.18;
        Scanner input=new Scanner(System.in);
        System.out.println("Tutarı giriniz: ");
        double tutar=input.nextDouble();
        double kdvTutar=(tutar*18)/100;
        double kdvliTutar=tutar+tutar*kdv;
        System.out.println("KDV' siz fiyat: "+tutar);
        System.out.println("KDV' li fiyat: "+kdvliTutar);
        System.out.println("KDV Tutarı: "+kdvTutar);


    }
}
