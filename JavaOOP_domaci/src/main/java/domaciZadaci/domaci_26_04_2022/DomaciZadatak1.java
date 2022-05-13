package domaciZadaci.domaci_26_04_2022;

import java.util.Scanner;

public class DomaciZadatak1 {
    public static void main(String[] args) {
        //Napisati program koji stampa podatke o kreditnoj kartici u formatu kao na slici.
        // Od informacija se pamti broj kartice (16 cifara sa razmacima),
        // mesec i godina do kada vazi kartica, kao i ime i prezime vlasnika kartice.
        // Kartica se stampa sa zvezdicama i ne brinite ukoliko neka zvezdica mrdne
        // i nije u liniji to ce zavisiti od duzine imena.


        String zvezdiceCeoRed = "******************************************";
        String imeKartice = "*  Credit Card";
        String zvezdice = "*    " + "****";
        String valid = "valid > 10/25";
        String imeKorisnika = "Milan Jovanovic";
        String brojKartice = "1234" + " " + "1232" + " " + "4321" + " " + "1212";

        System.out.println(zvezdiceCeoRed);
        System.out.println(imeKartice + "                           *");
        System.out.println(zvezdice + "                                *");
        System.out.println(zvezdice + "                                *");
        System.out.println("*     " + brojKartice + "                *");
        System.out.println("*                     " + valid + "      *");
        System.out.println("*   " + imeKorisnika + "                      *");
        System.out.println(zvezdiceCeoRed);

    }
}
