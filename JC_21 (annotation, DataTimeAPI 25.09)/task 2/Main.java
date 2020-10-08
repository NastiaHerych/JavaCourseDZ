package com.company;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Date date = new Date();
        System.out.println("DATE:");
        System.out.println(date);
        System.out.println("LOCAL DATE:");
        System.out.println(ToLocalDate(date));
        System.out.println("LOCAL TIME:");
        System.out.println(ToLocalTime(date));
        System.out.println("LOCAL DATE TIME:");
        System.out.println(ToLocalDateTime(date));
    }

    public static LocalDate ToLocalDate(Date date) {
        ZonedDateTime zdt = date.toInstant().atZone(ZoneId.systemDefault());
        return zdt.toLocalDate();
    }

    public static LocalTime ToLocalTime(Date date) {
        ZonedDateTime zdt = date.toInstant().atZone(ZoneId.systemDefault());
        return zdt.toLocalTime();
    }

    public static LocalDateTime ToLocalDateTime(Date date) {
        ZonedDateTime zdt = date.toInstant().atZone(ZoneId.systemDefault());
        return zdt.toLocalDateTime();
    }
}
