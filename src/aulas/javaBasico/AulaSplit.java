package aulas.javaBasico;

public class AulaSplit {

    public static void main(String[] args){

        String s = "potato apple lemon orange";

        String[] vect = s.split(" ");

        for(int i = 0; i < vect.length; i++){
            System.out.printf("Palavra %d: %s%n", i, vect[i]);
        }

    }

}
