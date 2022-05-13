package domaciZadaci.domaci_29_04_2022;

import java.util.Scanner;

public class VezbaPaskal2 {
    public static void main(String[] args) {
        //Treba napisati program koji će ispisati sve brojeve od 1 do 20, ali unazad!


//        for (int i = 20; i >= 1 ; i--) {
//            System.out.print(i + ", ");

        //Napiši program koji će ispisati brojeve od 1 do N i pored svakog broja njegov kvadrat.


//        System.out.println("Unesite N: ");
//        int n = s.nextInt();
//        int kvadrat = 0;
//        for (int i = 0; i <= n ; i++) {
//           kvadrat = i * i;
//            System.out.println(i + " " + kvadrat);
//
//        }

        //Napiši program koji će tražiti unos N ocjena i prebrojati koliko ima odičnih ocjena.


//        for (int i = 0; i <n ; i++) {
//            System.out.println("Unesite ocenu: ");
//            int ocena = s.nextInt();
//
//            if (ocena != 1) {
//                suma = suma + 1;
//
//
//            }
//
//        }
//        System.out.println("Odlicnih ocena ima: " + suma);

        //Program koji sabira sve brojeve od 1 do nekog broja N kojeg zadajemo prilikom izvršavanja programa:


//        Scanner s = new Scanner(System.in);
//        System.out.println("Unesite N: ");
//        int n = s.nextInt();
//        int suma = 0;
//
//        for (int i = 1; i <= n ; i++) {
//            suma = suma + i;
//
//
//        }
//
//        System.out.println("Zbir brojeva od 1 do N je: " + suma);
//
//
//        }
        Scanner s = new Scanner(System.in);
                System.out.println("Unesite N: ");
                int n = s.nextInt();

                int faktorijelN = 1;



                for (int i = 1; i <= n ; i++) {
                     faktorijelN = faktorijelN *i;



        }
                    System.out.println(faktorijelN);

    }
    }

