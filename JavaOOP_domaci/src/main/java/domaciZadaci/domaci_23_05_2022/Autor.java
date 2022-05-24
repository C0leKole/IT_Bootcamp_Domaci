package domaciZadaci.domaci_23_05_2022;

public class Autor {
    //Kreirati klasu Autor koja ima
    //-ime i prezime
    //-konstuktore koje mislite da su vam potrebni
    //-gettere i settere za atribute
    //-metodu print koja stampa u formatu:
    //(ime autora) (prezime autora)
    //


    private String imeIPrezime;

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public Autor(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }
    public void stampaj() {
        System.out.println(this.imeIPrezime);
    }
}
