package com.tankyx.util;

import java.text.ParseException;

/**
 * @program: DateUtil
 * @description:
 * @author: tankyx
 * @create: 2019-03-08 15:28
 **/
public class Test {
    public static void main(String[] args) throws ParseException {

        //日期格式类型
        String pattern = "yyyy-MM-dd";

        //获得今天日期
        System.out.println("---------获得今天日期---------");
        String today = DateUtil.getToday(pattern);
        System.out.println("今天日期："+today);

        //获得明天日期
        System.out.println("---------获得明天日期---------");
        String tomorrow = DateUtil.getTomorrow(pattern);
        System.out.println("明天日期："+tomorrow);

        //获得昨天日期
        System.out.println("---------获得昨天日期---------");
        String yesterday = DateUtil.getYesterday(pattern);
        System.out.println("昨天日期："+yesterday);

        //获得指定日期的后一天
        System.out.println("---------获得指定日期的后一天---------");
        String date_str = "2018-10-03";
        System.out.println("指定日期："+date_str);
        String after_date = DateUtil.getAfterDay(date_str,pattern);
        System.out.println("指定日期的后一天："+after_date);

        //获得指定日期的后一天
        System.out.println("---------获得指定日期的前一天---------");
        System.out.println("指定日期："+date_str);
        String before_date = DateUtil.getBreforeDay(date_str,pattern);
        System.out.println("指定日期的前一天："+before_date);
    }

}
