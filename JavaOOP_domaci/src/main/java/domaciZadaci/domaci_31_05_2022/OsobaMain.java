package domaciZadaci.domaci_31_05_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class OsobaMain {
    public static void main(String[] args) {

        Igrac i1 = new Igrac("Nikola Ilic", "1703889033", 1993, 17,
                "Levi bek", true);
        Igrac i2 = new Igrac("Pera Peric", "8571287385", 1983, 2,
                "Desni bek", false);
        Igrac i3 = new Igrac("Marko Markovic", "1234551235", 1968, 1,
                "Golman", false);

        Trener t1 = new Trener("Jugoslav Petrovic", "1293859568", 1958,
                19, "Glavni");
        Trener t2 = new Trener("Dragan Stojkovic", "2345551188", 1978,
                23, "Pomocni");


        Scanner s = new Scanner(System.in);
        ArrayList<Igrac> nizIgraca = new ArrayList<Igrac>();
        System.out.println("Unesite broj igraca koji zelite da dodate: ");
        int n = s.nextInt();


        for (int i = 0; i < n; i++) {
            System.out.println("Unesite ime i prezime: ");
            String imeIPrezime = s.next();

            System.out.println("Unesite JMBG: ");
            String jmbg = s.next();

            System.out.println("Unesite godinu rodjenja: ");
            int godina = s.nextInt();

            System.out.println("Unesite broj: ");
            int broj = s.nextInt();
            System.out.println("Unesite poziciju: ");
            String pozicija = s.next();

            System.out.println("Da li je igrac kapiten: ");
            boolean daLiJeKapiten = s.nextBoolean();



            Igrac p = new Igrac();
            p.setImeIprezime(imeIPrezime);
            p.setJmbg(jmbg);
            p.setGodinaRodjenja(godina);
            p.setBroj(broj);
            p.setPozicija(pozicija);
            p.setDaLiJeKapiten(daLiJeKapiten);
            nizIgraca.add(p);
            p.stampaj();
        }

        ArrayList<Trener> nizTrenera = new ArrayList<>();
        System.out.println("Unesite broj trenera koji zelite da dodate: ");
        int n1 = s.nextInt();

        for (int i = 0; i < n1; i++) {
            System.out.println("Unesite ime i prezime: ");
            String imeIPrezime = s.next();

            System.out.println("Unesite JMBG: ");
            String jmbg = s.next();

            System.out.println("Unesite godinu rodjenja: ");
            int godina = s.nextInt();

            System.out.println("Unesite godine iskustva: ");
            int iskustvo = s.nextInt();

            System.out.println("Unesite tip trenera: ");
            String tipTrenera = s.next();

            Trener t3 = new Trener();
            t3.setImeIprezime(imeIPrezime);
            t3.setJmbg(jmbg);
            t3.setGodinaRodjenja(godina);
            t3.setGodineIskustva(iskustvo);
            t3.setTipTrenera(tipTrenera);
            nizTrenera.add(t3);
            t3.stampaj();
        }


//        i1.stampaj();
//        System.out.println();
//        i2.stampaj();
//        System.out.println();
//        i3.stampaj();
//        System.out.println();
//        t1.stampaj();
//        System.out.println();
//        t2.stampaj();


    }
}
