package com.company;
import java.util.Scanner;

public class Main {
/*Sıcaklık 5'den küçük ise "Kayak" yapmayı öner.
Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.
*/

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Hava sıcaklığını giriniz: ");
        int havaSicakligi=input.nextInt();
        if(havaSicakligi<5){
            System.out.println("Kayak önerebilirim.");
        }
        else if(havaSicakligi>5&&havaSicakligi<15){
            System.out.println("Sinemaya gidebilirsiniz bence.");
        }
        else if(havaSicakligi>15&&havaSicakligi<25){
            System.out.println("Piknik öneriyorum.");
        }
        else if(havaSicakligi>25){
            System.out.println("Bu sıcakta yüzme güzel olabilir.");
        }


    }
}
