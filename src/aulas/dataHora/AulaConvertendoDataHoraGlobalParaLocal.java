package aulas.dataHora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class AulaConvertendoDataHoraGlobalParaLocal {

    public static void main (String[] args){

        LocalDate d04 = LocalDate.parse("2022-07-20");
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant d06 = Instant.parse("2022-07-20T01:30:26Z");

        LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault()); // Convertendo uma data-hora global (Instant) para o fuso horário da minha máquina (ZoneId.systemDefault())
        LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal")); // Convertendo uma data-hora global (Instant) para o fuso horário de Portugal
        LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
        LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));

        System.out.println("d06 convertido para LocalDate com fuso horário da minha máquina: " + r1);
        System.out.println("d06 convertido para LocalDate com fuso horário de Portugal: " + r2);
        System.out.println("d06 convertido para LocalDateTime com fuso horário da minha máquina: " + r3);
        System.out.println("d06 convertido para LocalDateTime com fuso horário de Portugal: " + r4);

        System.out.println();

        System.out.println("d04 dia = " + d04.getDayOfMonth());
        System.out.println("d04 mês = " + d04.getMonthValue());
        System.out.println("d04 ano = " + d04.getYear());

        System.out.println();

        System.out.println("d05 dia = " + d05.getDayOfMonth());
        System.out.println("d05 mês = " + d05.getMonthValue());
        System.out.println("d05 ano = " + d05.getYear());
        System.out.println("d05 hora = " + d05.getHour());
        System.out.println("d05 minutos = " + d05.getMinute());
        System.out.println("d05 segundos = " + d05.getSecond());

        // For que retorna todos os fusos horários customizados disponíveis (o "Portugal" usado acima é uma das centenas de opções retornadas)
//        for (String s : ZoneId.getAvailableZoneIds()){
//            System.out.println(s);
//        }

    }

}
