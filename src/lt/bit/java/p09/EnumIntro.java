package lt.bit.java.p09;

public class EnumIntro {
    public static void main(String[] args) {
        System.out.println("Enum Intro");

        Color spalva = Color.GREEN;
        System.out.println(" Spalva = " + spalva); // toString() metodas
        System.out.println(" Spalvos pavadinimas = " + spalva.name());
        System.out.println(" Spalvos vieta = " + spalva.ordinal());

         spalva = Color.RED;
        System.out.println(" Spalva = " + spalva);
        System.out.println(" Spalvos pavadinimas = " + spalva.name());
        System.out.println(" Spalvos vieta = " + spalva.ordinal());

        spalva = null;
        System.out.println("spalva = " + spalva);

        String tekstas = null;
        System.out.println(tekstas  == null ? "tekstas" : tekstas.toString());

        tekstas = "null";

    }
}
