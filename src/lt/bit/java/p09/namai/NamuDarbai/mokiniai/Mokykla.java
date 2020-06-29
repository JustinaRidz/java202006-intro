package lt.bit.java.p09.namai.NamuDarbai.mokiniai;

public class Mokykla {
    /**
     * visu mokyklos mokiniu sarasas
     */
    private int maxMokiniuSkaicius = 1000;
    private Mokinys[] mokiniai = new Mokinys[maxMokiniuSkaicius];
    private int mokiniuSkaicius = 0;


    public void naujasMokinys(Mokinys mokinys) {
        if (mokiniuSkaicius < maxMokiniuSkaicius) {
            mokiniai[mokiniuSkaicius] = mokinys;
            mokiniuSkaicius++;
        } else {
            // throw new RuntimeException("Per daug mokiniu!!!");
            System.out.println("Per daug mokiniu!!!");
        }
    }

    public Mokinys[] getMokiniai() {
        return mokiniai;
    }

    public int getMokiniuSkaicius() {
        return mokiniuSkaicius;
    }
}
