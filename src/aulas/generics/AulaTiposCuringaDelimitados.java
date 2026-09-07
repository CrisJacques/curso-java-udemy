package aulas.generics;

import model.entities.*;

import java.util.ArrayList;
import java.util.List;

public class AulaTiposCuringaDelimitados {

    public static void main(String[] args){

        List<ShapeInterface> myShapes = new ArrayList<>();
        myShapes.add(new Rectangle1(3.0, 2.0));
        myShapes.add(new Circle1(2.0));

        List<Circle1> myCircles = new ArrayList<>();
        myCircles.add(new Circle1(2.0));
        myCircles.add(new Circle1(3.0));

        //System.out.println("Total area: " + totalArea(myCircles)); // Essa linha vai dar erro porque List<ShapeInterfacw> não é um supertipo de
        //List<Circle1>. Isso significa que o método totalArea() só vai funcionar para List<ShapeInterface>
        // Para que o método totalArea() passe a funcionar também para subtipos de ShapeInterface, será preciso usar curinga delimitado: ? extends ShapeInterface

        System.out.println("Total area: " + totalArea(myShapes));
    }

    public static double totalArea(List<? extends ShapeInterface> list) {
        // Assim como acontece com os tipos curinga, em listas de tipos curinga delimitados não é possível adicionar elementos
        // O nome disso é covariância, ou seja, consigo acessar elementos da lista mas não consigo colocar elementos na lista (ou seja, alterar a lista):
        // - get - OK, é permitido
        // - put - ERROR, não é permitido
        // A covariância ocorre quando se tenta inserir objetos de um tipo mais específico em uma lista de um tipo mais genérico. O compilador não deixa fazer isso
        //porque ele não tem como saber se o objeto que está tentando ser inserido é compatível com os elementos já existentes na lista.

        // Também existe o inverso da covariância, que é a contravariância, onde consigo inserir elementos na lista mas não consigo acessá-los:
        // - get - ERROR, não é permitido
        // - put - OK, é permitido

        double sum = 0.0;
        for (ShapeInterface s : list){
            sum += s.area();
        }
        return sum;
    }

}
