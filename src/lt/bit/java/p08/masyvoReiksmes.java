package lt.bit.java.p08;

public class masyvoReiksmes {

    public static void main(String[] args) {
        int[] m = {2, -3, 4, -1, 5};
        atspausdintiMasyva(m);
        sprendimas(m);
        atspausdintiMasyva(m);
    }

    static void abc(int x){x = 10; }
    static void atspausdintiMasyva(int[] a) {
        for (int e : a) {
            System.out.print(e + " ");
        }
        System.out.println();
    }
    static void sprendimas(int[] masyvas) {

        int didziausia = PirmosDidziausiosIndeksa(masyvas);
        int maziausia =PaskutinesMaziausiosIndeksa(masyvas);

            sukeistElementus(masyvas, didziausia, maziausia);
    }
    static int PirmosDidziausiosIndeksa(int[] masyvas) {
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
    static int PaskutinesMaziausiosIndeksa(int [] masyvas) {
        int maziausiasIndeksas = 0;
        int naujaReiksme = masyvas[1];

        for (int i = 1; i < masyvas.length; i++) {
            if(masyvas[i] <= naujaReiksme) {
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
