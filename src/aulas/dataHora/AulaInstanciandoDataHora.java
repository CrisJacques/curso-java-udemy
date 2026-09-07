package aulas.dataHora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class AulaInstanciandoDataHora {

    public static void main(String[] args){

        // ============================== Diferentes formas de criar a data e hora atual ==============================
        LocalDate d01 = LocalDate.now(); // Gera apenas a data local
        LocalDateTime d02 = LocalDateTime.now(); // Gera a data e hora local atual
        Instant d03 = Instant.now(); // Gera a data e hora global (com fuso horário) atual

        // ============================== Transformando strings no formato ISO 8601 em Data-hora ==============================
        LocalDate d04 = LocalDate.parse("2022-07-20");
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant d06 = Instant.parse("2022-07-20T01:30:26Z"); // o Z no final que dizer fuso horário GMT (padrâo UTC)
        Instant d07 = Instant.parse("2022-07-20T01:30:26-03:00"); // o -03:00 no final está especificando um fuso horário diferente do GMT (horário de São Paulo)

        // ============================== Transformando texto em formato customizado em Data-hora ==============================
        //LocalDate d08 = LocalDate.parse("20/07/2022");// Se fizer direto assim vai dar DateTimeParseException, pois não deixamos explícito em que formato está a String fornecida
        // No documentação do DateTimeFormatter tem todas as formas de se informar qual o formato da data que está sendo fornecida na String (ou seja, o pattern)
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        LocalDate d08 = LocalDate.parse("20/07/2022", fmt1);
        LocalDateTime d09 = LocalDateTime.parse("20/07/2022 01:30", fmt2);

        // ============================== Transformando dados isolados de dia, mês, ano e horário em Data-hora ==============================
        LocalDate d10 = LocalDate.of(2022, 7, 20);
        LocalDateTime d11 = LocalDateTime.of(2022, 7, 20, 1, 30); // Existem várias sobrecargas para este método, possibilitando diferentes formas de informar os dados necessários

        // ============================== Imprimindo as datas e horas geradas ==============================
        System.out.println("d01 = " + d01);
        // Também dá pra fazer System.out.println("d01 = " + d01.toString());
        // O método toString() dos objetos de data e hora já traz eles no formato ISO, conforme mostrado na saída do prompt
        // Lembrando que ao usar println() já é chamado automaticamente o toString() do objeto que está sendo passado no argumento
        System.out.println("d02 = " + d02);
        System.out.println("d03 = " + d03);
        System.out.println("d04 = " + d04);
        System.out.println("d05 = " + d05);
        System.out.println("d06 = " + d06);
        System.out.println("d07 = " + d07);
        System.out.println("d08 = " + d08);
        System.out.println("d09 = " + d09);
        System.out.println("d10 = " + d10);
        System.out.println("d11 = " + d11);

    }

}
