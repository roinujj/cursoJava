package application;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {


        // Manipulação de Strings

/*        String original = "abcde FGHIJ ABC abc DEFG      ";

        String s01 = original.toLowerCase(Locale.ROOT);
        String s02 = original.toUpperCase();
        String s03 = original.trim();
        String s04 = original.substring(2);
        String s05 = original.substring(2, 9);
        String s06 = original.replace('a', 'x');
        String s07 = original.replace("abc", "xy");
        int i = original.indexOf("bc");
        int j = original.lastIndexOf("bc");

        System.out.println(s01);
        System.out.println(s02);
        System.out.println(s03);
        System.out.println(s04);
        System.out.println(s05);
        System.out.println(s06);
        System.out.println(s07);
        System.out.println(i);
        System.out.println(j);
 */


        // Manipulação de Strings para Vetor

/*        String s = "2 Hamburgueres, Alface, Queijo, Molho Especial, Cebola, picles, Pão com Gergelim";
        String[] vect = s.split(", ");
        System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n%s%n", vect[0], vect[1], vect[2], vect[3], vect[4], vect[5], vect[6]);
*/
        // Ou com for ....


        String s = "2 Hamburgueres, Alface, Queijo, Molho Especial, Cebola, picles, Pão com Gergelim";
        String[] vect = s.split(", ");

        // Itera sobre o array de palavras e exibe cada uma em uma nova linha
        for (String item : vect) {
            System.out.printf("%s%n", item);
        }


    }
}

