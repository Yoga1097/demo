package com.example.java.demo.aggregator.impl;

import com.example.java.demo.aggregator.DateFormatAggregator;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class DateFormatAggregatorImpl implements DateFormatAggregator {

    /**
     * Format the give String of "MMddyyyy" into a Date
     *
     * @param strDate
     * @return
     * @throws ParseException
     */
    @Override
    public Date getDateFromString(String strDate) throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("MMddyyyy");
        Date formatedDate = formatter.parse(strDate);

        return formatedDate;
    }
}
