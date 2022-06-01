package domaciZadaci.domaci_31_05_2022;

import java.util.ArrayList;

public class Player extends Person {
    //Kreirati klasu Igrac koja nasledjuje klasu Osoba i koja ima:
    //broj (broj koji igrac nosi)
    //poziciju koju igra (odbrambeni, napadac, … )
    //niz kartona
    //kapiten (promenljiva koja kaze da li je igrac kapiten tima, i tipa je boolean)
    //default-ni konstuktor
    //konstuktor sa parametrima
    //gettere i settere za broj, kapiten i poziciju
    //metodu dodaj karton, gde se dodaje karton u niz
    //metodu koja vraca broj zutih kartona
    //metodu koja vraca broj crvenih kartona
    //metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o igracu
    private int broj;
    private String pozicija;
    private ArrayList<Card> nizkartona = new ArrayList<>();

    private boolean daLiJeKapiten;

    public int getBroj() {
        return broj;
    }

    public void setBroj(int broj) {
        this.broj = broj;
    }

    public String getPozicija() {
        return pozicija;
    }

    public void setPozicija(String pozicija) {
        this.pozicija = pozicija;
    }

    public boolean isDaLiJeKapiten() {
        return daLiJeKapiten;
    }

    public void setDaLiJeKapiten(boolean daLiJeKapiten) {
        this.daLiJeKapiten = daLiJeKapiten;
    }

    public Player(String imeIPrezime, String jmbg, int godinaRodj, int broj, String pozicija, boolean daLiJeKapiten) {
        super(imeIPrezime, jmbg, godinaRodj);
        this.broj = broj;
        this.pozicija = pozicija;
        this.nizkartona = nizkartona;

        this.daLiJeKapiten = daLiJeKapiten;
    }

    public Player () {

    }
    public void dodajKarton (Card karton) {
        nizkartona.add(karton);
    }
    //metodu koja vraca broj zutih kartona
    //metodu koja vraca broj crvenih kartona
    //metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o igracu
    public int brojZutih () {
        int zbirZutihKartona = 0;
        for (int i = 0; i <nizkartona.size() ; i++) {

            if (nizkartona.get(i).getTipKartona().equals("zuti")) {
                zbirZutihKartona ++;
            }

        }
        return zbirZutihKartona;
    }
    public int brojCrvenih () {
        int zbirCrvenihKartona = 0;
        for (int i = 0; i <nizkartona.size() ; i++) {

            if (nizkartona.get(i).getTipKartona().equals("crveni")) {
                zbirCrvenihKartona ++;
            }

        }
        return zbirCrvenihKartona;
    }
    @Override
    public void stampaj() {
        super.stampaj();
        System.out.println("Igrac nosi broj: " + broj);
        System.out.println("Igra na poziciji: " + pozicija);
        System.out.println("Da li je igrac kapiten: " + daLiJeKapiten);
        System.out.println("Igrac je dobio sledece kartone:  ");
        for (int i = 0; i <nizkartona.size() ; i++) {
            System.out.print(nizkartona.get(i).getTipKartona() + ", ");
        }



    }

}
