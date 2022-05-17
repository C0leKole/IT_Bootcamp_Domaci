package domaciZadaci_16_05_2022;

public class Zadatak2 {
    public static void main(String[] args) {
    //Napisati funkciju koja za dva jednocifrena broja koja su ulazni parametri funkcije vraca novu vrednost
        // koja se formira kao na primeru:
        //ako je prvi broj =2, a drugi =3 vraca novu vrednost 23.
        //ako je prvi broj =6, a drugi =2 vraca novu vrednost 62.

        String novaVrednost = novaVrednosZaUneteBrojeve("6", "2");
        System.out.println(novaVrednost);
    }
    static String novaVrednosZaUneteBrojeve (String prviBroj, String drugiBroj){

        String spojeniBrojevi = prviBroj + drugiBroj;

        return spojeniBrojevi;
    }
}
