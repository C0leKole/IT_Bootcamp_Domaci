package domaciZadaci.domaci_28_04_2022;

import java.util.Scanner;

public class DomaciZadatak3 {
    public static void main(String[] args) {
        //3. (za vezbanje) Napisati program koji validira formu za registraciju. Korisnik od informacija unosi:
        //ime
        //prezime
        //email
        //password
        //confirmPassword
        //Validacija:
        //Sva polja su obavezna
        //password mora da bude minimum duzina 8
        //confirmPassword i password moraju da se poklapaju
        //Email u sebi mora da sadrzi @
        //Password u sebi ne sme da sadrzi deo iz imena ili prezimena. Npr: za Milana nevalidan password bi bio Milan129, jer sadrzi “Milan” u sebi
        //Ispisati sve validacione greske.

        Scanner s = new Scanner(System.in);

        System.out.println("Unesite ime:");
        String ime = s.nextLine();

        System.out.println("Unesite prezime:");
        String prezime = s.nextLine();

        System.out.println("Unesite email:");
        String email = s.nextLine();

        System.out.println("Unesite password:");
        String password = s.nextLine();

        System.out.println("Potvrdite password:");
        String confirmedPass = s.nextLine();

        if (ime.length() < 1 || prezime.length() < 1 || email.length() < 1 || password.length() < 1 ||
                confirmedPass.length() < 1) {
            System.out.println("Morate popuniti sva polja!");
        } else if (!(password.length() > 8)) {
            System.out.println("Password mora imati minimum 8 karaktera!");
        } else if (!(password.equals(confirmedPass))) {
            System.out.println("Passwordi moraju da se poklapaju!");
        } else if (!(email.contains("@"))) {
            System.out.println("Email mora da sadrzi @!");
        } else if (password.contains(ime) || password.contains(prezime)) {
            System.out.println("Password ne sme da sadrzi deo imena ili prezimena!");
        } else {
            System.out.println("Registracija uspesna!");
        }

    }
}
