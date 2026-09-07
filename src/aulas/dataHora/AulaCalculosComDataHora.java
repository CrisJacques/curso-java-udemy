package aulas.dataHora;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class AulaCalculosComDataHora {

    public static void main(String [] args){

        // Objetos data-hora no Java são imutáveis, ou seja, não dá para alterar o valor depois que instancia.
        // Se precisarmos de por exemplo uma data do dia anterior, é preciso criar um objeto novo

        LocalDate d04 = LocalDate.parse("2022-07-20");
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant d06 = Instant.parse("2022-07-20T01:30:26Z");

        LocalDate pastWeekLocalDate = d04.minusDays(7);
        LocalDate nextWeekLocalDate = d04.plusDays(7);

        LocalDateTime pastWeekLocalDateTime = d05.minusDays(7);
        LocalDateTime nextWeekLocalDateTime = d05.plusDays(7);

        Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS);
        Instant nextWeekInstant = d06.plus(7, ChronoUnit.DAYS);

        Duration t1 = Duration.between(pastWeekLocalDate.atTime(0,0), d04.atTime(0, 0)); // o atTime converte um LocalDate para um LocalDateTime, informando hora
        // A forma acima é meio gambiarra, a forma mais elegante seria:
        //Duration t1 = Duration.between(pastWeekLocalDate.atStartOfDay(), d04.atStartOfDay());
        // Só dá pra calcular duração entre 2 LocalDateTime, entre 2 LocalDate dá UnsupportedTemporalTypeException
        Duration t2 = Duration.between(pastWeekLocalDateTime, d05);
        Duration t3 = Duration.between(pastWeekInstant, d06);
        Duration t4 = Duration.between(d06, pastWeekInstant); // Colocando a data mais recente primeiro ele retorna duração negativa

//===============================================================================================================================================
        System.out.println("d04 original = " + d04);
        System.out.println("7 dias antes de d04 = " + pastWeekLocalDate);
        System.out.println("7 dias após d04 = " + nextWeekLocalDate);

        System.out.println();

        System.out.println("d05 original = " + d05);
        System.out.println("7 dias antes de d05 = " + pastWeekLocalDateTime);
        System.out.println("7 dias após d05 = " + nextWeekLocalDateTime);

        System.out.println();

        System.out.println("d06 original = " + d06);
        System.out.println("7 dias antes de d06 = " + pastWeekInstant);
        System.out.println("7 dias após d06 = " + nextWeekInstant);

        System.out.println();

        System.out.println("t1 dias = " + t1.toDays());
        System.out.println("t2 dias = " + t2.toDays());
        System.out.println("t3 dias = " + t3.toDays());
        System.out.println("t4 dias = " + t4.toDays());


    }

}
