package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double ucret;
        System.out.println("Gideceğiniz mesafeyi km olarak giriniz: ");
        double mesafe = input.nextDouble();
        System.out.println("Yaşınızı giriniz: ");
        int yas = input.nextInt();
        System.out.println("Yolculuk tipinizi giriniz:\n1-Tek Yön\n2-Gidiş-Dönüş ");
        int secim = input.nextInt();
        if (mesafe < 1 || yas < 0 || secim != 1 && secim != 2) {
            System.out.println("Hatalı veri girdiniz. ");
        }
        ucret = mesafe * 0.10;

        if (secim == 2) {
            ucret=ucret-ucret*0.20;
            if (yas < 12) {
                ucret = ucret - ucret * 0.50;
            }
            else if (yas > 12 && yas < 24) {
                ucret = ucret - ucret * 0.10;
            }
            else if (yas > 65) {
                ucret = ucret - ucret * 0.30;
            }


        }
        else if(secim==1){
            if (yas < 12) {
                ucret = ucret - ucret * 0.50;
            }
            else if (yas > 12 && yas < 24) {
                ucret = ucret - ucret * 0.10;
            }
            else if (yas > 65) {
                ucret = ucret - ucret * 0.30;
            }

        }
        System.out.println("Ödeyeceğiniz tutar: "+ucret);
    }
}
