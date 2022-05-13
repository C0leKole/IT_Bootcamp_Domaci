package domaciZadaci.domaci_10_05_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class DomaciZadatak5 {
    public static void main(String[] args) {
        //5. (Za vezbanje) Napisati program koji ucitava niz stringova duzine N,
        // tako da ucitavanje elemenata u niz a bude obrnuto.
        //		Primer:
        //		Unesite N: 4
        //		Unesite string: xxx1
        //		Unesite string: xxx4
        //		Unesite string: xxx6
        //		Unesite string: xxx9
        //
        //		Niz a: xxx9, xxx6, xxx4, xxx1
        //		Komentar: Stanje niza a u memoriji je:
        //			a[0]="xxx9",
        //			a[1]="xxx6",
        //			a[2]="xxx4",
        //			a[3]="xxx1",

//        ArrayList<String> nizSlova = new ArrayList<String>();
//
//        Scanner s = new Scanner(System.in);
//        System.out.println("Unesite N: ");
//        int n = s.nextInt();
//
//        for (int i = 0; i < n; i++) {
//            System.out.println("Unesite string: ");
//            String unos = s.next();
//
//            nizSlova.add(unos);
//
//        }
//        System.out.print("Niz a: ");
//        for (int i = nizSlova.size()-1; i >= 0; i--) {
//            System.out.print(nizSlova.get(i) + ", ");
//        }
//        System.out.println(nizSlova);


        ArrayList<String> niz = new ArrayList<String>();
        Scanner s = new Scanner(System.in);

        System.out.print("Unesite N: ");
        int n = s.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Unesite string: ");
            String slova = s.next();
            niz.add(0,slova);
        }

        System.out.println();
        System.out.println(niz);


    }
}
