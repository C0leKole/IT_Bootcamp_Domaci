package domaciZadaci.domaci_31_05_2022;

public class Person {
    //Kreirati klasu Osoba koja ima:
    //ime i prezime
    //jmbg
    //godinu rodjenja
    //default-ni konstuktor
    //konstuktor sa parametrima
    //gettere i settere
    //metodu stampaj koja stampa u formatu:
    //(ime i prezime), (jmbg), (godina rodjenja)

    protected String imeIPrezime;
    protected String jmbg;
    protected int godinaRodj;

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public String getJmbg() {
        return jmbg;
    }

    public void setJmbg(String jmbg) {
        this.jmbg = jmbg;
    }

    public int getGodinaRodj() {
        return godinaRodj;
    }

    public void setGodinaRodj(int godinaRodj) {
        this.godinaRodj = godinaRodj;
    }

    public Person() {
    }

    public Person(String imeIPrezime, String jmbg, int godinaRodj) {
        this.imeIPrezime = imeIPrezime;
        this.jmbg = jmbg;
        this.godinaRodj = godinaRodj;
    }
    public void stampaj () {
        System.out.println("Ime i prezime: " + imeIPrezime);
        System.out.println("JMBG: " + jmbg);
        System.out.println("Godina rodjenja: " + godinaRodj);


    }
}
