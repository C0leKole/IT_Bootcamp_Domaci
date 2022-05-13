package domaciZadaci.domaci_26_04_2022;

import java.util.Scanner;

public class DomaciZadatak7 {
    public static void main(String[] args) {
        //(za vezbanje) Napistai program koji od trocifreng celobrojnog broja a stampa zadnju cifru broja.
        //Primer: ako je a = 123 stapma se 3
        //	ako je a = 241 strampa se 1

        Scanner s = new Scanner(System.in);
        System.out.println("Unesite neki trocifreni broj: ");
        int a = s.nextInt();

        int p = a % 10;

        System.out.println("Zadnja cifra trocifrenog broja " + a + " je " + p);
    }
}
