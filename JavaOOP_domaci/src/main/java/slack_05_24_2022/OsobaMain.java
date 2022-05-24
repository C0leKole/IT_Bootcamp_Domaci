package slack_05_24_2022;

public class OsobaMain {

    public static void main(String[] args) {

        Osoba osoba = new Osoba("Nikola Ilic");
        Osoba majka = new Osoba("Slavica Ilic");
        Osoba otac = new Osoba("Goran Ilic");
        Osoba ocevOtac = new Osoba("Borivoje Ilic");
        Osoba ocevaMajka = new Osoba("Desanka Ilic");
        Osoba majcinOtac = new Osoba("Vladan Zivkovic");
        Osoba majcinaMajka = new Osoba("Darinka Zivkovic");


        osoba.setMajka(majka);
        osoba.setOtac(otac);
        osoba.getOtac().setOtac(ocevOtac);
        osoba.getOtac().setMajka(ocevaMajka);
        osoba.getMajka().setOtac(majcinOtac);
        osoba.getMajka().setMajka(majcinaMajka);

        osoba.print();
    }
}

