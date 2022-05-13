package domaciZadaci.domaci_10_05_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class DomaciZadatak2 {
    public static void main(String[] args) {
        //2.Zadatak
        //Napisati program koji ucitava niz A duzine N, i koji nakon unosa niz A
        // stampa sve elemente niza koji su veci od nule.
        //Primer izvrsenja:
        //Unesite N: 5
        //Unesite broj: 1
        //Unesite broj: -4
        //Unesite broj: 3
        //Unesite broj: -7
        //Unesite broj: 9
        //
        //Brojevi veci od nule u nizu A su: 1, 3, 9,

        ArrayList<Integer> nizBrojeva = new ArrayList<Integer>();
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite N: ");
        int n = s.nextInt();

        for (int i = 0; i < n ; i++) {
            System.out.println("Unesite broj: ");
            int broj = s.nextInt();

            if (broj > 0) {
                nizBrojeva.add(broj);
            }
        }
        for (int i = 0; i <=nizBrojeva.size()-1 ; i++) {
            System.out.print("Brojevi veci od nula su: "+ nizBrojeva.get(i) + ", ");
        }




    }
}
