package aulas.javaBasico;

public class AulaCasting {
    public static void main (String[] args){
        int a, b;
        double resultado;

        a = 5;
        b = 2;

        resultado = (double) a/b; // Casting (conversão explícita de dados)

        System.out.println(resultado);
    }
}
