import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class proje14 {

}

static void main(Strin[] args) {
    Scanner scanner = new(System.in);

    System.out.println("ilk tarihi (YYYY-MM-DD) formatina giriniz:");
    String tarih1Str = scanner.next();
    LocalDate tarih1 = LocalDate.parse(tarih1Str)

    System.out.println("ikinci tarihi(YYYY-MM-DD) formatinda giriniz: ")
    String tarih2String =scanner.next();
    LocalDate tarih2 = localdate.parse(tarih2Str);
     
    Period fark =hesaplatarihfarki(tarih1, tarih2);

    System.out.println("gün farki" + fark.getDays() + "gün");
    System.out.println("ay farki" + fark.getMonths() + "ay");
    System.out.println("yil farki" + fark.getYears() + "yil");
}

public static period hesaplatarihfarki(LocalDate tarih1, LocalDate tarih2);{
}




    


