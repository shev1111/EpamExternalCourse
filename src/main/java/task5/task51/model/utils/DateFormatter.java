package task5.task51.model.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatter {
    public static String getSimpleFormat(Date date){
        if(date==null)return "";
        return new SimpleDateFormat("dd-MM-yyyy").format(date);
    }
}
