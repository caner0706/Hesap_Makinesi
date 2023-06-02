package hesapmakinesi;

import java.util.Scanner;

public class HesapMakinesi {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scanner = new Scanner(System.in);
        
        double sonuc = 0;
        
        System.out.println("Hesap Makinesi Uygulamasına Hoş Geldiniz...");
        System.out.println("1 - Toplama \n"
                         + "2 - Çıkarma \n"
                         + "3 - Çarpma \n"
                         + "4 - Bölme");
                
        System.out.print("Lütfen Yapmak İstediğiniz İşlemi Seçiniz : ");
        int secim = scanner.nextInt();
        
        System.out.print("Lütfen Birinci Sayısı Girin : ");
        double sayi1 = scanner.nextDouble();
        System.out.print("Lütfen İkinci Sayıyı Girin : ");
        double sayi2 = scanner.nextDouble();
        
        switch(secim){
            case 1 :
                sonuc = (sayi1 + sayi2);
                System.out.println("Sonuç : " + sonuc);
                break;
            case 2:
                sonuc = (sayi1 - sayi2);
                System.out.println("Sonuç : " + sonuc);
                break;
            case 3 : 
                sonuc = (sayi1 * sayi2);
                System.out.println("Sonuç : " + sonuc);
                break;
            case 4 : 
                sonuc = (sayi1 / sayi2);
                System.out.println("Sonuç : " + sonuc);
                break;    
            default : 
                break;
        }
    }   
}
