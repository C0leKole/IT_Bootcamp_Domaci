package domaciZadaci.domaci_31_05_2022;

public class PlayerMain {
    public static void main(String[] args) {
        Player p = new Player("Nikola Ilic", "19082939854", 1993, 17, "Levi bek",
                true);
        Card c = new Card();
        c.setTipKartona("zuti");
        Card c2 = new Card("crveni");

        p.dodajKarton(c);
        p.dodajKarton(c);
        p.dodajKarton(c);
        p.dodajKarton(c2);
        p.dodajKarton(c2);

        p.stampaj();
        System.out.println();
        System.out.println("Broj crvenih kartona " + p.brojCrvenih());
        System.out.println("Broj zutih kartona " + p.brojZutih());


    }
}
