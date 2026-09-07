package model.entities;

public class Funcionario implements Comparable<Funcionario> {
// A classe precisa implementar a interface Comparable para poder usar o Collections.sort() para ordenar seus objetos (ver arquivo AulaInterfaceComparableOrdenandoObjetos.java)
    private int id;
    private String name;
    private double salary;

    public Funcionario(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void increaseSalary(double percentage){
        double increase = 1.0 + (percentage / 100.0);
        this.salary *= increase;
    }

    @Override
    public String toString() {
        return this.id + ", " + this.name + ", " + String.format("%.2f", this.salary);
    }

    @Override
    public int compareTo(Funcionario o) {
        // É preciso implementar esse método porque a classe implementa a interface Comparable
        // A ideia do método compareTo() é especificar como um objeto desta classe deve ser comparado com outro (ou seja, qual deve ser o atributo a ser usado para ordenar os objetos dessa classe)
        // E aí usamos o método compareTo() da classe que define o tipo do atributo (no caso deste exemplo, usamos o compareTo() da classe String, já que o atributo escolhido para ordenar os objetos é do tipo String)
        // No caso deste exemplo, a comparação deve ser feita a partir do nome do funcionário (obedecendo o enunciado do exercício do arquivo AulaInterfaceComparableOrdenandoObjetos.java)

        return name.compareTo(o.getName()); // Aqui estamos chamando o compareTo() da classe String, já que o atributo name é uma String
        //return -name.compareTo(o.getName()); // Se quiséssemos que a ordem fosse a inversa da original, basta colocar - na frente da expressão

        // O método compareTo sempre tem que retornar um inteiro, seguindo a lógica abaixo:
        // - Número positivo: o primeiro objeto a ser comparado é maior do que o segundo
        //     Exemplo: System.out.println("maria".compareTo("alex")); // Como maria é maior do que alex na ordem alfabética, vai retornar um número positivo
        // - Número negativo: o primeiro objeto a ser comparado é menor do que o segundo
        //     Exemplo: System.out.println("alex".compareTo("maria")); // Como alex é menor do que maria na ordem alfabética, vai retornar um número negativo
        // - Valor zero: o primeiro objeto a ser comparado é igual ao segundo
        //     Exemplo: System.out.println("maria".compareTo("maria")); // Como maria é igual a maria na ordem alfabética, vai retornar zero
    }
}
