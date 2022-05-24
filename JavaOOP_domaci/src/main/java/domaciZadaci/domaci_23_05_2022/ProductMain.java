package domaciZadaci.domaci_23_05_2022;

public class ProductMain {
    public static void main(String[] args) {

        Product p = new Product("kivi-2938", "Kivi", 120);

        Vaga kantar = new Vaga();
        kantar.setMerneJed("kg");
        kantar.setProizvod(p);

        kantar.stampaj(50);
    }
}
