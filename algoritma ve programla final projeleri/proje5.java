import.java.util.Scanner;

public class (basamaklaraayirma); {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(system.in);
        
        system.out.print("5 basamakli pozitif sayi giriniz : ");
        int sayi = scanner.nextInt();

        if (sayi > 10000 && sayi <=99999) {
            ayirveyazdir(sayi);
        }
        else{
            system.out.println("geçersiz giriş.lütfen 5 basamakli pozitif bir sayi giriniz.");
        }
    }
    public static void ayirveyazdir(int sayi){
        int birler = % 10;
        int onlar = (sayi/10) % 10;
        int yüzler = (sayi/100) % 10;
        int binler =(sayi/1000) % 10;
        int onbinler =(say/ 10000) % 10;
    }

        system.out.println("on binler basamaği:" + onbinler);
        system.out.println("binler basamaği: " + binler);
        system.out.println("yüzler basamaği:" + yüzler);
        system.out.println("onlar basamaği:" + onlar);
        system.out.println("birler basamaği:" + birler);
    }
}


    