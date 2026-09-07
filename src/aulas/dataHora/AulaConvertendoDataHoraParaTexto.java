package aulas.dataHora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class AulaConvertendoDataHoraParaTexto {

    public static void main(String[] args){

        LocalDate d04 = LocalDate.parse("2022-07-20");
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant d06 = Instant.parse("2022-07-20T01:30:26Z");

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        // Para imprimir datas/horas globais, ou seja, com fuso horário (Instant), não dá pra fazer do mesmo jeito que fazemos para data/hora locais. Tem que informar o fuso horário!
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault()); // Nesse exemplo, o fuso horário a ser usado é o da máquina do usuário
        DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME; // Consultar nas docs do DateTimeFormatter os nomes dos padrões prontos que eles tem (pode usar esses nomes ao invés de especificar o formato, como foi feito acima.
        DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT; // Aplica o formato ISO8601 para datas/horas com fuso horário (Classe Instant). Como o fuso horário não foi informado, será usado o GMT (do padrão UTC)

        System.out.println("d04 em ISO8601 = " + d04); // Assim será chamado o método toString() que vai retornar a data no formato ISO8601, que é o padrão do Java
        System.out.println("d04 em formato customizado = " + d04.format(fmt1));
        System.out.println("d04 em formato customizado = " + fmt1.format(d04)); // Equivalente a linha acima

        System.out.println();

        System.out.println("d05 em ISO8601 = " + d05);
        System.out.println("d05 em formato customizado (fmt1) = " + d05.format(fmt1));
        System.out.println("d05 em formato customizado (fmt2) = " + d05.format(fmt2));
        System.out.println("d05 usando o pattern ISO_DATE_TIME = " + d05.format(fmt4));

        System.out.println();

        System.out.println("d06 em ISO8601 = " + d06);
        System.out.println("d06 em formato customizado = " + fmt3.format(d06)); // A classe Instant não tem o método format, por isso chamamos a partir do fmt3
        System.out.println("d06 usando o pattern ISO_INSTANT = " + fmt5.format(d06));

    }

}
