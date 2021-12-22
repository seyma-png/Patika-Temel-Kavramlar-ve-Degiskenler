package com.company;
import java.util.Scanner;

public class Main {
    //(𝜋 * (r*r) * 𝛼) / 360
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double pi=3.14;
        System.out.println("Dairenin yarıçapını giriniz: ");
        double r=input.nextDouble();
        System.out.println("Daire diliminin merkez açısını giriniz: ");
        double alpha=input.nextDouble();
        double alan=(pi*r*r*alpha)/360;
        System.out.println("Daire diliminin alanı: "+alan);


    }
}
