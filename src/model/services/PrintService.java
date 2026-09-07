package model.services;

import java.util.ArrayList;
import java.util.List;

public class PrintService<T> {
    // O T pode ser qualquer outro nome. A ideia é que quando instanciarmos essa classe, ela só vai aceitar o tipo que definirmos entre as <> no momento da instanciação
    // (igual é feito quando instanciamos List, por exemplo: List<Integer> = new ArrayList<>())

    List<T> list = new ArrayList<>();

    public void addValue(T value){
        list.add(value);
    }

    public T first(){
        if (list.isEmpty()){
            throw new IllegalStateException("List is empty");
        }
        return list.getFirst();
    }

    public void print(){
        if (list.isEmpty()){
            throw new IllegalStateException("List is empty");
        }
        StringBuilder listToPrint = new StringBuilder("[");
        listToPrint.append(list.getFirst());

        for(int i = 1; i< list.size(); i++){
            listToPrint.append(", ").append(list.get(i));
        }

        listToPrint.append("]");

        System.out.println(listToPrint.toString());
    }

}
