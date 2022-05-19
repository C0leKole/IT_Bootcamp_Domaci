package domaci_18_05_2022;

public class ProizvodMain {
    public static void main(String[] args) {
        //Napisati klasu Proizvod koja ima atribute
        //naziv proizvoda (String)
        //cenu proizvoda (double)
        //težinu proizvoda u gramima. (double)
        //	i metode:
        //stampaj - stampa podatke proizvoda u formatu {{naziv}}, {{cena}}, {{tezina}}
        //
        //
        //U glavnom programu kreirati minimum 2 proizvoda i za svaki od njih pozvati metodu za stampu.

        Proizvod p = new Proizvod();
        p.naziv = "Sony a6400";
        p.cena = 120000;
        p.tezina = 120;

        Proizvod.stampa(p.naziv, p.cena , p.tezina);

        Proizvod t = new Proizvod();
        t.naziv = "Canon 250d";
        t.cena = 90000;
        t.tezina = 135;

        Proizvod.stampa(t.naziv, t.cena , t.tezina);


    }

}
