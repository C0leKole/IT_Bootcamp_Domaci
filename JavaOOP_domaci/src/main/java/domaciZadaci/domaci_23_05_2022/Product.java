package domaciZadaci.domaci_23_05_2022;

public class Product {
    //(Za vezbanje) Kreirati klasu Proizvod koja ima:
    //sifru proizvoda
    //naziv proizvoda
    //cenu po kilogramu (cena po funti se ne cuva, ona se racuna)
    //konstuktor koji prima sva tri parametra (sifra, naziv, cena po kilogramu)
    //gettere i settere za sifru i naziv
    //setter za cenu po kilogramu
    //metodu getCenaKg koja vraca cenu za 1 kg proizvoda
    //metodu getCenaLb koja vraca cenu za 1lb prozvoda
    // 		konverzija: 1 kg = 2.2046 lb
    //metodu koja stampa proizvod u formatu:
    //(sifra) - (naziv)
    private String sifra;
    private String naziv;
    private double cenaPoKilogramu;

    public void setCenaPoKilogramu(double cenaPoKilogramu) {
        this.cenaPoKilogramu = cenaPoKilogramu;
    }

    public Product(String sifra, String naziv, double cenaPoKilogramu) {
        this.sifra = sifra;
        this.naziv = naziv;
        this.cenaPoKilogramu = cenaPoKilogramu;
    }

    public String getSifra() {
        return sifra;
    }

    public void setSifra(String sifra) {
        this.sifra = sifra;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public void setcenaPoKilogramu(double cenaPoKilogramu) {
        this.cenaPoKilogramu = cenaPoKilogramu;
    }
    public double getCenaPoKilogramu () {
        //metodu getCenaKg koja vraca cenu za 1 kg proizvoda
        //    //metodu getCenaLb koja vraca cenu za 1lb prozvoda
        //    // 		konverzija: 1 kg = 2.2046 lb
        //    //metodu koja stampa proizvod u formatu:
        //    //(sifra) - (naziv)
        return cenaPoKilogramu;
    }
    public double getcenaPoFunti (){
        return cenaPoKilogramu * 2.2046;
    }

    public void stampaj () {
        System.out.println(this.sifra + " - " + this.naziv);
    }
}
