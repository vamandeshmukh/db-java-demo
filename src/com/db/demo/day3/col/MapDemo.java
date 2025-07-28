package com.db.demo.day3.col;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

    public static void main(String[] args) {

        Map<String, String> codes = new HashMap<>();
        codes.put("TG", "Telangana");
        codes.put("MH", "Maharashtra");
        codes.put("AP", "Andhra pradesh");
        System.out.println(codes);
        codes.put("TS", "Telangana");
        System.out.println(codes);
        codes.put("AP", "Arunachal pradesh");
        System.out.println(codes);
        System.out.println(codes.keySet());
        System.out.println(codes.values());
        codes.put("IND", null);
        codes.put(null, "India");
        System.out.println(codes);



    }
}
