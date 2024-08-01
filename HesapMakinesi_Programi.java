
import java.util.Scanner;

public class HesapMakinesi_Programi {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int devam = 1;
        while (devam==1) {
           
                System.out.println(
                        "yapmak istediğiniz işlemi giriniz : \nörn : \ntoplama ise + \ncarpa ise * \ncıkarma ise - \nbolme ise / yazınız");
                        String secim = scanner.next();
              
                while( (!secim.equals("+")&&!secim.equals("-")&&!secim.equals("*")&&!secim.equals("/"))) {
                System.out.println("geçersiz seçim tekrar seçiniz");
                secim=scanner.next();
                }
             
                System.out.print("1. sayiyi giriniz : ");
                int b_sayi = scanner.nextInt();
                System.out.print("2. sayiyi giriniz : ");
                int i_sayi = scanner.nextInt();
                if (secim.equals("/") && (i_sayi == 0)) {
                    System.out.println("sıfıra bölünemez tekrar deneyiniz");
                    continue;
                } else if (secim.equals("+")) {
                    System.out.println(b_sayi + i_sayi);
                 
                } else if (secim.equals("-")) {
                    System.out.println(b_sayi - i_sayi);
                   
                } else if (secim.equals("*")) {
                    System.out.println(b_sayi * i_sayi);
                    
                } else if (secim.equals("/")) {
                    System.out.println(b_sayi / i_sayi);
                    
                }
            System.out.println("başka bir işlem yapmak ister misiniz ? evetse : 1 hayirsa : 2 ye basiniz");
        devam = scanner.nextInt();
        
        
        }
        System.out.println("program sonlanıyor");
        scanner.close();

    }

}
