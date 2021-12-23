package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
    int sayi=input.nextInt();
    for(int i=1;i<=sayi;i*=4){
        System.out.println(i);
    }
    for(int i=1;i<=sayi;i*=5){
        System.out.println(i);
    }
    }
}
