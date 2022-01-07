package com.company;
import java.util.Scanner;

public class Main {
    static int i=2;
    static boolean isPrime(int n){

        if(i<=n/2) {
            if(n%i==0) {
                return false;
            }
        }
        else if(i>n/2){
            return true;
        }
        i++;
        return (isPrime(n));
    }
    public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
    int n=scanner.nextInt();
    boolean result=isPrime(n);
    System.out.println(result);

    }
}
