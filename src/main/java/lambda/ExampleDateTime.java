package lambda;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;

public class ExampleDateTime {
    public static void main(String[] args) {
        LocalDate today=LocalDate.now();
        System.out.println(today);
        System.out.println(today.getDayOfYear());

        LocalTime time= LocalTime.now();
        System.out.println();
        String message="Revanth";

        LocalTime localtime= LocalTime.of(23,12,12);
        System.out.println(localtime);

        LocalTime later=time.plusHours(1);

        LocalDateTime specificDateandTime= LocalDateTime.of(2024,9,13,14,30,45);
        System.out.println(specificDateandTime.plusDays(10));

    }
}
