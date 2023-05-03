import java.util.Scanner;
public class CALCULATOR {
    static void top(){
        System.out.print("Toplama işlemi");
        Scanner inp= new Scanner(System.in);
        int a,sonuc=0,i=1;
        while(true) {
            System.out.print(i+".sayıyı giriniz");
            a = inp.nextInt();
            sonuc+=a;
            if(sonuc>a) {
                System.out.println("= "+sonuc);
            }
            i++;
        }
    }
    static void neg(){
        Scanner inp= new Scanner(System.in);
        int a,b,c,sonuc=0,i=1;
        System.out.println("Çıkartma işlemi");
        System.out.println("ilk sayıyı giriniz.");
        a = inp.nextInt();
        System.out.println("ikinci sayı giriniz");
        b = inp.nextInt();
        sonuc=a-b;
        System.out.print("= "+sonuc);
        while(true) {
            System.out.println(" sayı giriniz");
            a = inp.nextInt();
            sonuc-=a;
            if(i>1) {
                System.out.println("= "+sonuc);
            }
            i++;
        }
    }
    static void carp(){
        Scanner inp= new Scanner(System.in);
        System.out.print("Çarpma işlemi");
        int a,sonuc=1,i=1;
        while(true) {
            System.out.print(i+".sayı giriniz");
            a = inp.nextInt();
            sonuc*=a;
            if(a==0){
                sonuc=0;
                System.out.println("");
            }
            if(i>1) {
                System.out.println("= "+sonuc);
                if(a==0){
                    sonuc=0;
                }
            }
            i++;
        }
    }
    static void bol(){
        Scanner inp= new Scanner(System.in);
        System.out.println("Bölme işlemi");
        int a,b,sonuc=1,i=1;
        System.out.print("1.Sayıyı giriniz");
        a = inp.nextInt();
        System.out.print("2.Sayıyı giriniz");
        b = inp.nextInt();
        sonuc=a/b;
        System.out.println("= "+sonuc);
        while(true) {
            System.out.print("sayı giriniz ");
            a = inp.nextInt();
            sonuc=a/=a;
            if(a==0){
                sonuc=0;
                System.out.println("belirsiz");
                break;
            }
            if(i>=1){
                System.out.println("= " + sonuc);
            }
            i++;
        }
    }
    static void us(){
        Scanner inp= new Scanner(System.in);
        int a,us,sonuc=1;
            System.out.println("sayı giriniz");
            a = inp.nextInt();
            System.out.print("üs giriniz");
            us = inp.nextInt();
            for(int i=1;i<=us;i++){
                sonuc*=a;
            }
            System.out.println("sonuc= "+sonuc);
            }
    static void facto(){
        Scanner inp= new Scanner(System.in);
        int a,sonuc=0;
        System.out.println("sayı giriniz");
        a = inp.nextInt();
        for(int i=a-1;i>0;i--){
            a*=i;
        }
        System.out.println("sonuc= "+a);
    }
    static void mod(){
        Scanner inp= new Scanner(System.in);
        int a,bolen,sonuc=0;
        System.out.println("sayı giriniz");
        a = inp.nextInt();
        System.out.println("bolen giriniz");
        bolen = inp.nextInt();
        sonuc=a%bolen;

        System.out.println("sonuc= "+sonuc);
    }
    static void dortgen(){
        Scanner inp= new Scanner(System.in);
        int a,b,alan,cevre;
        System.out.println("uzun kenar giriniz");
        a = inp.nextInt();
        System.out.println("kısa kenar giriniz");
        b = inp.nextInt();
        cevre=(a+b)*2;
        alan=a*b;
        System.out.println("alan= "+alan);
        System.out.println("çevre= "+cevre);
    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int select;
        String menu = "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme işlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0- Çıkış Yap";

        do {
            System.out.println(menu);
            System.out.print("Lütfen bir işlem seçiniz :");
            select = inp.nextInt();
            switch (select) {
                case 1:
                    top();
                    break;
                case 2:
                    neg();
                    break;
                case 3:
                    carp();
                    break;
                case 4:
                    bol();
                    break;
                case 5:
                    us();
                    break;
                case 6:
                    facto();
                    break;
                case 7:
                        mod();
                        break;
                case 8:
                    dortgen();
                    break;

                case 0:
                    break;
                default:
                    System.out.println("Yanlış bir değer girdiniz, tekrar deneyiniz.");
            }
        } while (select != 0);


    }
}
