package domaciZadaci.domaci_27_04_2022;

import java.util.Scanner;

public class DomaciZadatak3 {
    public static void main(String[] args) {
        //3. (Za vezbanje)Napisati program koji ucitava 4 broja (a,b,c,d) i formira string p (p ima startni deo #)
        // tako sto negativne brojeve lepi sa leve strane a pozitivne i nulu sa desne

        Scanner s = new Scanner(System.in);

        System.out.println("Unesite a: ");
        int a = s.nextInt();

        System.out.println("Unesite b: ");
        int b = s.nextInt();

        System.out.println("Unesite c: ");
        int c = s.nextInt();

        System.out.println("Unesite d: ");
        int d = s.nextInt();

        String p = " # ";
        String rezultat = "";

        if (a < 0) {
            System.out.println(p = a + " " + p);

        } else {
            System.out.println(p = p + " " + a);
        }
        if (b < 0) {
            System.out.println(p = b + " " + p);
        } else {
            System.out.println(p = p + " " + b);
        }
        if (c < 0) {
            System.out.println(p = c + " " + p);
        } else {
            System.out.println(p = p + " " + c);
        }
        if (d < 0) {
            System.out.println(p = d + " " + p);
        } else {
            System.out.println(p = p + " " + d);
        }

    }
}
