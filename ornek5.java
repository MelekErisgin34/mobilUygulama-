import java.util.Scanner;

public class ornek5 {

         public static void main(String[] args) {
             Scanner scanner = new Scanner(System.in);

             System.out.print("Mevcut maaşını girin: ");
             double maas = scanner.nextDouble();
             double zamoranı = 43. / 100;
             double yeniMaas = maas + (maas * 0.43);

             System.out.println("Yeni maaş: "+yeniMaas);
             scanner.close();

        }


    }


