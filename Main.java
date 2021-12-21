package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Matematik notunuz: ");
        int matNot=input.nextInt();
        System.out.println("Fizik notunuz: ");
        int fizikNot=input.nextInt();
        System.out.println("Kimya notunuz: ");
        int kimyaNot=input.nextInt();
        System.out.println("Türkçe notunuz: ");
        int turkceNot=input.nextInt();
        System.out.println("Tarih notunuz: ");
        int tarihNot=input.nextInt();
        System.out.println("Müzik notunuz: ");
        int muzikNot=input.nextInt();

        int toplamPuan=(matNot+fizikNot+kimyaNot+turkceNot+tarihNot+muzikNot)/6;
        System.out.println("Ortalamanız: "+toplamPuan);




    }
}
