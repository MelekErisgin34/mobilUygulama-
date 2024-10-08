import java.util.Scanner;

public class ornek2 {
    public static void main(String[] args){
    int kisakenar,uzunkenar,alan,cevre;
    Scanner oku=new Scanner(System.in);

        System.out.println("kisakenar gir");
         kisakenar=oku.nextInt();

        System.out.println("uzunkenar gir");
         uzunkenar=oku.nextInt();

         alan=kisakenar*uzunkenar;
         System.out.println("alan"+alan );

        cevre=(kisakenar+uzunkenar)*2;
        System.out.println("cevre: " +cevre);
    }
}
