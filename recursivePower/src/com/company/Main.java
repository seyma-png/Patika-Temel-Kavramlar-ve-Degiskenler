package com.company;
import java.util.Scanner;

public class Main {

    static int power(int base,int expo) {
        if (expo > 0) {
            return base * (power(base, expo - 1));
        }
        else{
            return 1;
        }
    }
    public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
    int base=scanner.nextInt();
    int expo=scanner.nextInt();
    int result= power(base,expo);
    System.out.println(result);
    }
}
