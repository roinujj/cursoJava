package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Program {
    public static void main(String[] args) {
        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();
        Instant d03 = Instant.now();

        LocalDate d04 = LocalDate.parse("2024-06-10");
        LocalDateTime d05 = LocalDateTime.parse("2024-06-11T01:30:26");

        Instant d06 = Instant.parse("2024-06-11T01:30:26Z");
 //       Instant d07 = Instant.parse("2024-06-11T01:30:26-3:00");

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate d08 = LocalDate.parse("11/06/2024", DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        LocalDateTime d09 = LocalDateTime.parse("11/06/2005 20:20", fmt2); // funciona com o fmt ou direto com a expressão

        LocalDateTime d10 = LocalDateTime.of(2024,6,11,20,27,30);




        System.out.println(d01);
        System.out.println(d02);
        System.out.println(d03);
        System.out.println(d04);
        System.out.println(d05);
        System.out.println(d06);
 //       System.out.println(d07);
        System.out.println(d08);
        System.out.println(d09);
        System.out.println(d10);
    }
}
