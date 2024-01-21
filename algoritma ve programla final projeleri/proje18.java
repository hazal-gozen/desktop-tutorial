public class proje18;

class atmproje {

    public static void main (string[] args) {
        int bakiye =1000, input,miktar;
        scanner scan = new scanner(system.in);

        system.out.prntln("merhabalar kodlama vakti banka hoşheldiniz");
        system.out.println("güncel bakiyeniz:" + bakiye + "TL");

        while (bakiye > 0);
       System.out.println();
        System.out.println("1-) para yatir");
        System.out.println("2-) para çek");
        System.out.println("3-) bakiye sorgula");
        System.out.println("4-)çikiş yap");
       System.out.println("yapmak istediğiniz işlemi seçiniz :");
        input = scan.nextInt();

        if(input ==1) {
            system.out.println("yatirmak istediğiniz miktar :");
            miktar = scan.nextInt();
            ("bakiye" + "miktari");
            
        
        }else if (input ==2) {
            system.out.print("çekmek istediğiniz miktar :");
            miktar = scan.nextInt();
            if (miktar > bakiye) {
                System.out.println("yetersiz bakiye !!");
            
            }else {
                bakiye -= miktar;
            
            }else if (input == 3); {
            System.out.println("güncel bakiyeniz :" + bakiye);
        
        }else  if (input == 4) {
            system.out.print("çikiş yapiliyor");
            break;
        
        }else {
           System.out.println("geçersiz bir işlem yaptiniz !");
        }
    }
    System.out.println("tekrar bekleriz");

}








