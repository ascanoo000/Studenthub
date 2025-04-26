import java.util.GregorianCalendar;

public class DateExample {
    public static void main(String[] args) {
        GregorianCalendar currentCalendar = new GregorianCalendar();
        int currentYear = currentCalendar.get(GregorianCalendar.YEAR);
        int currentMonth = currentCalendar.get(GregorianCalendar.MONTH) + 1;
        int currentDay = currentCalendar.get(GregorianCalendar.DAY_OF_MONTH);
        
        System.out.println("目前日期: " + currentYear + "年" + currentMonth + "月" + currentDay + "日");

        GregorianCalendar specificCalendar = new GregorianCalendar();
        specificCalendar.setTimeInMillis(1234567898765L);
        int specificYear = specificCalendar.get(GregorianCalendar.YEAR);
        int specificMonth = specificCalendar.get(GregorianCalendar.MONTH) + 1;
        int specificDay = specificCalendar.get(GregorianCalendar.DAY_OF_MONTH);
        
        System.out.println("指定時間的日期: " + specificYear + "年" + specificMonth + "月" + specificDay + "日");
    }
}
