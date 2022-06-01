package com.test;

import org.springframework.util.StringUtils;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class SampleTest2 {

    public static void main(String[] args) {
        String s = "cat";
        SampleTest2 sampleTest2 = new SampleTest2();
        System.out.println(sampleTest2.isDuplicate(s));
    }

    boolean isDuplicate(String s) {
        Map<Character, Boolean> smap = new HashMap<>();
        if(StringUtils.hasText(s)) {
            for (int i = 0; i < s.length() ; i++) {
                if(smap.get(s.charAt(i)) != null && smap.get(s.charAt(i))) {
                    return true;
                } else {
                    smap.put(s.charAt(i),true);
                }
            }
        }
        return false;
    }
}

