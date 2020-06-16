import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Objects;
import java.util.Scanner;

public class KalkuliatoriusKonsoleje {
    public static void main(String[] args) {
        System.out.println("Sakaiciuosime!");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Iveskite pirma skaiciu: ");
        int pirmas = scanner.nextInt();

        System.out.print("Iveskite operacija (+ - * / %): ");
        String operacija = scanner.next();

        System.out.print("Iveskite antra skaiciu: ");
        int antras = scanner.nextInt();

        int rezultatas = skaiciavimas(operacija, pirmas, antras);
        System.out.println(pirmas + " " + operacija + " " + antras + " = " + rezultatas);
    }

    // cia galima kurti kitus metodus (funkcijas)
    static int skaiciavimas(String op, int p1, int p2) {
//        int rezultatas = 0;
//
//        if (Objects.equals(op,  "+")) {
//            rezultatas = p1 + p2;
//        } else if (Objects.equals(op,  "-")) {
//            rezultatas = p1 - p2;
//        } else if (Objects.equals(op,  "/")){   // padalins be liekanos, apvalins
//            rezultatas = p1 / p2;
//        } else if (Objects.equals(op,  "*")){
//            rezultatas = p1 * p2;
//        } else if (Objects.equals(op,  "%")) {   // isves liekana
//            rezultatas = p1 % p2;
//        }
//        return rezultatas;
// -------KITA FORMA-----------
//        return Objects.equals(op, "+") ? (p1 + p2) :  // klaustukas zymi reiksme true arba false, dvitaskis zymi "else".
//               Objects.equals(op, "-") ? p1 - p2 :
//               Objects.equals(op, "/") ? p1 / p2 :
//               Objects.equals(op, "*") ? p1 * p2 :
//               Objects.equals(op, "%") ? p1 % p2 : 0;
        int rezultatas;
        switch (op){
            case "+":
                rezultatas = p1 + p2;
                break;
            case "-":
                rezultatas = p1 - p2;
                break;
            case "/":
                rezultatas = p1 / p2;
                break;
            case "*":
                rezultatas = p1 * p2;
                break;
            case "%":
                rezultatas = p1 % p2;
                break;
            default:
                rezultatas = 0;
        }
        return rezultatas;
    }

}

class A {
    public static void main(String[] args) {
        System.out.println("m(2, 1, 3)= " + m(2, 1, 3) + " " + m1(2, 1, 3));
        System.out.println("m(2, 1, -3)= " + m(2, 1, -3) + " " + m1(2, 1, -3));
        System.out.println("m(-4, 2, -5)= " + m(-4, 2, -5) + " " + m1(-4, 2, -5));
        System.out.println("m(-4, -2, -5)= " + m(-4, -2, -5) + " " + m1(-4, -2, -5));
        System.out.println("m(1, 8, 3)= " + m(1, 8, 3) + " " + m1(1, 8, 3));

        System.out.println("--------------------");
        test();

    }

    static int m(int a, int b, int c) {

        if (a > b) {
            if (c > 0) return c + 1;
            else return c - 1;
        } else if (a > c) {
            if (b > 0) return b + 1;
            else return b + 10;
        } else
            return a + b + c;
    }
    static int m1(int a, int b, int c){

        return (a > b)
               ? ((c > 0) ? (c + 1) : (c - 1))
               : ((a > c)
                        ? ((b > 0) ? (b + 1) : (b + 10))
                        : (a + b + c));
    }

    static void test() {
        int a = 10;
        int b = 20;
        int c = 30;

        System.out.println(2 + 5 - 3 + ((((5 * 4) / 2) / 2)));  // pirmiausiai daugyba o paskui kitos operacijos bus vygdomos is kaires i desine
        System.out.println(((a + b) > (10 - c)) && (c != (40 - 5)));

        int m = 10;
        int n = m += 100;
        System.out.println("n = " + n);
    }
}

class A1{
    public static void main(String[] args) {
        int [] masyvas = {1, 4, 5, -6, 8};

        //suskaiciuoti masyvo elementu suma iki pirmo neigiamo
        int suma = 0;
        for (int i=0; i<masyvas.length; i++) {
            if(masyvas[i] < 0) break;
            suma += masyvas[i];
        }
        System.out.println("suskaiciuoti masyvo elementu suma iki pirmo neigiamo elemento = " + suma);

        //suskaiciuoti masyvo tik teigiamu elementu suma
        int suma2 = 0;
        for(int elementas :masyvas) {
            if (elementas < 0) continue;  // praleidzia neigiamus skaicius
            suma2+= elementas;
        }
        System.out.println("masyvo tik teigiamu elementu suma = " + suma2);
    }
}