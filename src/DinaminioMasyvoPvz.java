public class DinaminioMasyvoPvz {
    public static void main(String[] args) {

        long [] masyvas = new long[] { 123 };

        for (int i = 0; i < 10; i++) {
            //ideti i masyva 1000 skaiciu
            masyvas = push(masyvas, Math.round(Math.random() * 1000));
        }
        System.out.println("Rezultato masyvo ilgis: " + masyvas.length);
        for (long elementas : masyvas)
            System.out.println(elementas);
    }
    static long[] push(long[] m, long naujaReiksme) {
        System.out.println("Sukuriame nauja masyva kurio ilgis " + (m.length + 1));
        long[] naujasMasyvas = new long[m.length + 1];
        for (int i = 0; i < m.length; i++) {
            naujasMasyvas[i] = m[i];
        }
        //irasome paskutini naujo masyvo elementa
        naujasMasyvas[naujasMasyvas.length - 1] = naujaReiksme;
        return naujasMasyvas;
    }
}
