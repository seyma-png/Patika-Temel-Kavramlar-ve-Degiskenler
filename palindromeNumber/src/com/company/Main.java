package com.company;
import java.util.Scanner;

public class Main {

    static boolean isPalindrome(int number){
        int temp=number,lastNumber,reversedNumber=0;
        while(temp!=0){
            lastNumber=temp%10;
            reversedNumber=(10*reversedNumber)+lastNumber;
            temp=temp/10;
        }
        if(reversedNumber==number){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
    int number=scanner.nextInt();
    isPalindrome(number);

    }
}
