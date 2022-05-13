package domaciZadaci.domaci_29_04_2022;

import java.util.Scanner;

public class DomaciZadatak1 {
    public static void main(String[] args) {

        //Napisati program koji za uneti broj x (smatrajte da korisnik unosi jednocifreni broj)
        // ispisuje tablicu mnozenja za taj broj.

        Scanner s = new Scanner(System.in);
        System.out.println("Unesite jednocifren broj x: ");

        int unos = s.nextInt();
        int tablica = 0;


        for (int i = 0; i <=9 ; i++) {

            tablica = unos * i;
            System.out.println(unos + " * " + i + " = " + tablica );

        }

    }
}
