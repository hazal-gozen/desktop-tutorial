package sayibulma;

import java.util.Scanner;

public class sayibulma {
     
    public static void main(String[] args) {

        int[] dizi = new int[10];

        Scanner scan = new Scanner(system.in);
         
        int i, en _buyuk;

        for(i=0;i<10;i++){
            dizi[i]= scan.nextint();
        }    

        en_buyuk = dizi[0];
        for(i=1;i<10;i++){
            if(dizi[i]>en_buyuk) en_buyuk=dizi[i];

        }
        
        system.out.println("en büyük eleman = + en-büyük");

    }

}
