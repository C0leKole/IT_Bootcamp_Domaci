package domaciZadaci.domaci_26_05_2022;

public class Reakcija {
    //Kreirati klasu Reakcija koja ima
    //tip reakcije (smajli, like, srce)
    //ime i prezime korisnika koji je reagovao
    //gettere, settere i konstruktore

    private String reakcija;
    private String imeIprezime;

    public Reakcija(String reakcija, String imeIprezime) {
        this.reakcija = reakcija;
        this.imeIprezime = imeIprezime;
    }

    public String getReakcija() {
        return reakcija;
    }

    public void setReakcija(String reakcija) {
        this.reakcija = reakcija;
    }

    public String getImeIprezime() {
        return imeIprezime;
    }

    public void setImeIprezime(String imeIprezime) {
        this.imeIprezime = imeIprezime;
    }
}
