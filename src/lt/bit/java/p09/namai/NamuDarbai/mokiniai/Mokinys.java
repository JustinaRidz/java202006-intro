package lt.bit.java.p09.namai.NamuDarbai.mokiniai;

import java.util.Arrays;

public class Mokinys {

        static int mokiniuSkaicius = 5;
        static Mokykla[] mokiniai = new Mokykla[mokiniuSkaicius];

        public static void main(String[] args) {
            pradiniaiDuomenys();
            print("Pradiniai duomenys:");

            pagalKlase();
            print("Sulygiuota pagal klase:");

            pagalVarda();
            print("Sulygiuota pagal varda:");

            pagalKlasePavardeVarda();
            print("Sulygiuota pagal klase, pavarde, varda:");

            pagalVardaPavardeKlase();
            print("Sulygiuojam pagal varda, pavarde ir klase:");

        }

        static void pradiniaiDuomenys() {
            Mokykla mokinys1 = new Mokykla();
            mokinys1.setKlase(1);
            mokinys1.setVardas("Jonas");
            mokinys1.setPavarde("Jonaitis");
            mokiniai[0] = mokinys1;

            Mokykla mokinys2 = new Mokykla();
            mokinys2.setKlase(2);
            mokinys2.setVardas("Ona");
            mokinys2.setPavarde("Onaite");
            mokiniai[1] = mokinys2;

            Mokykla mokinys3 = new Mokykla();
            mokinys3.setKlase(1);
            mokinys3.setVardas("Petras");
            mokinys3.setPavarde("Jonaitis");
            mokiniai[2] = mokinys3;

            Mokykla mokinys4 = new Mokykla();
            mokinys4.setKlase(1);
            mokinys4.setVardas("Jurga");
            mokinys4.setPavarde("Jurgaite");
            mokiniai[3] = mokinys4;

            Mokykla mokinys5 = new Mokykla();
            mokinys5.setKlase(2);
            mokinys5.setVardas("Antanas");
            mokinys5.setPavarde("Antanaitis");
            mokiniai[4] = mokinys5;

//            print(0);
//            print(1);
//            print(2);
//            print(3);
//            print(4);
        }
        static void print(int indeksas){
            System.out.println(mokiniai[indeksas].getKlase() + " " +
                    mokiniai[indeksas].getVardas() + " " +
                    mokiniai[indeksas].getPavarde());
        }

        static void print(String title){
            System.out.println();
            System.out.println(title);
            for(int i = 0; i < mokiniai.length; i++) {
                print(i);
            }
        }

        /*
        indeksas: 0  1  2  3 4 5
        korta:    4  8  5  7 1 2
        1:        1* 8  5  7 4 2
        2:        1  2* 8  7 5 2
        3:

        0. Is visu nuo 0 iki 5 isrinkti maziausia ir padeti i 0 (!) pizicija -> (1 8 5 7 4 2)
        1. Is visu nuo 1 iki 5 isrinkti maziausia ir padeti i 1 pozicija
        ...
        n. Is visu nuo n iki 5 isrinkti maziausia ir padeti i n pozicija
         */

    static void sukeiciamMokinius(int i, int j) {
        Mokykla mokinys = mokiniai[i];
        mokiniai[i] = mokiniai[j];
        mokiniai[j] = mokinys;
    }

    static void pagalKlase(){
            for(int zingsnis = 0; zingsnis < mokiniai.length - 1; zingsnis++){

                for (int i = zingsnis; i < mokiniai.length; i++){

                    if(mokiniai[i].getKlase() < mokiniai[zingsnis].getKlase()){
                        //mokiniai[i] <-> mokiniai[zingsnis]
                        sukeiciamMokinius(i, zingsnis);
                    }
                }
            }
    }

    static void pagalVarda(){
        for(int zingsnis = 0; zingsnis < mokiniai.length - 1; zingsnis++){

            for (int i = zingsnis; i < mokiniai.length; i++){

                if(mokiniai[i].getVardas().compareTo(mokiniai[zingsnis].getVardas()) < 0){
                    //mokiniai[i] <-> mokiniai[zingsnis]
                    sukeiciamMokinius(i, zingsnis);

                }
            }
        }
    }
    static void pagalKlasePavardeVarda(){
        for(int zingsnis = 0; zingsnis < mokiniai.length - 1; zingsnis++){

            for (int i = zingsnis; i < mokiniai.length; i++){

                if(mokiniai[i].getKlase() < mokiniai[zingsnis].getKlase()) {
                    sukeiciamMokinius(i, zingsnis);

                } else if(mokiniai[i].getKlase()== mokiniai[zingsnis].getKlase()) {
                    if(mokiniai[i].getPavarde().compareTo(mokiniai[zingsnis].getPavarde()) < 0){
                        sukeiciamMokinius(i, zingsnis);

                    } else if(mokiniai[i].getPavarde().compareTo(mokiniai[zingsnis].getPavarde())  == 0){
                        if(mokiniai[i].getVardas().compareTo(mokiniai[zingsnis].getVardas()) < 0){
                            sukeiciamMokinius(i, zingsnis);
                        }
                    }
                }
            }
        }
    }
    // Sorto kamparatorius
    static void pagalVardaPavardeKlase() {
        Arrays.sort(mokiniai, (m1, m2) -> {
            int pagalVarda = m1.getVardas().compareTo(m2.getVardas());
            if (pagalVarda != 0) return pagalVarda;

            int pagalPavarde = m1.getPavarde().compareTo(m2.getPavarde());
            if (pagalPavarde != 0) return pagalPavarde;

            return Integer.compare(m1.getKlase(), m2.getKlase());
        });
    }
}
