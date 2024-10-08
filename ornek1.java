import java.util.Scanner;

public class ornek1 {
    public static void main(String[] args) {
        int sayi1,sayi2,ortalama;
        Scanner oku=new Scanner(System.in);

        System.out.println("sayi1 gir");
        sayi1=oku.nextInt();

        System.out.println("sayi2 gir");
        sayi2=oku.nextInt();
        ortalama=(sayi1+sayi2)/2;
        System.out.println("Ortalama: "+ortalama);


    }
}
