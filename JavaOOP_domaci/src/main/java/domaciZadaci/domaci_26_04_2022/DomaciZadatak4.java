package domaciZadaci.domaci_26_04_2022;

import java.util.Scanner;

public class DomaciZadatak4 {
    public static void main(String[] args) {
        //Napisati program koj racuna z prema formuli: (x - y) na kvadrat. X i Y se unose sa tastature.

        Scanner s = new Scanner(System.in);

        System.out.print("Unesite vrednost x: ");
        int x = s.nextInt();

        System.out.print("Unesite vrednost y: ");
        int y = s.nextInt();
        int z = (x - y ) * (x - y);

        System.out.println("Vrednost formule za vas unos je: " + z);
    }
}
