package domaciZadaci.domaci_24_05_2022;

public class Transakcije {
    //Kreirati klasu Transakcija koja ima:
    //id transakcije
    //racun sa kog se prenose sredstva
    //racun na koji se prenose sredstva
    //gettere i settere
    //konstruktore
    //privatnu metodu koja racuna i vraca proviziju za izvrsenje transakcije koja se racuna:
    //ako je prenos sredstava manji od 4500, provizija je fiksna 45
    //ako je prenos sredstava veci od 4500, provizija je 1%
    //S obzirom da se provizija racuna na osnovu visine transakcije, znaci da metoda prima parametar koji predstavlja visinu transakcije
    //Ukoliko ne znate da resite ovu metodu, u metodi izvrsi transakciju racunajte fiksnu proviziju u vrednosti od 45.
    //metodu izvrsi transakciju koja vrsi prenos sredstava sa jednog racuna na drugi. Kao parametar funkcije se unosi vrednost koja se prebacuje.
    //Transakcija se vrsi tako sto sa jednog racuna skida (trazena suma) + (provizija), a na drugi racun dodaje samo (trazena suma).
    //(Za vezbanje) Vodite racuna da na racunu sa kog se salju sredstva ima dovoljno sredstava
    //metodu koja stampa podatke o transakciji u formatu:
    //id transkacije
    //Racun sa: Ime i prezime  -  broj racuna
    //Racun na: Ime i prezime  -  broj racuna
    //
    //	Naravno u glavnom kreirati objekte i testirati funkcionalnosti

    private int idTrans;
    private Racun racunPrimaoca;
    private Racun racunPosliljaoca;

    public Transakcije(int idTrans, Racun racunPrimaoca, Racun racunPosliljaoca) {
        this.idTrans = idTrans;
        this.racunPrimaoca = racunPrimaoca;
        this.racunPosliljaoca = racunPosliljaoca;
    }

    public int getIdTrans() {
        return idTrans;
    }

    public void setIdTrans(int idTrans) {
        this.idTrans = idTrans;
    }

    public Racun getRacunPrimaoca() {
        return racunPrimaoca;
    }

    public void setRacunPrimaoca(Racun racunPrimaoca) {
        this.racunPrimaoca = racunPrimaoca;
    }

    public Racun getRacunPosliljaoca() {
        return racunPosliljaoca;
    }

    public void setRacunPosliljaoca(Racun racunPosliljaoca) {
        this.racunPosliljaoca = racunPosliljaoca;
    }
    //privatnu metodu koja racuna i vraca proviziju za izvrsenje transakcije koja se racuna:
    //ako je prenos sredstava manji od 4500, provizija je fiksna 45
    //ako je prenos sredstava veci od 4500, provizija je 1%
    //S obzirom da se provizija racuna na osnovu visine transakcije, znaci da metoda prima parametar koji predstavlja
    // visinu transakcije
    //Ukoliko ne znate da resite ovu metodu, u metodi izvrsi transakciju racunajte fiksnu proviziju u vrednosti od 45.

    private double provizija (double iznosTransakcije) {
        if (iznosTransakcije <4500) {
            return iznosTransakcije*45/100;
        } else {
            return iznosTransakcije*1/100;
        }
    }
    //metodu izvrsi transakciju koja vrsi prenos sredstava sa jednog racuna na drugi.
    // Kao parametar funkcije se unosi vrednost koja se prebacuje.
    //Transakcija se vrsi tako sto sa jednog racuna skida (trazena suma) + (provizija),
    // a na drugi racun dodaje samo (trazena suma).

    public void izvrsiTranskaciju (double vrednostTranskacije) {
        if (this.racunPrimaoca.getTrenutnoStanje() > 0) {
            this.racunPosliljaoca.menjajStanje(vrednostTranskacije * -1 + provizija(vrednostTranskacije));
            this.racunPrimaoca.menjajStanje(vrednostTranskacije);
        } else {
            System.out.println("Nemate dovoljno sredstava na racunu posiljaoca!");
        }
        System.out.println("Stanje na racunu primaoca nakon izvrsene transakcije je: "
                + this.racunPrimaoca.getTrenutnoStanje());
        System.out.println("Stanje na racunu posiljaoca nakon izvrsene transakcije je: "
                + this.racunPosliljaoca.getTrenutnoStanje());
        System.out.println("Provizija za izvrsenu transakciju iznosi: " + provizija(vrednostTranskacije));
        System.out.println("ID transakcije: " + getIdTrans());
    }
}
