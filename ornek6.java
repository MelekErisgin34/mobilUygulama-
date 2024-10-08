import java.util.Scanner;

public class ornek6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Personel maaşını girin: ");
        double maas = scanner.nextDouble();

        System.out.print("Zam oranını yüzde olarak girin: ");
        double zamOrani = scanner.nextDouble() / 100;

        double yeniMaas = maas * (1 + zamOrani);

        System.out.println("Yeni maaş: " + yeniMaas);

        scanner.close();
    }
}
