package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double armut=2.14;
        double elma=3.67;
        double domates=1.11;
        double muz=0.95;
        double patlican=5.00;

        System.out.println("Armut kaç kilogram? ");
        double armutKg=input.nextDouble();
        System.out.println("Elma kaç kilogram? ");
        double elmaKg=input.nextDouble();
        System.out.println("Domates kaç kilogram? ");
        double domatesKg=input.nextDouble();
        System.out.println("Muz kaç kilogram? ");
        double muzKg=input.nextDouble();
        System.out.println("Patlıcan kaç kilogram? ");
        double patlicanKg=input.nextDouble();

        double toplamTutar=(armutKg*armut)+(elmaKg*elma)+(domatesKg*domates)+(muzKg*muz)+(patlicanKg*patlican);
        System.out.println("Ödenecek toplam tutar: "+toplamTutar);


    }
}
