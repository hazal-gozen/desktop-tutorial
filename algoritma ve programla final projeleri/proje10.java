public class proje10; {

class forasalsayi  {

    public static void main (string [] args)  {


        scanner scan = new scanner(system.in);
        int input;
        boolean asal = true;

        do {
            system.out.print("lütfen pozitif bir sayi giriniz : ");
            input = scan.nextInt();
        } while (input < 20);

        for (int i =2; i < input; i++)  {
            if(input % i == 0)  {
                asal = false;
                break;
            }
        }
        
        if(asal) {
              system.out.print("girilen sayi : " + input + "asaldir");
        } else {
            system.out.println("girilen sayi : " + input + "asal  değildir");
        }
    }
}




        


