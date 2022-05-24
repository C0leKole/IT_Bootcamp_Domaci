package domaciZadaci.domaci_23_05_2022;

public class ProductMain {
    public static void main(String[] args) {

        Product p = new Product("kivi-2938", "Kivi", 120);
        Product p1 = new Product("banane-2311", "Banane", 100);

        Vaga kantar = new Vaga();
        kantar.setMerneJed("kg");
        kantar.setProizvod(p);

        Vaga kantar1 = new Vaga();
        kantar1.setMerneJed("lb");
        kantar1.setProizvod(p1);

        kantar.stampaj(30);
        System.out.println();
        kantar1.stampaj(10);
    }
}
