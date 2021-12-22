package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
    System.out.println("Üçgenin ilk kenar uzunluğunu giriniz: ");
    int kenar1=input.nextInt();
    System.out.println("Üçgenin ikinci kenar uzunluğunu giriniz: ");
    int kenar2=input.nextInt();
    System.out.println("Üçgenin üçüncü kenar uzunluğunu giriniz: ");
    int kenar3=input.nextInt();
    double u=(kenar1+kenar2+kenar3)/2;
    double alanKare=u*(u-kenar1)*(u-kenar2)*(u-kenar3);
    double alan=Math.sqrt(alanKare);
    System.out.println("Üçgenin alanı: "+alan);

    }
}
