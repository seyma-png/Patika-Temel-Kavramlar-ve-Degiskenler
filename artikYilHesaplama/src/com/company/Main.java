package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Yılı giriniz: ");
        int yil=input.nextInt();
        double hesap=yil%4;
        if(yil%100==0){
            if(yil%400==0){
                System.out.println(yil+" bir artık yıldır.");
            }
            else if(yil%400!=0){
                System.out.println(yil+" bir artık yıl deildir. ");
            }

        }
        else{
            if(yil%4==0){
                System.out.println(yil+" bir artık yıldır.");
            }
            else{
                System.out.println(yil+" bir artık yıl değildir. ");
            }
        }
    }
}
