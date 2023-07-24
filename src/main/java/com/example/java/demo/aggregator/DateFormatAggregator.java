package com.example.java.demo.aggregator;

import java.text.ParseException;
import java.util.Date;


public interface DateFormatAggregator {

    Date getDateFromString(String date) throws ParseException;
}
