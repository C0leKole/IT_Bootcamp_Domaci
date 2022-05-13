package domaciZadaci.domaci_26_04_2022;

import java.util.Scanner;

public class DomaciZadatak3 {
    public static void main(String[] args) {

        //(Za vezbanje)Napisati program koji cuva i stampa podatke jednog bug reporta.
        // Bug je onaj koji ste radili na manuelnom delu

        int bugID = 32;
        String title = "Viber bug sa slanjem slike";
        String severity = "High";
        String priority = "High";
        String description = "Ne uspevam sliku da posaljem, izadje mi greska. " +
                "Probao sam sliku koju imam u telefonu sačuvanu da posaljem.";
        String environment = "Viber, production environment";
        String steps = "1. Otvoriti prozor za razgovor sa prijateljem. 2. Kliknuti na ikonicu za slanje slika iz " +
                "galerije. 3. Obeleziti sliku za slanje. 4. Klik na dugme za slanje.";
        String exResult = "Slika je poslata.";
        String actResult = "Error, nije moguce poslati sliku.";

        System.out.println("ID:" + bugID);
        System.out.println("Title: " + title);
        System.out.println("Severity: " + severity);
        System.out.println("Priority: " + priority);
        System.out.println("Description: " + description);
        System.out.println("Environment: " + environment);
        System.out.println("Steps to reproduce: " + steps);
        System.out.println("Expected result: " + exResult);
        System.out.println("Actual result: " + actResult);


    }
}
