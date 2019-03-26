package cn.teachcourse.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {

    String parse(String inputDate, int n) {
        if (inputDate == null) return null;
        final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            Date date = simpleDateFormat.parse(inputDate);//将一个时间字符串转成Date对象
            long time = date.getTime();//返回从1970年1月1日 00:00:00以来的毫秒数
            long newTime = time + n * 1000;
            Date newDate = new Date(newTime);
            return simpleDateFormat.format(newDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args){
        DateUtil util=new DateUtil();
        String date=util.parse("2019-03-22 23:59:56",100);
        System.out.println("currentDate:"+date);
    }
}
