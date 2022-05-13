package domaciZadaci.domaci_27_04_2022;

import java.util.Scanner;

public class DomaciZadatak2 {
    public static void main(String[] args) {

        //2. Napisati program koji proverava da li je kliknuto u okviru login forme za web stranicu.
        // Korisnik unosi x i y koordinate za T1, T2 i M. Ispisati odgovarajuce poruke.

        Scanner s = new Scanner(System.in);
        System.out.println("Unesite x1 i y1: ");
        int tx1 = s.nextInt();
        int ty1 = s.nextInt();

        System.out.println("Unesite x2 i y2: ");
        int tx2 = s.nextInt();
        int ty2 = s.nextInt();

        System.out.println("Unesite my i my: ");
        int mx = s.nextInt();
        int my = s.nextInt();

        if ( mx > tx1 && mx > ty1 && mx <tx2 && my < ty2 ) {
            System.out.println("Klik je u okviru login forme!");
        } else {
            System.out.println("Klik nije u okviru login forme!");
        }



    }
}
