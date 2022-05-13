package domaciZadaci.domaci_27_04_2022;

import java.util.Scanner;

public class DomaciZadatak5 {
    public static void main(String[] args) {
        //5. Napisati program koji u zavisnosti od operatora koji unosi korisnik sa tastature
        // (operator je string i moze imati vrednosti +, - , *, /) racuna  i ispisuje na ekranu odgovarajuci zbir,
        // razliku, proizvod ili kolicnik za dva broja a i b uneta sa tastature.

        Scanner s = new Scanner(System.in);

        System.out.print("Unesite a: ");
        double a = s.nextDouble();

        System.out.print("Unesite b: ");
        double b = s.nextDouble();

        System.out.print("Unesite operator: ");
        String operator = s.next();

        String zbir = "+";
        String razlika = "-";
        String mnozenje = "*";
        String deljenje = "/";

        if (operator.equals("+")) {
            System.out.print("Rezultat: " + (a + b));
        } else if (operator.equals("-")) {
            System.out.print("Rezultat: " + (a - b));
        } else if (operator.equals("*")) {
            System.out.print("Rezultat: " + (a * b));
        } else if (operator.equals("/")) {
            System.out.print("Rezultat: " + (a / b));
        }


    }
}
