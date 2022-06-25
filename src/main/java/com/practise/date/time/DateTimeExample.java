package com.practise.date.time;

import java.time.*;

public class DateTimeExample {

    public static void main(String[] args) {

        LocalDate lDate = LocalDate.now();
        System.out.println(lDate);

        int dd = lDate.getDayOfMonth();
        int mm = lDate.getMonthValue();
        int yyyy = lDate.getYear();

        System.out.println(dd + "..." + mm + "..." + yyyy);
        System.out.printf("%d-%d-%d :", dd, mm, yyyy);

        LocalTime time = LocalTime.now();
        System.out.println(time);

        int hour = time.getHour();
        int m = time.getMinute();
        int seconds = time.getSecond();
        int nano = time.getNano();
        System.out.printf("\n %d:%d:%d:%d ->", hour, m, seconds, nano);

        LocalDateTime dtime = LocalDateTime.now();
        System.out.println(dtime);

        LocalDate localDate = LocalDate.now();
        LocalDate birthDate = LocalDate.of(1982, 2, 23);
        Period p = Period.between(localDate, birthDate);
        System.out.printf("%d years %d months %d days", p.getYears(), p.getMonths(), p.getDays());

        LocalDate deathDate = LocalDate.of(1982 + 75, 2, 23);
        Period p1 = Period.between(localDate, deathDate);
        System.out.printf("\n Death Date : %d years %d months %d days", p1.getYears(), p1.getMonths(), p1.getDays());

        for (String s : ZoneId.getAvailableZoneIds()) {
            System.out.println(s);
        }

        ZoneId def = ZoneId.systemDefault();
        System.out.println(def);

        //Minutes b/n two dates
        LocalDateTime startDate = LocalDateTime.now().minusDays(1);
        LocalDateTime endDate = LocalDateTime.now();

        long minutes = Duration.between(startDate, endDate).toMinutes();
        System.out.println("Minutes :" + minutes);
        // or
        //long minutes2 = ChronoUnit.MINUTES.between(startDate, endDate);


    }


}
