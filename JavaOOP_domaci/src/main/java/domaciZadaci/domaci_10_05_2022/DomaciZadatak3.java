package domaciZadaci.domaci_10_05_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class DomaciZadatak3 {
    public static void main(String[] args) {
        //3. Napisati program koji ucitava niz A duzine N i broj X.
        // Nakon unosa treba ispisati indekse onih clanova niza koji su jednaki broju X.
        //	Primer izvrsenja:
        //Unesite N: 5
        //Unesite broj: 1
        //Unesite broj: 3
        //Unesite broj: 7
        //Unesite broj: 3
        //Unesite broj: 9
        //Unesite X: 3
        //
        //Rezultat: Elementi niza A koji su jednaki broju X imaju indekse:
        //1, 3

        ArrayList<Integer> nizBrojeva = new ArrayList<Integer>();

        Scanner s = new Scanner(System.in);
        System.out.println("Unesite N: ");
        int n = s.nextInt();


        for (int i = 0; i <n ; i++) {
            System.out.println("Unesite broj: ");
            int broj = s.nextInt();
            nizBrojeva.add(broj);
        }
        System.out.println("Unesite X: ");
        int x = s.nextInt();

        System.out.print("Rezultat: Elementi niza A koji su jednaki broju X imaju indekse: ");

        for (int i = 0; i <= nizBrojeva.size()-1 ; i++) {
            if (nizBrojeva.get(i) == x) {

                System.out.print(i + ", ");
            }
        }

    }
}
