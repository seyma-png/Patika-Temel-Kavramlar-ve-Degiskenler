package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
        System.out.println("n sayısını giriniz: ");
        int n=input.nextInt();
        double toplam=0;
        for(int i=1;i<=n;i++){
            toplam+=1.0/i;
        }
        System.out.println(toplam);
    }
}
