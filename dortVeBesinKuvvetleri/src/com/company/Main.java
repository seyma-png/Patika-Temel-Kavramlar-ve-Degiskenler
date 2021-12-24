package com.company;
import java.util.Scanner;
/*Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz.

 */

public class Main {

    public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        int sayi=input.nextInt();
        int toplam=0;
        for(int i=0;i<=sayi;i++){
            if(i%4==0 && i%5==0){
                toplam=toplam+i;
            }
        }
        System.out.println("Girilen sayıya kadar olan\n4 ve 5' in kuvvetlerinin toplamı: "+toplam);
    }
}
