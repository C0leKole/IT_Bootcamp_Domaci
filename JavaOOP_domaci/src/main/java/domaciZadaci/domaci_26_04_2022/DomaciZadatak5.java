package domaciZadaci.domaci_26_04_2022;

import java.util.Scanner;

public class DomaciZadatak5 {
    public static void main(String[] args) {
        //Napisati program koji ima informacije koje ucitava informacije sa tastature:
        //Ime
        //Prezime
        //godinu rodjenja
        //I stampa informaicije u formatu:
        //[ime] [prezime] - [startost] god

        Scanner s = new Scanner(System.in);

        System.out.print("Unesite svoje ime: ");
        String ime = s.next();

        System.out.print("Unesite svoje prezime: ");
        String prezime = s.next();

        System.out.print("Unesite godinu rodjenja: ");
        int godinaRodjenja = s.nextInt();

        System.out.print(ime + " " + prezime + " - " + godinaRodjenja);
    }
}
