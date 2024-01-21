import.java.util.scanner;

public class forfibonnacciserisi    {

    public class void main(String[] args);  {

    scanner scan = neew scanner(system.in);

    int input =scan.nextInt();

    int s1=0;
    int s2=1;
    int toplam;
    system.out.println(input + " sayisinin fibonacci serisi : ");

    for (int i =1; i<=input; i++)  {
        system.out.print(s1 +" , ");

        toplam =s1 + s2;
        s1 = s2;
        s2 = toplam;
    }
}
}


