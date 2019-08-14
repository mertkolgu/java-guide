package com.javase._40.locale;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class LocaleTest02 {

    public static void main(String[] args) {

        Date date = new Date();
        Locale locDE = Locale.GERMANY;
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.FULL, locDE);

        Locale locIT = Locale.ITALY;
        DateFormat dateFormat1 = DateFormat.getDateInstance(DateFormat.FULL, locIT);

        Locale locTR = new Locale("tr", "TR");
        DateFormat dateFormat2 = DateFormat.getDateInstance(DateFormat.FULL, locTR);

        System.out.println(dateFormat.format(date));
        System.out.println(dateFormat1.format(date));
        System.out.println(dateFormat2.format(date));
    }
}