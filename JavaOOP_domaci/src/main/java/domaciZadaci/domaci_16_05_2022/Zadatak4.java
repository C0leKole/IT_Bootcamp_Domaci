package domaciZadaci_16_05_2022;

import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {
        //Metoda prima dva parametra N i karakter za stampu. Metoda stampa N karaktera.
        //Ako se za N prosledi 5 i za karakter prosledi npr kosa crta (/) stampa se=>
        //          / / / / /
        stampaKosaCrta();

    }
    static void stampaKosaCrta () {
        String karakter;
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite N: ");
        int n = s.nextInt();
        System.out.println("Unesite karakter: ");
        karakter = s.next();

        for (int i = 0; i <n ; i++) {

            System.out.print(karakter + " ");

        }

    }
}
