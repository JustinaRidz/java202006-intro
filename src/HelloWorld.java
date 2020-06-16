import java.util.Date;


public class HelloWorld {

    public static void main(String[] args) {

        byte b = 0b0100_1111;                  // 1 baitas uzima 1 baita (8 bitus)
        short s = 0b0111_1001_0001_1000 ;      // 1 short'as uzima 2 baitus (16 bitus)
        int i = 0xaf | 2 & 0b111;              // 1 int'as uzima 4 baitus (32 bitus)
        long l = s;                            // 1 long'as uzima 8 baitus (64 bitus)
        char c = 'A';                          // 1 char'as uzima 2 baitus (16 bitus)
             c = 'Ž';                          // char'e rasome simbolius viengubose kabutese
        char c2 = '\u2655';
        char c3 = '\'';
        char c4 = '\\';
        char c5 = (char) (c4 + 1);

        //  atmintis iki 10000: "123.Tekstas.....104"
        //  text <- 10000
        //
        String text = 5 + 123.45 + "Tekstas '" + c2 + "' " +
                "\n tekstas isvestas is naujos eilutes \t Isveda didesni tarpa \\Irasome i teksta flasha \"Isvestas tekstas su kabutemis\" " +
                (100 + 4); // ... 104
        System.out.println(text);
        System.out.println("123" + 4);

        // ...
        // textNieko <- 0
        String textNieko = null;
        Date data = null;

        /*
        bitas - 0 arba 1
        0 - 0
        1 - 1
        2 - 10
        3 - 11
        4 - 100
        5 - 101
        6 - 110
        7 - 111
        8 - 1000
        9 - 1001
        10 - 1010
        11 - 1011
         ...
        15 - 1111
        16 - 10000

        0011 +
        0001
        -----
        0100

        sesioliktaine sistema
        0, 1, 2, 3, 4, 5, 7, 8, 9, a, b, c, d, e, f

        0..9 = 0..9
        10   = a
        11   = b
        12   = c
        13   = d
        14   = e
        15   = f
        16   = 10
        31   = 1f = 0001 1111  // is sesioliktaines sistemos lengva paversti i bitus
               a6 = 1010 0110  //  1-0001, f-15-1111
         */

        System.out.println("-------boolean-------");
        float f = 0.0f;
        double d = 123.4;

        System.out.println(d/f);

        boolean boo = true;
        boolean boo2 = !(2 > 3);
        boolean boo3 = boo || (boo2 && 10 < 9);   //Jei pirmas operatorius reiskia true, tai toliaus java programa nieko nevykdo.

        System.out.println(boo2);
        System.out.println(boo3);

        System.out.println("Hello World");
        System.out.println("Labutis");
        System.out.println(123);



        System.out.println("-------Priskyrimai--------");
        // i1 -> 0x2000 -> 100
        // i2 -> 0x2008 -> 100
        //
        int i1 = 100;
        int i2 = i1;
            i1 = 200;
        System.out.println(i2);


        System.out.println("---------Masyvas--------");
        //
        //  RAM:  0x1ADD -> [10, 20, 30]
        //  i3 -> 0x2000 -> 0x1ADD
        //  i4 -> 0x2004 -> 0x1ADD
        //
        int[] i3 = {10, 20, 30}; // new int[] {10, 20, 30};
        int[] i4 = i3;
              i3[0] = 9;
        for (int index = 0; index < i4.length; index++) {
            System.out.print(i4[index] + " ");
        }
        System.out.println();
        System.out.println("--------");

        // 0 1 2
        int[] i5 = new int[3];   //kuriant sudetinga tipa kartias naudojam "new"
        i5[2] = 99;
        for (int index = 0; index < i5.length; index++) {
            System.out.print(i5[index] + " ");
        }
        System.out.println();

        /*
        kintamuju pavadinimas
        1  abc -
        2  abc1 +
        3  1abc -
        4  $abc -
        5  a_b +
        6  a-b +
        7  _ab +
        8  ežys -
        */

        System.out.println("------Masyvu masyvas-------");

        int[][] m1 = {
                {10, 11, 12}, // m1[0]
                {22, 23, 24}, // m1[1]
                {30, 31}      // m1[2]
        };
        System.out.println("m1 masyvo ilgis yra: " + m1.length);

        for (int eilutesIndex = 0; eilutesIndex < m1.length; ++eilutesIndex ) {
            // atspausdinti eilute
            int[] eilute = m1[eilutesIndex];
            for (int stulpelioIndex = 0; stulpelioIndex < eilute.length; stulpelioIndex++ ) {

                 System.out.print(eilute[stulpelioIndex] + " ");
            }
            System.out.println();
        }

        int[] m2 = m1[1];
        int m23 = m2[2];    // 24
            m23 = m1[1][2];     // 24

        int[][] m3 = new int[3][];
        m3[0] = new int[3];
        m3[1] = new int[3];
        m3[2] = new int[2];

        m3[2][1] = 31;

        System.out.println("----Foreach ciklas----");
        for (int[] eilute : m1) {
            for (int elem : eilute) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }

        System.out.println("---------");
        System.out.println("reiksmes: ++x, --y, x++, y--");

        int a1 = 10;
        //       1 + 11 (a1=11) + 11 (a1=12)
        int a2 = 1 + ++a1       + a1++;
        System.out.println("a1=" + a1 + " a2=" + a2);

        System.out.println("----While ciklas-----");
        int ind = 3;
        while (--ind > 0) { // 2 > 0, 1 > 0, 0 ? 0
            System.out.println(Math.random());
        }

        System.out.println("----DoWhile ciklas-----");
        ind = 3;
        do {
            System.out.println(Math.random());
        } while (ind-- > 0);


    }

}