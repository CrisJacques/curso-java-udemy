package aulas.javaBasico;

public class AulaStrings {

    public static void main(String[] args){

        String original = "abcde FGHIJ ABC abc DEFG   ";
        System.out.println("String original: -" + original + "-");

        // Convertendo para minísculas
        String s01 = original.toLowerCase();
        System.out.println("Em minúsculas: -" + s01 + "-");

        // Convertendo para maiúsculas
        String s02 = original.toUpperCase();
        System.out.println("Em maiúsculas: -" + s02 + "-");

        // Eliminando os espaços nos cantos da string
        String s03 = original.trim();
        System.out.println("Usando o trim: -" + s03 + "-");

        // Criando substring a partir da posição 2 da palavra original
        String s04 = original.substring(2);
        System.out.println("Usando o substring(2): -" + s04 + "-");

        // Criando substring a partir da posição 2 e indo até a posição 9 da palavra original
        String s05 = original.substring(2, 9);
        System.out.println("Usando o substring(2, 9): -" + s05 + "-");

        // Substituindo o a pelo x
        String s06 = original.replace('a', 'x');
        System.out.println("Usando o replace('a', 'x'): -" + s06 + "-");

        // Substituindo o abc pelo xy
        String s07 = original.replace("abc", "xy");
        System.out.println("Usando o replace('abc', 'xy'): -" + s07 + "-");

        // Obtendo o primeiro index da substring "bc"
        int i = original.indexOf("bc");
        System.out.println("Primeiro index de 'bc': " + i);

        // Obtendo o último index da substring "bc"
        int j = original.lastIndexOf("bc");
        System.out.println("Último index de 'bc': " + j);
    }

}
