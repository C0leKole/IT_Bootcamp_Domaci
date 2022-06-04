package domaciZadaci.domaci_03_06_2022;

public class Tetrapak extends Ambalaza {
    //Kreirati klasu Tetrapak koja nasledjuje klasu Ambalaza koja ima:
    //atribut koji kaze da li se moze reciklirati
    //osnovna cena
    //gettere i setter za atribute
    //konstuktori koji su vam potrebni
    //racuna cenu tako da ispunjava uslova:
    //ako je od recikliranog materijala, ( tezina pakovanja ) * 1.5 + (osnovna cena);
    //ako nije u cenu ulazi samo osnovna cena
    //metoda stampaj stampa sve podatke iz klase tetrapak.

    private boolean daLiSeReciklira;
    private int osnovnaCena;

    public Tetrapak(String barKod, String nazivArtikla, int tezina, int brutoTezina, boolean daLiSeReciklira, int osnovnaCena) {
        super(barKod, nazivArtikla, tezina, brutoTezina);
        this.daLiSeReciklira = daLiSeReciklira;
        this.osnovnaCena = osnovnaCena;
    }

    public boolean isDaLiSeReciklira() {
        return daLiSeReciklira;
    }

    public void setDaLiSeReciklira(boolean daLiSeReciklira) {
        this.daLiSeReciklira = daLiSeReciklira;
    }

    public int getOsnovnaCena() {
        return osnovnaCena;
    }

    public void setOsnovnaCena(int osnovnaCena) {
        this.osnovnaCena = osnovnaCena;
    }

    @Override
    public double cenaArtikla() {
        //ako je od recikliranog materijala, ( tezina pakovanja ) * 1.5 + (osnovna cena);

        return isDaLiSeReciklira() ? racunajTezinu() * 1.5 + osnovnaCena : osnovnaCena;
    }

    @Override
    public void stampaj() {

        System.out.println("Naziv artikla: " + nazivArtikla);
        System.out.println("Osnovna cena: " + osnovnaCena);
        System.out.println("Bar kod: " + barKod);
        System.out.println("Neto tezina: " + tezina);
        System.out.println("Bruto tezina: " + brutoTezina);
        System.out.println("Da li se reciklira: " + daLiSeReciklira);
        System.out.println("Krajnja cena artikla: " + cenaArtikla());
    }


}
