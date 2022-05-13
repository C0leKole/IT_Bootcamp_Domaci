package p09_05_2022;

import java.util.Scanner;

public class DomaciZadatak2 {
    public static void main(String[] args) {
        //Napisati program koji ucitava brojeva od korisnika i za svaki broj prikazuje apsolutnu vrednost sve dok se
        // ne unese nula.
        //Primer izvrsenja:
        //Unesite broj: 3
        //Apsolutna vrednost je 3
        //Unesite broj: -1
        //Apsolutna vrednost je 1
        //Unesite broj: 0
        //Kraj programa jer je uneta nula.

        Scanner s = new Scanner(System.in);
        boolean tacno = true;

        while (tacno) {
            System.out.println("Unesite broj: ");
            int broj = s.nextInt();

            if (broj < 0) {
                broj = broj * -1;
                System.out.println("Apsolutna vrednost je " + broj);
            } else if (broj > 0) {
                broj = broj;
                System.out.println("Apsolutna vrednost je " + broj);
            } else {
                tacno = false;
                System.out.println("Kraj programa jer je uneta nula");
            }

        }



    }
}
