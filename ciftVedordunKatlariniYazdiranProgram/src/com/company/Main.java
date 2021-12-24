package com.company;
import java.util.Scanner;
/*Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve
girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.
*/

public class Main {

    public static void main(String[] args) {
	    Scanner input=new Scanner(System.in);
        int toplam=0;
        System.out.println("Sayı giriniz: ");
        int sayi=input.nextInt();
        while(sayi%2==0) {
            System.out.println("Tek bir sayı giriniz: ");
            sayi = input.nextInt();
        }
        if(sayi%2!=0){
            for(int i=0;i<=sayi;i++) {
                if (i % 2 == 0 && i % 4 == 0) {
                    toplam = toplam + i;
                }
            }
            }
        System.out.println("Toplam: "+toplam);
        }



    }

