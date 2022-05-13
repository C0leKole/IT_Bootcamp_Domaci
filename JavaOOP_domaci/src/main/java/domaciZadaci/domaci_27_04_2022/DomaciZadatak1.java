package domaciZadaci.domaci_27_04_2022;

import java.util.Scanner;

public class DomaciZadatak1 {
    public static void main(String[] args) {
        //1.Napisati program koji za ucitava brojeve a i b (b ima vrednosti 1 ili 2) Ukoliko se za b unese:
        //b=1, vrednost promenljive a se uvecava za 10
        //b=2, vrednost promenljive a se smanjuje za 20
        //Na kraju zadatka odstampati novu vrednost promenljive a.

        Scanner s = new Scanner(System.in);

        System.out.print("Unesite vrednost a: ");
        int a = s.nextInt();

        System.out.print("Unesite vrednost b: ");
        int b = s.nextInt();

        if (b == 1) {
            a = a + 10;
        } else if (b == 2) {
            a = a - 20;
        }
        System.out.print("Nova vrednost promenjive a je: " + a);
    }
}
