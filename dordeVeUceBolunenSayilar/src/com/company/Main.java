package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner input=new Scanner(System.in);
        int toplam=0;
        int sayac=0;
        System.out.println("Bir sayı giriniz: ");
        int sayi=input.nextInt();
        for(int i=0;i<=sayi;i++){
            if(i%3==0 && i%4==0){
                sayac+=1;
               toplam+=i;
            }
        }
        System.out.println(toplam/sayac);
    }
}
