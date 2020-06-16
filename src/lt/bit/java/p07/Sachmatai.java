package lt.bit.java.p07;

public class Sachmatai {
    public static void main(String[] args) {
        int mazosLentosLangeliuSkaicius = 64;

        // [1]    = 1
        // [2]    = 2 = 1 * 2 = (grudu skaiciu [1] langelyje) * 2
        // [3]    = 4 = 2 * 2 = (grudu skaiciu [2] langelyje) * 2
        // [4]    = 8 = 4 * 2 = (grudu skaiciu [3] langelyje) * 2
        // ...
        // [n]    =           = (grudu skaiciu [n-1] langelyje) * 2

        for (int i = 1; i <= mazosLentosLangeliuSkaicius; i++) {
            long grudai = gruduSkaiciusLangelyje(i);
            System.out.println("Langelyje " + i + " yra grudu " + grudai);
        }

        System.out.println("Viso ant lentos su " + mazosLentosLangeliuSkaicius +
                " langeliu yra grudu " + gruduSkaiciusAntLentos(mazosLentosLangeliuSkaicius));

    }
    /*
        gruduSkaiciusLangelyje(langelioNr = 3)
            if (langelioNr == 1) return 1;
            return gruduSkaiciusLangelyje(langelioNr - 1) * 2;

                gruduSkaiciusLangelyje(langelioNr = 2)
                    if (langelioNr == 1) return 1;
                    return gruduSkaiciusLangelyje(langelioNr - 1) * 2;

                        gruduSkaiciusLangelyje(langelioNr = 1)
                            if (langelioNr == 1) return 1;

     */

    static long gruduSkaiciusLangelyje(int langelioNr) {
        if (langelioNr == 1) return 1;
        return gruduSkaiciusLangelyje(langelioNr - 1) * 2;
    }

    static long gruduSkaiciusAntLentos(int lentosLangeliuSk) {
        if (lentosLangeliuSk == 1) return 1;
        // lentos langeliu skaicius yra n
        return gruduSkaiciusAntLentos(lentosLangeliuSk - 1) +
                gruduSkaiciusLangelyje(lentosLangeliuSk);
    }
}
