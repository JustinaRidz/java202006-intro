public class DideliuSkaiciuSudetis {
    public static void main(String[] args) {
        byte[] didelisSakicius1 = new byte[10];
        byte[] didelisSakicius2 = new byte[10];


        //123456789 i baitus dedasi atbuline tvarka -> 987654321
        //7893
        didelisSakicius1[0] = 3;
        didelisSakicius1[1] = 9;
        didelisSakicius1[2] = 8;
        didelisSakicius1[3] = 7;

        //1236
        didelisSakicius2[0] = 6;
        didelisSakicius2[1] = 3;
        didelisSakicius2[2] = 2;
        didelisSakicius2[3] = 1;

        spausdinti(didelisSakicius1);
        System.out.print(" + ");
        spausdinti(didelisSakicius2);

        byte[] rezultatas = suma(didelisSakicius1, didelisSakicius2);
        System.out.print(" = ");
        spausdinti(rezultatas);

    }

    //000222
    //000678
    static byte[] suma(byte[] p1, byte[] p2){
        byte[] rezultatas = new byte[p1.length];

        int mintyje = 0;
        for (int i = 0; i < p1.length; i++) {
            int x = p1[i] + p2[i] + mintyje;
            if (x <= 9){
                rezultatas[i] = (byte) x;
                mintyje = 0;
            } else {
                // 17 -> 7   16 -> 6   21 -> 1 i rezultata eina vienetai
                rezultatas[i] = (byte) (x % 10);
                mintyje = x / 10;
            }
        }
        return rezultatas;
    }
        static void spausdinti(byte[] skaicius){
            for (int i = skaicius.length - 1; i >= 0; i--) {
                System.out.print(skaicius[i]);
            }
        }
}
