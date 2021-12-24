package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Sayı giriniz: ");
        int number=input.nextInt();
        int total=0;
        boolean mukemmelSayi;
        for(int i=1;i<number;i++){
            if(number%i==0){
                total=total+i;
            }
        }
        if(total==number){
            System.out.println("Sayı mükemmel sayıdır.");
        }
        else{
            System.out.println("Sayı mükemmel sayı değildir.");
        }

    }
}
