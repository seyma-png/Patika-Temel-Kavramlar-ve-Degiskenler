package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int averageBolen = 5;
        System.out.println("Matematik notu: ");
        int matNot = input.nextInt();
        System.out.println("Dil ve Anlatım notu: ");
        int dilAnlatimNot = input.nextInt();
        System.out.println("Fizik notu: ");
        int fizikNot = input.nextInt();
        System.out.println("Kimya notu: ");
        int kimyaNot = input.nextInt();
        System.out.println("Biyoloji notu: ");
        int biyolojiNot = input.nextInt();

        if (matNot < 0 || matNot > 100) {
            matNot=0;
            averageBolen--;
        }

        if (dilAnlatimNot < 0 || dilAnlatimNot > 100) {
            dilAnlatimNot=0;
            averageBolen--;
        }

        if (fizikNot < 0 || fizikNot > 100) {
            fizikNot=0;
            averageBolen--;
        }
        if (kimyaNot < 0 || kimyaNot > 100) {
            kimyaNot=0;
            averageBolen--;
        }
        if (biyolojiNot < 0 || biyolojiNot > 100) {
            biyolojiNot=0;
            averageBolen--;
        }


        double average = (matNot + dilAnlatimNot + fizikNot + kimyaNot + biyolojiNot) / averageBolen;
        if(average>=55){
            System.out.println("Ortalamanız: "+average);
            System.out.println("Sonuç: Geçtiniz. ");

        }
        else{
            System.out.println("Ortalamanız: "+average);
            System.out.println("Sonuç: Kaldınız. ");
        }
    }
}
