package model.exceptions;

// Exceptions que herdam de Exception são exceções que o compilador nos obriga a tratar ou propagar (se não tratarmos/propagarmos o código fica vermelho)
// Já Exceptions que herdam de RuntimeException são exceções que o compilador não nos obriga a tratar/propagar (se não tratarmos/propagarmos não dá erro no código)
public class DomainException extends Exception {
    public DomainException(String message) {
        super(message);
    }
}
