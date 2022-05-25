package domaciZadaci.domaci_24_05_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class ZeleniKartonMain {
    public static void main(String[] args) {
        ////	U glavnoj klasi:
        //    //kreirati niz od 10tak zelenih kartona za ispite i odstampati podatke za sve ispite
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite zeljeni broj zelenih kartona: ");
        int n = s.nextInt();
        ArrayList<ZeleniKarton> nizKartona = new ArrayList<ZeleniKarton>();


        for (int i = 0; i <n ; i++) {

            System.out.println("Unesite ime studenta: ");
            String imeStudenta = s.next();

            System.out.println("Unesite prezime studenta: ");
            String prezimeStudenta = s.next();

            System.out.println("Unesite broj indeksa: " );
            int indeks = s.nextInt();

            System.out.println("Unesite naziv predmeta: ");
            String predmet = s.next();

            System.out.println("Unesite ime profesora: ");
            String imeProfesora = s.next();

            System.out.println("Unesite prezime profesora: ");
            String prezimeProfesora = s.next();

            System.out.println("Unesite ocenu: ");
            int ocena = s.nextInt();


            System.out.println();


            ZeleniKarton k1 = new ZeleniKarton(imeStudenta, prezimeStudenta, indeks,  predmet,
                    imeProfesora, prezimeProfesora, ocena);
            nizKartona.add(k1);




        }

        for (int i = 0; i <nizKartona.size() ; i++) {
            nizKartona.get(i).stampaj();
        }




    }
}
