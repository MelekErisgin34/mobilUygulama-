import java.util.Scanner;

public class ornek7 {
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.print("Birinci kenarı (a) girin: ");
            double a = scanner.nextDouble();

            System.out.print("İkinci kenarı (b) girin: ");
            double b = scanner.nextDouble();

            double c = Math.sqrt(a * a + b * b);

            System.out.println("(c): " + c);

            scanner.close();
    }
}
