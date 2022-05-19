package domaci_18_05_2022;

public class Proizvod {
        //Napisati klasu Proizvod koja ima atribute
        //naziv proizvoda (String)
        //cenu proizvoda (double)
        //težinu proizvoda u gramima. (double)
        //	i metode:
        //stampaj - stampa podatke proizvoda u formatu {{naziv}}, {{cena}}, {{tezina}}
        //
        //
        //U glavnom programu kreirati minimum 2 proizvoda i za svaki od njih pozvati metodu za stampu.
    public String naziv;
    public double cena;
    public double tezina;

    static void stampa (String naziv, double cena, double tezina) {
        System.out.println("Proizvod " + naziv + " ima cenu " + cena + "din i tezak je " + tezina + "g.");
    }
}
