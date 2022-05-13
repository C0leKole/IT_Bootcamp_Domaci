package domaciZadaci.domaci_26_04_2022;

import java.util.Scanner;

public class DomaciZadatak6 {
    public static void main(String[] args) {
        //Napisati program koji ucitava stranicu jednakostranicnog trougla sa
        // tastature i ispisuje povrsinu i obim trougla. Koren iz tri neka bude konstanta 1.73

        Scanner s = new Scanner(System.in);

        System.out.print("Unesite stranicu jednakostranickog trougla: ");
        double a = s.nextDouble();
        double korenIzTri = 1.71;
        double obimTrougla = 3 * a;
        double povrsinaTrougla = (a * a * korenIzTri) / 4;

        System.out.println("Obim jednakostranicnog trougla sa stranicom " + a + " je " + obimTrougla);
        System.out.println("Povrsina jednakostranicng torugla sa stranicom " + a + " je " + povrsinaTrougla);
    }
}
