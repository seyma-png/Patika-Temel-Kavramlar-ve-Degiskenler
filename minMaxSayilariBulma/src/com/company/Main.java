package com.company;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*Java ile klavyeden girilen N tane sayma sayısından en büyük ve en küçük sayıları bulan
ve bu sayıları ekrana yazan programı yazın.
*/

public class Main {

    public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
        System.out.println("Kaç sayı gireceksiniz? ");
        int n=input.nextInt();
        List<Integer> myList = new ArrayList<Integer>();
        for(int i=1;i<n+1;i++){
            System.out.println(i+". Sayıyı giriniz: ");
            int sayi=input.nextInt();
            myList.add(sayi);
        }
        int tempMax=myList.get(1);
        int tempMin= myList.get(0);
        for(int i=0;i<n-1;i++){
            if(myList.get(i)<myList.get(i+1)){
                tempMin=myList.get(i);
                tempMax=myList.get(i+1);
            }
            else if(myList.get(i)>myList.get(i+1)){
                tempMin=myList.get(i+1);
                tempMax=myList.get(i);
            }
        }
        System.out.println("En küçük sayı: "+tempMin);
        System.out.println("En büyük sayı: "+tempMax);
    }
}
