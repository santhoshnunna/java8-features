package com.practise.utils;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Date;

/**
 *
 */
public class DateUtils {

    /**
     * @param startDate start date
     * @param endDate   end date
     * @return minutes between {startDate} and {endDate}
     */
    public static long getMinutesBetweenTwoDates(LocalDateTime startDate, LocalDateTime endDate) {
        return ChronoUnit.MINUTES.between(startDate, endDate);

    }

    /***
     *
     * @param startDate start date
     * @param endDate end date
     * @return seconds between {startDate} and {endDate}
     */
    public static long getSecondsBetweenTwoDates(LocalDateTime startDate, LocalDateTime endDate) {
        return ChronoUnit.SECONDS.between(startDate, endDate);
    }

    /**
     * @param date date
     * @return {LocalDateTime} for a given {Date}
     */
    public LocalDateTime convertToLocalDateTime(Date date) {
        return date.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
    }

    /**
     * @param date date
     * @return {LocalDate} for a given {Date}
     */
    public LocalDate convertToLocalDate(Date date) {
        return date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
    }
}
