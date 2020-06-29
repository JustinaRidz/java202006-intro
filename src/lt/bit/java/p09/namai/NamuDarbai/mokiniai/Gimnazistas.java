package lt.bit.java.p09.namai.NamuDarbai.mokiniai;

public class Gimnazistas extends Mokinys {
    private String[] dalykai;


    public Gimnazistas(String vardas, String pavarde, int klase) {
        super(vardas, pavarde);
        setKlase(klase);
    }
}
