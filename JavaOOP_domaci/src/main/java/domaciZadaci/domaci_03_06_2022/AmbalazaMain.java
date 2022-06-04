package domaciZadaci.domaci_03_06_2022;

public class AmbalazaMain {
    public static void main(String[] args) {
        //U glavnom programu kreirati jednu Korpu i u nju dodati nekoliko Ambalaza razlicitih
        // tipova i istestirati sve metode i ispisati ukupnu cenu sa popustom.

        Korpa k = new Korpa();

        Ambalaza staklena = new StaklenaAmbalaza("239-4923-4902",
                                                "Pivo",
                                                30,
                                                50,
                                                30,
                                                true, 65);

        Ambalaza tetrapak = new Tetrapak("23-4555-4222",
                "Jogurt",
                10,
                30,
                false,
                40);


        SuperKartica korisnik = new SuperKartica("2399-393994-239", "Nikola Ilic", 30);

        k.dodajAmbalazu(staklena);
        k.dodajAmbalazu(tetrapak);
        korisnik.stampaKartica();
        System.out.println();
        staklena.stampaj();
        System.out.println();
        tetrapak.stampaj();
        System.out.println("Ukupna vrednost korpe je: " + k.racunajUkupnuCenu(korisnik));



    }
}
