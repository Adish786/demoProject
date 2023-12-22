package com.example.javaprogram;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

@FunctionalInterface
public interface UPIPayment {
    String doPayment(String source,String dest);

    default  double getScrachCard(){
        return new Random().nextDouble();
    }

    static String datePattern(String pattern){
        SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);
        return  dateFormat.format(new Date());
    }
}
