package util;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.joda.time.DateTime;

/**
 *
 * @author Wallace
 */
public class DateUtil {

    public Date convertToDate(Date date, String hora) {
        String[] timeParticioned = hora.split(":");
        DateTime dateTime = new DateTime(date.getTime());
        dateTime = dateTime.withHourOfDay(Integer.parseInt(timeParticioned[0]))
                .withMinuteOfHour(Integer.parseInt(timeParticioned[1]));
        return dateTime.toDate();
    }
    
    private String getTimeFormatter() {
        return "HH:mm";
    }
    
    private String getDateTimeFormatter() {
        return "dd/MM/yyyy HH:mm";
    }
    
    public String getDateTimeFormatted(Timestamp dateTime) {
        String dateTimeFormatted = "";
        if(dateTime != null) {
            SimpleDateFormat dateTimeFormat = new SimpleDateFormat(getDateTimeFormatter());
            dateTimeFormatted = dateTimeFormat.format(new Date(dateTime.getTime()));
        }
        return dateTimeFormatted;
    }
    
    public String getTimeFormatted(Timestamp dateTime) {
        String timeFormatted = "";
        if(dateTime != null) {
            SimpleDateFormat timeFormat = new SimpleDateFormat(getTimeFormatter());
            timeFormatted = timeFormat.format(new Date(dateTime.getTime()));
        }
        return timeFormatted;
    }
}
