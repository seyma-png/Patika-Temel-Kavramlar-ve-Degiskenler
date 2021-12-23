package com.company;
import java.util.Scanner;

//C(n,r) = n! / (r! * (n-r)!)
public class Main {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int nFaktor=1,rFaktor=1,nEksiRFaktor=1;
        int kombinasyon;
        System.out.println("n eleman sayısını giriniz: ");
        int n=input.nextInt();
        System.out.println("r sayısını giriniz: ");
        int r=input.nextInt();
        for(int i=1;i<=n;i++){
            nFaktor*=i;
        }
        for(int i=1;i<=r;i++){
            rFaktor*=i;
        }
        for(int i=1;i<=n-r;i++){
            nEksiRFaktor*=i;
        }
        kombinasyon=nFaktor/(rFaktor*nEksiRFaktor);
        System.out.println(kombinasyon);
    }
}
