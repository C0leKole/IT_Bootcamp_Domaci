package domaciZadaci.domaci_29_04_2022;

import java.util.Scanner;

public class DomaciZadatak2 {
    public static void main(String[] args) {

        //Napisati program koji od korisnika ucitava N brojeva i sabira samo parne brojeve.
        // Na kraju programa prikazati sumu.

        Scanner s = new Scanner(System.in);
        System.out.println("Unesite broj N:");
        int n = s.nextInt();
        int suma = 0;



        for (int i = 0; i < n; i++) {
            System.out.println("Unesite brojeve: ");
            int x1 = s.nextInt();

            if ( x1 % 2 == 0) {
                suma = suma + x1;

            }
        }
        System.out.println("Suma brojeva koje ste uneli je: " + suma);
    }
}
