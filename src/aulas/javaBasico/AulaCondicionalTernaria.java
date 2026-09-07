package aulas.javaBasico;

public class AulaCondicionalTernaria {

    public static void main(String[] args){
        // Expressão Condicional Ternária
        // (condicao) ? valor_se_verdadeiro : valor_se_falso
        // (2 > 4) ? 50 : 80 -> vai retornar 80

        double preco = 34.5;
        double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;


        System.out.println(desconto);
    }

}
