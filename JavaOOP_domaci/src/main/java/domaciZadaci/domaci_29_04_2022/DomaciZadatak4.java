package domaciZadaci.domaci_29_04_2022;

import java.util.Scanner;

public class DomaciZadatak4 {
    public static void main(String[] args) {
        //Napisati program koji od korisnika ucitava N jednocifrenih brojeva i od njih formira rezultujuci broj
        // kao na primeru
        //Unesite N: 5
        //Unesite broj: 1
        //Unesite broj: 2
        //Unesite broj: 0
        //Unesite broj: 4
        //Unesite broj: 1
        //Rezultujuci broj je 12041

        Scanner s = new Scanner(System.in);
        System.out.println("Unesite N: ");
        int n = s.nextInt();


        String rezultujuciBroj = "";

        for (int i = 0; i <n ; i++) {
            System.out.println("Unesite broj: ");
            int brojevi = s.nextInt();

            rezultujuciBroj += brojevi;






        } System.out.print("Rezultujuci broj je: " + rezultujuciBroj);
    }
}