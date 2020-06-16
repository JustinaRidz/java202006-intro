package lt.bit.java.p07;

import java.util.Scanner;

public class TobulasSkaicius {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Iveskite skaiciu: ");
        int maxSkaicius = scanner.nextInt();  //  scanner'is tekstinine eilut pavers i skaiciu

        System.out.println("Ieskome tobulu skaiciu nedidesniu uz " + maxSkaicius);

        long start = System.currentTimeMillis();

        int tikrinamasSkaicius = 1;
        while (tikrinamasSkaicius <= maxSkaicius) {

            if (arSkaiciusTobuolas(tikrinamasSkaicius)) {
                System.out.println("Radau !!! " + tikrinamasSkaicius);
            }
            // tikrinamasSkaicius = tikrinamasSkaicius +1
            // tikrinamasSkaicius +=1;
            tikrinamasSkaicius++;
        }
        long stop = System.currentTimeMillis();
        System.out.println("Vygdymo trukme: " + (stop - start) + "ms");

        /*
        n - n * n
        10 = 10 * 10 ->100
        */
    }

    private static boolean arSkaiciusTobuolas(int tikrinamasSkaicius) {
        int suma = 1;

        int riba = (int)Math.sqrt(tikrinamasSkaicius);
        for (int i = 2; i <= riba; i++) {
            if (tikrinamasSkaicius % i == 0) {  //jeigu tikrinamasSkaicius dalinasi be liekanos yra lyguu 0, tada sumuojam i reiksmes.
                suma += (i + tikrinamasSkaicius / i);
            }
        }
        if (suma == tikrinamasSkaicius)
        return true;
        else return false;
    }
}
