package com.converter;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author zhangxin
 * @title
 * @Package com.converter
 * @date 8/14/21 5:03 下午
 */
public class DateConverter implements Converter<String, Date> {
    @Override
    public Date convert(String s) { // S:表单传递过来的参数
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = null;
        try {
            date = sf.parse(s);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }
}
