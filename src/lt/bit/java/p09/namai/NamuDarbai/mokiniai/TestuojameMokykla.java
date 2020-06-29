package lt.bit.java.p09.namai.NamuDarbai.mokiniai;

public class TestuojameMokykla {
    public static void main(String[] args) {

        Mokykla mokykla = new Mokykla();
        Mokinys mokinys = new Mokinys("Jonas", "Petras");

        System.out.println(mokykla.getMokiniuSkaicius());
        mokykla.naujasMokinys(mokinys);
        System.out.println(mokykla.getMokiniuSkaicius());

        Mokinys gimnazistas = new  Gimnazistas("Ona", "Marija", 10);
        mokykla.naujasMokinys(gimnazistas);
        System.out.println(mokykla.getMokiniuSkaicius());

        // Gimnazistas g2 = new Gimnazistas();

        Object obj = mokykla;
        obj = gimnazistas;

        System.out.println(obj.getClass().getName());

        obj = "Kuku";
        if (obj instanceof Mokinys) {
            System.out.println(((Mokinys) obj).getVardas());
        } else  {
            System.out.println("nea");
        }

        Mokinys mokinys1 = gimnazistas;
        System.out.println(mokinys1.getClass().getName());

    }
}
