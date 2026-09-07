package model.services;

import java.util.List;

public class CalculationService {
    //     Como eu não coloquei o <T> na classe, eu devo colocar o <T> no método (para indicar que ele é parametrizado)
    //     Ver na classe PrintService.java, que foi colocado o <T> na classe, aí não foi necessário colocar nos métodos
    //     Lembrando que no <T>, o T poderia ser qualquer outro nome, e serve para indicar que a classe ao ser instanciada informando um tipo, somente
    //aquele tipo será aceito pela classe (assim como é feito quando instanciamos List<>)
    //     Com esse recurso, é possível que uma mesma classe processe objetos de diversos tipos, sem ter que implementar uma classe para lidar com strings
    //e outra para double, por exemplo.
    public static <T extends Comparable<T>> T max(List<T> list){
        //     Foi preciso especificar que T seja compatível com Comparable para garantir que ele possua o método compareTo(), que é usado no algoritmo deste método
        //     Por isso que <T extends Comparable<T>> é um genérico delimitado
        // Ou seja, queremos dizer que T deve implementar a interface Comparable (não usamos implements, porque "implements" não pode ser usado como bound de um tipo genérico)
        // Ou seja, "extends" tem um significado diferente quando estamos falando de generics (diferente de quando estamos falando de herança)

        //     Se quiséssemos algo mais genérico ainda, poderíamos dizer: public static <T extends Comparable<? super T>> T max(List<T> list)
        // Isso significa que também servem quaisquer superclasses de T, desde que herdem de Comparable

        if (list.isEmpty()){
            throw new IllegalStateException("List can't be empty");
        }
        T max = list.getFirst();
        for (T item : list){
            if (item.compareTo(max) > 0) {
                max = item;
            }
        }
        return max;
    }

}
