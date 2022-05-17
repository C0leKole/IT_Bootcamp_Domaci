package domaciZadaci_16_05_2022;

public class Zadatak1 {
    public static void main(String[] args) {
        //Napisati metodu stampajVrednostZa10Vecu u kojoj se stampa prosledjena vrednost za 10 veca.
        // Iz main-a pozvati izvrsenje metode za razlicite vrednosti.
        stampajVrednostZa10Vecu(5);

    }
    static void stampajVrednostZa10Vecu (int broj) {
         int vrednost = broj +10;
        System.out.println("Vrednost za 10 veca od unetog broj je: " + vrednost);
    }
}
