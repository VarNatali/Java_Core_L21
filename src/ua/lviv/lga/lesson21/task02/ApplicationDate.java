package ua.lviv.lga.lesson21.task02;


import java.time.*;
import java.util.Date;

public class ApplicationDate {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println("Data convert to Date " + DataConvert(date));
        System.out.println("DataConvert to Time " + TimeConvert(date));
        System.out.println("DataConvert to Time " + DataTimeConvert(date));

    }

    public static LocalDate DataConvert(Date date) {
        Instant instant = date.toInstant();
        LocalDate localDate1 = instant.atZone(ZoneId.systemDefault()).toLocalDate();
        return (localDate1);


    }

    public static LocalTime TimeConvert(Date date) {
        Instant instant = date.toInstant();
        LocalTime localTime = instant.atZone(ZoneId.systemDefault()).toLocalTime();
        return (localTime);


    }

    public static LocalDateTime DataTimeConvert(Date date) {
        Instant instant = date.toInstant();
        LocalDateTime localDateTime = instant.atZone(ZoneId.systemDefault()).toLocalDateTime();
        return (localDateTime);


    }
}
