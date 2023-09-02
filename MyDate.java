import java.util.GregorianCalendar;
import java.util.Calendar;

public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate() {
        GregorianCalendar gcal = new GregorianCalendar();
        this.day = gcal.get(Calendar.DAY_OF_MONTH);
        this.month = gcal.get(Calendar.MONTH);
        this.year = gcal.get(Calendar.YEAR);
    }

    MyDate(Long ms) {
        this.year = 1970 + (int) (ms / 31536000000L);

        this.month = (int) ((ms % 31536000000L) / 2678400000L);

        this.day = (int) ((ms % 31536000000L) % 2678400000L) / 86400000;
    }

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "MyDate [day=" + day + ", month=" + month + ", year=" + year
                + "]";
    }

}