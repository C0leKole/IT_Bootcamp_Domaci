package domaciZadaci.domaci_23_05_2022;

public class Vaga {
    //Kreirati klasu Vaga koja ima:
    //merna jedinica (kg ili lb)
    //proizvod (proizvod koji se meri)
    //TEZINA SE NE CUVA KAO ATRIBUT!!!!!!!!!
    //default-ni konstuktor
    //getteri i setteri za sve atribute
    //metodu sracunajCenu koja vraca cenu proizvoda za unetu tezinu (tezina je parametar funkcije).
    // Na racunanje cene utice i merna jedinica na koju je vaga podesena.
    //metodu stampaj koja stampa racun u formatu. POMOC: trebace vam tezina kao parametar u ovoj metodi
    //               (sifra) - (naziv)
    //   (cena za odgovarajucu mernu jedinicu) (merna jedinica) x (tezina)
    //   Ukupno: (ukupna cena)

    private String merneJed;
    private Product proizvod;

    public Vaga(){

    }

    public String getMerneJed() {
        return merneJed;
    }

    public void setMerneJed(String merneJed) {
        this.merneJed = merneJed;
    }

    public Product getProizvod() {
        return proizvod;
    }

    public void setProizvod(Product proizvod) {
        this.proizvod = proizvod;
    }
    public double sracunajCenu (double tezina) {


        if (merneJed.equals("kg")) {
            return this.proizvod.getCenaPoKilogramu() * tezina;
        } else {
            return this.proizvod.getcenaPoFunti() * tezina;
        }
    }
    public void stampaj (int tezina) {
        System.out.println(this.proizvod.getSifra() + " - " + this.proizvod.getNaziv());
        if (this.merneJed.equals("kg")) {
            System.out.println(this.proizvod.getCenaPoKilogramu() + " kg x " + tezina );
        } else {
            System.out.println(this.proizvod.getcenaPoFunti() + " lb x " + tezina);
        }
        System.out.println("Ukupno: " + this.sracunajCenu(30));

    }
}
