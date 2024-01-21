public class proje12; {

class metinkaydirma {
     
    public static void main(String[] args) {
        scanner scanner = new scanner(system.in);

        system.out.print("lütfen bir metin girin: ");
        String metin = scanner.nextline();

        system.out.print("kaç basamak kaydrmak istediğinizi girin");
        int kaydirmamiktari = scanner.nextInt();

        String kaydirilmismetinsaga = sagkaydir(metin,  kaydirmamiktari);
        String kaydirilmismetinsola = solakaydir(metin, kaydirmamiktari);

        System.out.println("sağa kaydirilmiş metin: " + kaydirilmismetinsaga);
        System.out.println("sola kaydirilmis metim: " + kaydirilmismetinsola);
     }

     public static string  sagkaydir(string metin, int kaydirmamiktari) {
        int uzunluk = metin.lenght();
        kaydirmamiktari = kaydirmamiktari %uzunluk;

        return metin.substring(uzunluk - kaydirmamiktari) + metin.substring(0, uzunluk - kaydirmamiktari);
     }
     public static string solakaydir(string metin, int kaydirmamiktari) {
        int uzunluk = metin.lenght();
        kaydirmamiktari = kaydirmamiktari % uzunluk;

        return metin.substring(kaydirmamiktari) + metin.substring(0, kaydirmamiktari);
     }
    
    }
   
   
        


