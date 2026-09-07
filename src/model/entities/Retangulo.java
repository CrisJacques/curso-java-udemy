package model.entities;

import model.enums.Color;

public class Retangulo extends Shape{
    // Como a classe Retangulo herda de uma classe abstrata (Shape) e Retangulo não é abstrata, ela é obrigada a sobrescrever o metodo area(), que é abstrato na classe base

    private Double width;
    private Double height;

    public Retangulo(){
        super();
    }

    public Retangulo(Color color, Double width, Double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    @Override
    public double area() {
        return this.width * this.height;
    }
}
