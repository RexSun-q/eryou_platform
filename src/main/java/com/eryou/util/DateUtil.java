package com.eryou.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
    private static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");

    public static Date inDate(String date) {
        Date res = null;
        try {
            res = simpleDateFormat.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return res;
    }

    private String inString(Date date) {
        return simpleDateFormat.format(date);
    }
}
