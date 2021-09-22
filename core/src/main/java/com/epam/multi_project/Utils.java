package com.epam.multi_project;

import com.epam.utils.StringUtils;

import java.util.Arrays;

public class Utils {

    public static boolean isAllPositiveNumbers(String... str) {
//        boolean result = true;
//        for (String number : str) {
//            result = StringUtils.isPositiveNumber(number);
//        }
//        return result;
        return Arrays.stream(str)
                .filter(x -> !StringUtils.isPositiveNumber(x))
                .findFirst()
                .isEmpty();
    }
}
