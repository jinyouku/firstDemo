package com.jk.java;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Hello {
    public static void main(String[] args) {
        System.out.println("sdfgh");

        System.out.println(criatDate());
    }

    private static String criatDate() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format = simpleDateFormat.format(new Date());

        return format;
    }
}
