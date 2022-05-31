package domaciZadaci.domaci_26_05_2022;

import java.util.ArrayList;

public class Pasta {
    //Kreirati klasu Pasta koja ima:
    //niz sastojaka
    //metodu za dodavanje sastojka
    //(ostavite za kraj) metodu za brisanje sastojka. U metodu se salje naziv sastojka koji se brise.
    //defaultni konstruktor
    //metodu koja racuna cenu paste, tako sto sumira cene svih sastojaka
    //metodu za stampu koja stampa podatke u formatu:
    //Pasta je sa sastojcima:
    //naziv - cena.din
    //naziv - cena.din
    //naziv - cena.din
    //Cena paste je cena.din
    //
    //U glavnom programu kreirati objekte i testirati funkcionalnosti
    ArrayList<Sastojak> nizSastojaka = new ArrayList<Sastojak>();

    public void dodajStastojak(Sastojak x) {
        nizSastojaka.add(x);
    }
    public void obrisiSastojak (Sastojak y) {
        nizSastojaka.remove(y);
    }
    public Pasta() {

    }
    public int cenaPaste () {

        int suma = 0;
        for (int i = 0; i <nizSastojaka.size() ; i++) {
            suma += nizSastojaka.get(i).getCena();


        }
        return suma;
    }
    //metodu za stampu koja stampa podatke u formatu:
    //Pasta je sa sastojcima:
    //naziv - cena.din
    //naziv - cena.din
    //naziv - cena.din
    //Cena paste je cena.din

    public void stampaj() {
        System.out.println("Pasta je sa sastojcima: ");
        for (int i = 0; i < this.nizSastojaka.size(); i++) {
            System.out.println(this.nizSastojaka.get(i).getNaziv() + " - " + this.nizSastojaka.get(i).getCena() + ". din");
        }
        System.out.println("Cena paste je " + cenaPaste() + "din.");
    }
}
