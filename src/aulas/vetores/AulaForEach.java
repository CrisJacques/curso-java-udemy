package aulas.vetores;

public class AulaForEach {

    public static void main(String[] args){

        String[] vect = new String[]{ "Maria", "Bob", "Alex" };

        System.out.println("Imprimindo com for clássico: ");
        for (int i = 0; i < vect.length; i++){
            System.out.println(vect[i]);
        }

        System.out.println("Imprimindo com for each: ");
        for (String nome : vect){
            System.out.println(nome);
        }
    }

}
