package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
        System.out.println("Doğum yılınızı giriniz: ");
        int dogumYil=input.nextInt();
        int chinaZodiac=dogumYil%12;
        if(chinaZodiac==0){
            System.out.println("Çin zodyağınız Maymun. ");
        }
        else if(chinaZodiac==1){
            System.out.println("Çin zodyağınız Horoz. ");
        }
        else if(chinaZodiac==2){
            System.out.println("Çin zodyağınız Köpek. ");
        }
        else if(chinaZodiac==3){
            System.out.println("Çin zodyağınız Domuz. ");
        }
        else if(chinaZodiac==4){
            System.out.println("Çin zodyağınız Fare. ");
        }
        else if(chinaZodiac==5){
            System.out.println("Çin zodyağınız Öküz. ");
        }
        else if(chinaZodiac==6){
            System.out.println("Çin zodyağınız Kaplan. ");
        }
        else if(chinaZodiac==7){
            System.out.println("Çin zodyağınız Tavşan. ");
        }
        else if(chinaZodiac==8){
            System.out.println("Çin zodyağınız Ejderha. ");
        }
        else if(chinaZodiac==9){
            System.out.println("Çin zodyağınız Yılan. ");
        }
        else if(chinaZodiac==10){
            System.out.println("Çin zodyağınız At. ");
        }
        else if(chinaZodiac==11){
            System.out.println("Çin zodyağınız Koyun. ");
        }
    }
}
