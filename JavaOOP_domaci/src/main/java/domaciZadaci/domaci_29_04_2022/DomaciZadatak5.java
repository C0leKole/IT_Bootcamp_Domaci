package domaciZadaci.domaci_29_04_2022;

import java.util.Scanner;

public class DomaciZadatak5 {
    public static void main(String[] args) {
        // Napisati program koji pronalazi 7 stepen broja 2.
        //Izvrsenje:
        //2 na stepen 7 je 128


        int n = 2;
        int sedmiStepen = 7;
        int stepenovanje = 1;

        for (int i = 1; i <= sedmiStepen ; i++) {
            stepenovanje *= n;
        }

        System.out.println(n + " na stepen 7 je  " + stepenovanje);
    }
}
