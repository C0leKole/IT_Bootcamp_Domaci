package p26_05_2022;

public class FacePostMain {
    public static void main(String[] args) {
        Reakcija k1 = new Reakcija("smajli", "Pera Peric");
        Reakcija k2 = new Reakcija("like", "Mirko Mirkovic");
        Reakcija k3 = new Reakcija("srce", "Slavko Slavkovic");

        FacePost objava = new FacePost();
        objava.setImeAutora("Nikola Ilic");
        objava.setTekstObjave("Srecna slava domacine!");

        objava.reaguj(k1);
        objava.reaguj(k1);
        objava.reaguj(k1);
        objava.reaguj(k1);
        objava.reaguj(k2);
        objava.reaguj(k2);
        objava.reaguj(k3);
        objava.reaguj(k3);


        objava.stampaj();




    }
}
