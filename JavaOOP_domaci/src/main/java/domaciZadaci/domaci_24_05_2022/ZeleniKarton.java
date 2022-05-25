package domaciZadaci.domaci_24_05_2022;

public class ZeleniKarton {
    //Zadatak
    //Kreirati klasu ZeleniKarton koja ima:
    //ime i prezime studenta
    //broj indeksa
    //naziv predmeta
    //ime i prezime profesora
    //ocenu - od 5 do 10
    //gettere i settere
    //konstruktore
    //metodu koja vraca da li je ispit polozen ili ne (ispit je polozen ako je ocena veca od 5)
    //metodu stampaj koja stampa podatke u formatu:
    //		(naziv predmeta) - (ocena)
    //		Student: ime i prezime, broj indeksa
    //		Profesor: ime i prezime
    //
    //	U glavnoj klasi:
    //kreirati niz od 10tak zelenih kartona za ispite i odstampati podatke za sve ispite

    private String imeStudenta;
    private String prezimeStudenta;
    private int brojIndeksa;
    private String nazivPredemta;
    private String imeProf;
    private String prezimeProf;
    private int ocena;

    public String getPrezimeStudenta() {
        return prezimeStudenta;
    }

    public String getPrezimeProf() {
        return prezimeProf;
    }

    public void setPrezimeProf(String prezimeProf) {
        this.prezimeProf = prezimeProf;
    }

    public void setPrezimeStudenta(String prezimeStudenta) {
        this.prezimeStudenta = prezimeStudenta;
    }

    public ZeleniKarton(String imeStudenta, String prezimeStudenta, int brojIndeksa, String nazivPredemta,
                        String imeProf, String prezimeProf, int ocena) {
        this.imeStudenta = imeStudenta;
        this.prezimeStudenta = prezimeStudenta;
        this.brojIndeksa = brojIndeksa;
        this.nazivPredemta = nazivPredemta;
        this.imeProf = imeProf;
        this.prezimeProf = prezimeProf;
        this.ocena = ocena;
    }

    public String getImeStudenta() {
        return imeStudenta;
    }

    public void setImeStudenta(String imeStudenta) {
        this.imeStudenta = imeStudenta;
    }

    public int getBrojIndeksa() {
        return brojIndeksa;
    }

    public void setBrojIndeksa(int brojIndeksa) {
        this.brojIndeksa = brojIndeksa;
    }

    public String getNazivPredemta() {
        return nazivPredemta;
    }

    public void setNazivPredemta(String nazivPredemta) {
        this.nazivPredemta = nazivPredemta;
    }

    public String getImeProf() {
        return imeProf;
    }

    public void setImeProf(String imeProf) {
        this.imeProf = imeProf;
    }

    public int getOcena() {
        return ocena;
    }

    public void setOcena(int ocena) {
        this.ocena = ocena;
    }
    public boolean daLiJePolozen() {
     if (this.ocena > 5) {
         return true;
     } else {
         return false;
     }

    }

    //metodu stampaj koja stampa podatke u formatu:
    //		(naziv predmeta) - (ocena)
    //		Student: ime i prezime, broj indeksa
    //		Profesor: ime i prezime
    public void stampaj (){
        System.out.println(this.nazivPredemta + " - " + this.ocena);
        System.out.println("Student: " + this.imeStudenta + ", " + this.brojIndeksa);
        System.out.println("Profesor: " + this.imeProf + " " + this.prezimeProf);
    }
}
