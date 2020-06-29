package lt.bit.java.p09.namai.NamuDarbai.mokiniai;

public class Mokinys {
        private String vardas;
        private String pavarde = "";  //bus visada priskiriama, nesvarbu kaip bus kostruota
        private int klase;
        private int[] trimestras;

    public Mokinys() {
    }

    //
    //Svarbiausi ne parapetrai, o kokie ju tipai.
    //

    public Mokinys(String vardas, String pavarde, int klase, int[] trimestras) {
             this(vardas, pavarde);
             this.klase = klase;
             this.trimestras = trimestras;
        }


    public Mokinys(String vardas, String pavarde) {
        //TODO patikrinti ar teisingas vardas ir pavarde
        this.vardas = vardas;
        this.pavarde = pavarde;
        this.klase = 1;
    }

        public String pilnasVardas() {
            return (this.vardas == null ? "" : this.pavarde) + " " +
                    (this.pavarde == null ? "" : this.pavarde);
        }

        public String pilnasVardas(String titulas) {
            return titulas + " " + pilnasVardas();
        }

        public int[] getTrimestras() {
            return trimestras;
        }

        public void setTrimestras(int[] trimestras){
            //TODO prideti patirkinima ar trimestro
            // pazumiai yre nuo 1 iki 10
            this.trimestras = trimestras;  // "this" nurodo klases lauka.
        }

        public String getVardas(){
            return vardas;
        }

        public void setVardas(String vardas) {
            this.vardas = vardas;
        }

        public String getPavarde() {
            return pavarde;
        }

        public void setPavarde(String pavarde) {
            this.pavarde = pavarde;
        }

        public int getKlase() {
            return klase;
        }

        public void setKlase(int klase) {
            this.klase = klase;
        }

        @Override
        public String toString() {
            return klase + " " + vardas + " " + pavarde;
        }
}
