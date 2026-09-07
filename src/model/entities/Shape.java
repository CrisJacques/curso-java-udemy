package model.entities;

import model.enums.Color;

public abstract class Shape {
    // Classes abstratas não podem ser instanciadas, mas é importante que tenham construtores porque suas subclasses irão usar

    private Color color;

    public Shape(){

    }

    public Shape(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public abstract double area();
    // Métodos abstratos não possuem implementação. Se uma classe tiver pelo menos um método abstrato, ela acaba se tornando abstrata (ou seja o abstract na declaração da classe passa a ser obrigatório)
    // Métodos se tornam abstratos quando a classe base é genérica demais para eles poderem ter implementação
    // Um bom exemplo é esta classe (Shape), pois o método que calcula a área não tem como ter uma implementação, porque cada forma tem uma fórmula muito diferente para calcular a área
    // Por exemplo, a área de um retângulo é base x altura, enquanto a de um círculo é pi*r^2. Ou seja, não tem como generalizar a implementação, cada subclasse terá que ter a sua própria implementação do método area()

}
