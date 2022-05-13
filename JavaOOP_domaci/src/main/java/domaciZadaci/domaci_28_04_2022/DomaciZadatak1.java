package domaciZadaci.domaci_28_04_2022;

import java.util.Scanner;

public class DomaciZadatak1 {
    public static void main(String[] args) {
        //1.Napisati program koji racuna zavrsnu ocenu ispita. Korisnik unosi poene sa:
        //lab vezbi (maksimalno 20poena)
        //pismenog (maksimalno 40 poena)
        //usmenog (maksimalno 40 poena)
        //Nakon toga se racuna zavrsna ocena, tako sto se u odnosu na zbir svih poena ocena racuna tako da
        //od 50do 59 poena, je ocena 6
        //od 60 do 69 poena, je ocena 7
        //od 70 do 79 poena, je ocena 8
        //od 80 do 89 poena, je ocena 9
        //od 90 do 100 poena, je ocena 10
        //Za ispod 50 poena, ocena je 5
        //Na kraju programa ispistati zavrsnu ocenu ispita

        Scanner s = new Scanner(System.in);

        System.out.println("Unesite poene sa lab vezbi: ");
        int labPoeni = s.nextInt();

        System.out.println("Unesite poene sa pismenog: ");
        int pismeni = s.nextInt();

        System.out.println("Unesite poene sa usmenog: ");
        int usmeni = s.nextInt();
        int zavrsnaOcena = 0;

        if ((labPoeni + pismeni + usmeni) > 49 && (labPoeni + pismeni + usmeni) < 60 ) {
            zavrsnaOcena = 6;
        } else if ((labPoeni + pismeni + usmeni) > 59 && (labPoeni + pismeni + usmeni) < 70 ) {
            zavrsnaOcena = 7;
        } else if ((labPoeni + pismeni + usmeni) > 69 && (labPoeni + pismeni + usmeni) < 80 ) {
            zavrsnaOcena = 8;
        } else if ((labPoeni + pismeni + usmeni) > 79 && (labPoeni + pismeni + usmeni) < 90 ) {
            zavrsnaOcena = 9;
        } else if ((labPoeni + pismeni + usmeni) > 89 && (labPoeni + pismeni + usmeni) < 90 ) {
            zavrsnaOcena = 10;
        } else {
            zavrsnaOcena = 5;
        }
        System.out.println("Vasa zavrsna ocena je: " + zavrsnaOcena);



    }
}
