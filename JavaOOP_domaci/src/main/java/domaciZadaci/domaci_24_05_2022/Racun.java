package domaciZadaci.domaci_24_05_2022;

public class Racun {
    //Zadatak
    //Kreirati klasu Racun koja ima:
    //broj racuna (npr: 170-289328923-23)
    //ime i prezime osobe
    //trenutno stanje na racunu (npr: 100, 1220)
    //gettere i setter za sve atribute, sem settera za stanje na racunu
    //metodu koja menja stanje na racunu za prosledjenu vrednost (stanje na racunu ne moze da bude manje od nule)
    //metodu koja stampa podatke o racunu u formatu:
    //Ime i prezime  -  broj racuna
    //stanje na racunu je (trenutno stanje) rsd.
    private String brojRn;
    private String imeIprezime;
    private double trenutnoStanje;

    public String getBrojRn() {
        return brojRn;
    }

    public Racun(String brojRn, String imeIprezime, double trenutnoStanje) {
        this.brojRn = brojRn;
        this.imeIprezime = imeIprezime;
        this.trenutnoStanje = trenutnoStanje;
    }

    public void setBrojRn(String brojRn) {
        this.brojRn = brojRn;
    }

    public String getImeIprezime() {
        return imeIprezime;
    }

    public void setImeIprezime(String imeIprezime) {
        this.imeIprezime = imeIprezime;
    }

    public double getTrenutnoStanje() {
        return trenutnoStanje;
    }
    //metodu koja menja stanje na racunu za prosledjenu vrednost (stanje na racunu ne moze da bude manje od nule)
    public void menjajStanje (double uplata) {
        this.trenutnoStanje += uplata;
    }

    //metodu koja stampa podatke o racunu u formatu:
    //Ime i prezime  -  broj racuna
    //stanje na racunu je (trenutno stanje) rsd.
    public void stampaj () {
        System.out.println(this.imeIprezime + " - " + this.brojRn);
        System.out.println("Stanje na racunu je " + this.trenutnoStanje + "rsd.");
    }

}
