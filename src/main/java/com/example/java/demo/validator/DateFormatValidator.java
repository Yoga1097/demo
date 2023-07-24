package com.example.java.demo.validator;

import org.springframework.stereotype.Component;

@Component
public class DateFormatValidator {

    /**
     * Returns "true" if String contains only digits
     *
     * @param dateStr
     * @return boolean
     */
    public boolean isValidDateString(String dateStr) {
        String regex = "\\d+";
        return dateStr.matches(regex);
    }


}
