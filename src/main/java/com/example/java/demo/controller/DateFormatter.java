package com.example.java.demo.controller;


import com.example.java.demo.aggregator.DateFormatAggregator;
import com.example.java.demo.validator.DateFormatValidator;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.text.ParseException;
import java.util.Date;

@RestController
public class DateFormatter {

    @Autowired
    DateFormatAggregator dateFormatAggregator;

    @Autowired
    DateFormatValidator dateFormatValidator;

    /**
     * This method takes String as input and corresponding date as output
     *
     * Sample Input : 07242023
     * Sample Output : "2023-07-23T18:30:00.000+00:00"
     *
     * @param dateString
     * @param httpServletResponse
     * @return Date
     * @throws ParseException
     * @throws IOException
     */
    @PostMapping(value = {"/dateFormat"})
    public Date getDateFormatForString(@RequestBody String dateString , HttpServletResponse httpServletResponse) throws ParseException, IOException {

        Date formattedDate = null;

        if(dateFormatValidator.isValidDateString(dateString)) {
            formattedDate = dateFormatAggregator.getDateFromString(dateString);
        } else {
            httpServletResponse.sendError(404, "Invalid Input");
        }

        return formattedDate;
    }

}
