import java.util.Scanner;

public class hesapmakinesimetor {

    static int sum(int a, int b){
        int result = a+ b;
        System.out.println("Toplam : " + result);
        return result;
    }

    static int minus(int a, int b){
        int result = a - b;
        System.out.println("Çıkarma sonucu "+ result);
        return result;
    }

    static int times(int a,int b){
        int result = a * b;
        System.out.println("Çarpma Sonuc : " + result);
        return result;
    }

    static double divide(int a, int b){
        if (b == 0){
            System.out.println("ikinci sayı 0 farklı olmalı");
            return 0;
        }
        double result = a / b;
        System.out.println("Bölme Sonucu :" + result);
        return result;
    }

    static int power(int a,int b){
        int result = 1;
        for (int i=1; i<=b;i++){
            result *= a;
        }
        return result;
    }

    static int mod(int a,int b){
        return a % b;
    }

    static void calc(int a,int b){
        System.out.println("çevresi : " + (2* (a+b) ));
        System.out.println("alanı: "+ (a *b ));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int select;

        String menu = "1 - Toplama İşlemi \n "
                + "2 - Çıkarma İşlemi \n "
                + "3 - Çarpma İşlemi \n "
                + "4 - bölme İşlemi \n "
                + "5 - Üslü İşlemi \n "
                + "6 - Mod alma İşlemi \n "
                + "7 - Dikdörtgen Alan ve Çevre Hesabı \n "
                + "0 - ÇIKIŞ YAP";
        while (true){
            System.out.println(menu);
            System.out.print("işlem seçiniz: ");
            select = input.nextInt();

            if(select == 0){
                break;
            }

            System.out.print("ilk sayiyi giriniz: ");
            int a = input.nextInt();
            System.out.print("ikinci sayiyi giriniz: ");
            int b = input.nextInt();

            switch (select){
                case 1:
                    sum(a,b);
                    break;
                case 2:
                    minus(a,b);
                    break;
                case 3:
                    times(a,b);
                    break;
                case 4:
                    divide(a,b);
                    break;
                case 5:
                    System.out.println("üs hesabı :" + power(a,b));
                    break;
                case 6:
                    System.out.println("Mod İşlemi "+ mod(a,b));
                    break;
                case 7:
                    calc(a,b);
                    break;
                default:
                    System.out.println("geçersiz bir işlem girdiniz");
            }
        }
        System.out.println("Güle Güle");
    }
}
