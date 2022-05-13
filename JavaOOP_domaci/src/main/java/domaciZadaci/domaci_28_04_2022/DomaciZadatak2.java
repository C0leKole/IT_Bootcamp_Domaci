package domaciZadaci.domaci_28_04_2022;

import java.util.Scanner;

public class DomaciZadatak2 {
    public static void main(String[] args) {
        //Napisati program koji validira da li je uneti email validan.
        //Korisnik unosi svoj email, a program ispisuje da li je validan ili ne.
        //Email je obavezan, sto znaci da mora da ima bar 1 karakter
        //Email u sebi mora da sadrzi @
        //Email  mora da se zavrsava sa .com (Za ovu proveru koristite endWith metodu, koristan link)
        //Email u sebi ne sme da sadrzi specijalne karaktere

        Scanner s = new Scanner(System.in);
        System.out.println("Molimo unesite svoju email adresu: ");
        String email = s.next();


        if (!(email.length() >=1)) {
            System.out.println("Email mora da sadrzi barem 1 karakter!");
        }
        else if (!(email.contains("@"))) {
            System.out.println("Email mora da sadrzi specijalni karakter @!");
        }
        else if (!(email.endsWith(".com"))) {
            System.out.println("Email mora da se zavrsava na .com");
        }
        else if (email.contains("/") || email.contains("*")) {
            System.out.println("Email ne sme sadrzati sledece specijalne karaktere (/ *)!");

        }  else {
            System.out.println("Vasa email adresa je validna!");
        }


    }
}
