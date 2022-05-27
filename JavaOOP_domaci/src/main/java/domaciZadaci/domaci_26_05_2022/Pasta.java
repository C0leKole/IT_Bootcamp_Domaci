package p26_05_2022;

import java.util.ArrayList;
import java.util.Scanner;

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
        System.out.println(nizSastojaka.get(0).getNaziv() + " - " + nizSastojaka.get(0).getCena());
        System.out.println(nizSastojaka.get(1).getNaziv()+ " - " +  nizSastojaka.get(1).getCena());
        System.out.println(nizSastojaka.get(2).getNaziv() + " - " + nizSastojaka.get(2).getCena());
        System.out.println("Cena paste je " + cenaPaste() + "din.");
    }
}
