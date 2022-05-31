package domaciZadaci.domaci_30_05_2022;

import java.util.ArrayList;

public class Student {
    //Napisati klasu Student koja ima
    //broj indeksa
    //ime i prezime
    //tip studija (osnovne, master, doktorske)
    //niz ispita
    //konstuktore koje mislite da ce vam trebati
    //gettere i settere za indeks, ime i prezime, tip studija
    //getter za niz predmeta
    //metodu dodaj ispit u niz ispita
    //metodu koja racuna prosek na studijama (u prosek se ubrajaju samo polozeni ispiti)
    //metodu stampaj koja stampa u formatu:
    //(broj indeksa) - (ime i prezime) - (tip studija)
    //Predmeti:
    //(naziv predmeta) - (profesor) - (ocena)
    //(naziv predmeta) - (profesor) - (ocena)
    //(naziv predmeta) - (profesor) - (ocena)
    //Prosecna ocena: (prosecna ocena)
    private int brojIndeksa;
    private String imeIprezimeStudenta;
    private String tipStudija;
    private ArrayList<Ispiti> nizIspita = new ArrayList<>();
    private Ispiti ocene;

    public Student() {
    }

    public Student(int brojIndeksa, String imeIprezime, String tipStudija) {
        this.brojIndeksa = brojIndeksa;
        this.imeIprezimeStudenta = imeIprezime;
        this.tipStudija = tipStudija;
    }

    public ArrayList<Ispiti> getNizIspita() {
        return nizIspita;
    }

    public int getBrojIndeksa() {
        return brojIndeksa;
    }

    public void setBrojIndeksa(int brojIndeksa) {
        this.brojIndeksa = brojIndeksa;
    }

    public String getImeIprezimeStudenta() {
        return imeIprezimeStudenta;
    }

    public void setImeIprezimeStudenta(String imeIprezimeStudenta) {
        this.imeIprezimeStudenta = imeIprezimeStudenta;
    }

    public String getTipStudija() {
        return tipStudija;
    }

    public void setTipStudija(String tipStudija) {
        this.tipStudija = tipStudija;
    }

    //metodu dodaj ispit u niz ispita
    public void dodajIspit(Ispiti ispit) {
        nizIspita.add(ispit);
    }

    //metodu koja racuna prosek na studijama (u prosek se ubrajaju samo polozeni ispiti)
    public double prosekIspita() {
        ArrayList<Integer> nizPolozenih = new ArrayList<>();

        double sumaOcena = 0;
        for (int i = 0; i < nizIspita.size(); i++) {


            if (nizIspita.get(i).daLiJePolozen()) {
                sumaOcena += nizIspita.get(i).getOcena();
                nizPolozenih.add(i);
            }
        }
        return sumaOcena/nizPolozenih.size();
    }


    //metodu stampaj koja stampa u formatu:
    //(broj indeksa) - (ime i prezime) - (tip studija)
    //Predmeti:
    //(naziv predmeta) - (profesor) - (ocena)
    //(naziv predmeta) - (profesor) - (ocena)
    //(naziv predmeta) - (profesor) - (ocena)
    //Prosecna ocena: (prosecna ocena)
    public void stampaj() {
        System.out.println("Predmeti: ");
        for (int i = 0; i < nizIspita.size(); i++) {

            System.out.println(nizIspita.get(i).getNazivPredmeta() + " - "
                    + nizIspita.get(i).getPunoImeProfesora() + " - " + nizIspita.get(i).getOcena());
        }
        System.out.println("Prosecna ocena je: " + prosekIspita());

    }
}
