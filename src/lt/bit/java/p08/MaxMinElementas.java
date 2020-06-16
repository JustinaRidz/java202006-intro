package lt.bit.java.p08;

public class MaxMinElementas {

    public static void main(String[] args) {
        int[] m = {-1, 2, 0, 2, -1, 1};
        atspausdintiMasyva(m);
        //skaiciuojame
        sprendimas(m);  //masyvas = m
        atspausdintiMasyva(m);

//      abc(m[0]); //x = m[0]
//      atspausdintiMasyva(m);
    }
    static void abc(int x){
        x = 10;
    }
    static void atspausdintiMasyva(int[] a) {
        for (int e : a) {
            System.out.print(e + " ");
        }
        System.out.println();
    }
    /**
     *Surandame pirma masyvo didziausia ir pirma maziausia reiksmes
     * sukeiciame jas vietomis
     * jei turime {-1,  2, 0, 2, -1, 1}
     * gauname    {-1, -1, 0, 2,  2, 1}
     * @param masyvas - pradiniu duomenu masyvas
     */
    static void sprendimas(int[] masyvas) {
        //masyvas [0] <=> masyvas [1];
        //sukeistiElementus(masyvas, 0, 1);

        int pirmaDidziausia = rastiPirmosDidziausiosIndeksa(masyvas);
        int paskutineMaziausia = rastiPaskutinesMaziausiosIndeksa(masyvas);

        sukeistElementus(masyvas, pirmaDidziausia, paskutineMaziausia);
    }

    /**
     * Randame pirmos didiziausios masyvo reiksmes indeksa (eiliskuma).
     * Jei masyvas yra {-1, 2, 0, 2} tai grazinti turime 1 pagal eiliskuma.
     * @param masyvas skaiciu masyvas
     * @return irmos didiziausios masyvo reiksmes indeksa (eiliskuma).
     */
    static int rastiPirmosDidziausiosIndeksa(int[] masyvas) {
        int rastasIndeksas = 0;
        int rastaReiksme = masyvas[0];

        for (int i = 1; i < masyvas.length; i++) {
            if(masyvas[i] > rastaReiksme) {
                rastasIndeksas = i;
                rastaReiksme = masyvas[i];
            }
        }
        return rastasIndeksas;
    }

    /**
     * NAMU DARBAI
     * Randame PASKUTINES masyvo maziausios reiksmes indeksa
     * turime {-1,  2, 0, 2, -1, 2} tai grazinti turime 4.
     * @param masyvas skaiciu masyvas
     * @return paskutines maziausios reiksmes indekas
     */
    static int rastiPaskutinesMaziausiosIndeksa(int [] masyvas) {
        int maziausiasIndeksas = 0;
        int naujaReiksme = masyvas[1];

        for (int i = 1; i < masyvas.length; i++) { // pradedame skaiciuoti nuo pirmo elemento
            if(masyvas[i] < naujaReiksme) {
                maziausiasIndeksas = i;
                naujaReiksme = masyvas[i];
            }
        }
        return maziausiasIndeksas;
    }

    static void sukeistElementus(int[] masyvas, int i, int j) {
        int x = masyvas[i];
        masyvas[i] = masyvas[j];
        masyvas[j] = x;
    }
}
