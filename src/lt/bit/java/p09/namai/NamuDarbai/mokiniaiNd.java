package lt.bit.java.p09.namai.NamuDarbai;

public class mokiniaiNd {

        static int mokiniuSkaicius = 5;
        static Mokykla[] mokiniai = new Mokykla[mokiniuSkaicius];

        public static void main(String[] args) {
            Mokykla mokinys1 = new Mokykla();
            mokinys1.vardas = "Jonas";
            mokinys1.pavarde = "Jonaitis ";
            mokinys1.klase = 1;
            mokiniai[0] = mokinys1;

            Mokykla mokinys2 = new Mokykla();
            mokinys2.vardas = "Ona";
            mokinys2.pavarde = "Onaite ";
            mokinys2.klase =2;
            mokiniai[1] = mokinys2;

            Mokykla mokinys3 = new Mokykla();
            mokinys3.vardas = "Petras";
            mokinys3.pavarde = "Jonaitis ";
            mokinys3.klase = 1;
            mokiniai[2] = mokinys3;

            Mokykla mokinys4 = new Mokykla();
            mokinys4.vardas = "Jurga";
            mokinys4.pavarde = "Jurgaite ";
            mokinys4.klase = 1;
            mokiniai[3] = mokinys4;

            Mokykla mokinys5 = new Mokykla();
            mokinys5.vardas = "Antanas";
            mokinys5.pavarde = "Antanaitis ";
            mokinys5.klase = 2;
            mokiniai[4] = mokinys5;

            print(0);
            print(1);
            print(2);
            print(3);
            print(4);
        }
        static void print(int indeksas){
            System.out.println(mokiniai[indeksas].vardas + " " +
                    mokiniai[indeksas].pavarde + " " +
                    mokiniai[indeksas].klase);
        };

        //toliau nezinau kaip..
}
