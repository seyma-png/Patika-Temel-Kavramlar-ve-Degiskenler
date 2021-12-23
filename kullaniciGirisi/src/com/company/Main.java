package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String username,password;
        int secim;
        System.out.println("Kullanıcı adınız: ");
        username=input.nextLine();
        System.out.println("Şifrenizi giriniz: ");
        password=input.nextLine();
        if(username.equals("patika")&&password.equals("java123")){
            System.out.println("Giriş başarılı !");
        }
        else{
            System.out.println("Bilgileriniz hatalı !\n");
            System.out.println("Şifrenizi sıfırlamak ister misiniz?\n1-Evet\n2-Hayır");
            secim=input.nextInt();

            switch(secim){
                case 1:
                Scanner input2=new Scanner(System.in);
                System.out.println("Yeni şifrenizi giriniz: ");

                String newPassword=input2.nextLine();

                if(newPassword!="java123"){
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                }
                else{
                    System.out.println("Şifre oluşturuldu.");
                }
                break;
                case 2:
                System.out.println(" Tekrar giriş yapınız ");
            }

        }
    }
}
