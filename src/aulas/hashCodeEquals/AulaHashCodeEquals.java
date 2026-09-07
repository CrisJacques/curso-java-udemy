package aulas.hashCodeEquals;

import model.entities.Client;

public class AulaHashCodeEquals {

    public static void main(String[] args){

        Client c1 = new Client("Maria", "maria@gmail.com");
        Client c2 = new Client("Alex", "alex@gmail.com");

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c1.equals(c2));

//        Client c1 = new Client("Maria", "maria@gmail.com");
//        Client c2 = new Client("Maria", "maria@gmail.com");
//
//        System.out.println(c1.equals(c2)); // retorna true
//        System.out.println(c1 == c2); // retorna false, porque o == não compara conteúdo, compara referências de memória (a única exceção são strings literais, tipo "Test")

//        String s1 = new String("Test");
//        String s2 = new String("Test");
//        System.out.println(s1 == s2); // vai dar false porque eu não usei string literal, se eu usar aí dá true:
//        String s3 = "Teste";
//        String s4 = "Teste";
//        System.out.println(s3 == s4); // vai dar true

    }

}
