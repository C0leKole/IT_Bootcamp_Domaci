package domaciZadaci.domaci_31_05_2022;

public class Card {
    //2. Zadatak
    //Kreirati klasu Karton koja ima:
    //tip kartona (crveni, zuti)
    //konstuktore za koje mislite da ce vam trebati
    //gettere i settere za karton
    private String tipKartona;

    public Card(String tipKartona) {
        this.tipKartona = tipKartona;
    }

    public Card() {
    }

    public String getTipKartona() {
        return tipKartona;
    }

    public void setTipKartona(String tipKartona) {
        this.tipKartona = tipKartona;
    }
}
