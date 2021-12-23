package com.company;
import java.util.Scanner;

/*Koç Burcu : 21 Mart - 20 Nisan
Boğa Burcu : 21 Nisan - 21 Mayıs
İkizler Burcu : 22 Mayıs - 22 Haziran
Yengeç Burcu : 23 Haziran - 22 Temmuz
Aslan Burcu : 23 Temmuz - 22 Ağustos
Başak Burcu : 23 Ağustos - 22 Eylül
Terazi Burcu : 23 Eylül - 22 Ekim
Akrep Burcu : 23 Ekim - 21 Kasım
Yay Burcu : 22 Kasım - 21 Aralık
Oğlak Burcu : 22 Aralık - 21 Ocak
Kova Burcu : 22 Ocak - 19 Şubat
Balık Burcu : 20 Şubat - 20 Mart
*/
//her ay için ayrı yazılacak .
public class Main {

    public static void main(String[] args) {
	    Scanner input=new Scanner(System.in);
        Scanner input2=new Scanner(System.in);
        System.out.println("Doğum ayınızı yazınız: ");
        String dogumAyi=input.nextLine();
        System.out.println("Doğum gününüzü giriniz: ");
        int dogumGunu=input2.nextInt();
        if(dogumGunu<=31&&dogumGunu>=21&&dogumAyi.equals("Mart")){
            System.out.println("Burcunuz Koç. ");
        }
        else if(dogumGunu>=1&&dogumGunu<=20&&dogumAyi.equals("Nisan")){
            System.out.println("Burcunuz Koç. ");
        }
        else if(dogumGunu>=21&&dogumGunu<=30&&dogumAyi.equals("Nisan")){
            System.out.println("Burcunuz Boğa. ");
        }
        else if(dogumGunu>=1&&dogumGunu<=21&&dogumAyi.equals("Mayıs")){
            System.out.println("Burcunuz Boğa. ");
        }
        else if(dogumGunu>=22&&dogumGunu<=31&&dogumAyi.equals("Mayıs")){
            System.out.println("Burcunuz İkizler. ");
        }
        else if(dogumGunu>=1&&dogumGunu<=22&&dogumAyi.equals("Haziran")){
            System.out.println("Burcunuz İkizler. ");
        }
        else if(dogumGunu>=23&&dogumGunu<=30&&dogumAyi.equals("Haziran")){
            System.out.println("Burcunuz Yengeç. ");
        }
        else if(dogumGunu>=1&&dogumGunu<=22&&dogumAyi.equals("Temmuz")){
            System.out.println("Burcunuz Yengeç. ");
        }
        else if(dogumGunu>=23&&dogumGunu<=31&&dogumAyi.equals("Temmuz")){
            System.out.println("Burcunuz Aslan. ");
        }
        else if(dogumGunu>=1&&dogumGunu<=22&&dogumAyi.equals("Ağustos")){
            System.out.println("Burcunuz Aslan. ");
        }
        else if(dogumGunu>=23&&dogumGunu<=31&&dogumAyi.equals("Ağustos")){
            System.out.println("Burcunuz Başak. ");
        }
        else if(dogumGunu>=1&&dogumGunu<=22&&dogumAyi.equals("Eylül")){
            System.out.println("Burcunuz Başak. ");
        }
        else if(dogumGunu>=23&&dogumGunu<=30&&dogumAyi.equals("Eylül")){
            System.out.println("Burcunuz Terazi. ");
        }
        else if(dogumGunu>=1&&dogumGunu<=22&&dogumAyi.equals("Ekim")){
            System.out.println("Burcunuz Terazi. ");
        }
        else if(dogumGunu>=23&&dogumGunu<=31&&dogumAyi.equals("Ekim")){
            System.out.println("Burcunuz Akrep. ");
        }
        else if(dogumGunu>=1&&dogumGunu<=21&&dogumAyi.equals("Kasım")){
            System.out.println("Burcunuz Akrep. ");
        }
        else if(dogumGunu>=22&&dogumGunu<=30&&dogumAyi.equals("Kasım")){
            System.out.println("Burcunuz Yay. ");
        }
        else if(dogumGunu>=1&&dogumGunu<=21&&dogumAyi.equals("Aralık")){
            System.out.println("Burcunuz Yay. ");
        }
        else if(dogumGunu>=22&&dogumGunu<=31&&dogumAyi.equals("Aralık")){
            System.out.println("Burcunuz Oğlak. ");
        }
        else if(dogumGunu>=1&&dogumGunu<=21&&dogumAyi.equals("Ocak")){
            System.out.println("Burcunuz Oğlak. ");
        }
        else if(dogumGunu>=22&&dogumGunu<=30&&dogumAyi.equals("Ocak")){
            System.out.println("Burcunuz Kova. ");
        }
        else if(dogumGunu>=1&&dogumGunu<=19&&dogumAyi.equals("Şubat")){
            System.out.println("Burcunuz Kova. ");
        }
        else if(dogumGunu>=20&&dogumGunu<=29&&dogumAyi.equals("Şubat")){
            System.out.println("Burcunuz Balık. ");
        }
        else if(dogumGunu>=1&&dogumGunu<=20&&dogumAyi.equals("Mart")){
            System.out.println("Burcunuz Balık. ");
        }


    }
}
