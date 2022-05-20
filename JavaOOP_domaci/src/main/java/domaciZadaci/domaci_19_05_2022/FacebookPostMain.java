package domaciZadaci.domaci_19_05_2022;

public class FacebookPostMain {
    public static void main(String[] args) {
        //Primer stampanja:
        //Milan Jovanovic >>> Pera Peric
        //Ovo je tekst objave
        //Likes 3 | Shares 1

        FacebookPost user1 = new FacebookPost();

        user1.imeIPrezime = "Milan Jovanovic";
        user1.ImeIPrezimeNaTudjem = "Vladimir Minic";
        user1.brojLajkova = 0;
        user1.brojDeljenja = 0;
        user1.tekstObjave = "Vlado, ove nase kursadzije kidaju JavaOOP!";

        user1.like();
        user1.like();
        user1.like();
        user1.like();
        user1.like();
        user1.like();
        user1.share();
        user1.share();
        user1.share();
        user1.dislike();

        user1.print();


    }
}
