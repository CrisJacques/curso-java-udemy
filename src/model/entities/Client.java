package model.entities;

import java.util.Objects;

public class Client {

    private String name;
    private String email;

    public Client(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return Objects.equals(name, client.name) && Objects.equals(email, client.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, email);
    }

    //HashCode é rápido, mas em casos raros pode dar falso positivo:
    //    - Se o HashCode de 2 objetos for diferente, com certeza os objetos são diferentes
    //    - Porém, se o HashCode de 2 objetos for igual, muito provavelmente os objetos são iguais (pode haver colisão por coincidência, mas é bem raro)
    //Já o equals é 100% garantido, mas é mais lento
    //Muitas vezes na prática se usa uma combinação dos dois:
    //    - Para procurar por um dado em um conjunto gigantesco de dados, se usa o HashCode para ir comparando elemento a elemento
    //    - Quando for encontrado um elemento com HashCode igual ao do elemento que está sendo buscado, se usa o equals para confirmar se é igual mesmo

}
