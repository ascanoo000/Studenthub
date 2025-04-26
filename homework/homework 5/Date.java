public class Date {
    private int day;
    private int month;
    private int year;

    final static int[] daysPerMonth = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

    public Date(int m, int d, int y) {
        this.year = y;
        if (m >= 1 && m <= 12) {
            this.month = m;
        } else {
            this.month = 1; 
        }

        if (isValidDay(m, d, y)) {
            this.day = d;
        } else {
            this.day = 1; 
        }
    }

    static public boolean checkLeap(int y) {
        return (y % 4 == 0 && (y % 100 != 0 || y % 400 == 0));
    }

    public boolean isLeap() {
        return checkLeap(this.year);
    }

    public String toString() {
        return String.format("%02d/%02d/%d", month, day, year);
    }

    public int yearDate() {
        int days = 0;
        for (int i = 1; i < month; i++) {
            days += daysPerMonth[i];
            if (i == 2 && isLeap()) {
                days++;
            }
        }
        days += day;
        return days;
    }

    private boolean isValidDay(int m, int d, int y) {
        if (m < 1 || m > 12) {
            return false; 
        }
        int maxDays = daysPerMonth[m];
        if (m == 2 && isLeap()) {
            maxDays = 29; 
        }
        return d >= 1 && d <= maxDays;
    }

    public static void main(String[] args) {
        Date d1 = new Date(10, 20, 1995);
        System.out.println("d1: " + d1.toString());
        System.out.println("Year date of d1: " + d1.yearDate());

        Date d2 = new Date(12, 31, 2023);
        System.out.println("d2: " + d2.toString());
        System.out.println("Year date of d2: " + d2.yearDate());

        Date d3 = new Date(2, 29, 2024);
        System.out.println("d3: " + d3.toString());
        System.out.println("Year date of d3: " + d3.yearDate());

        Date d4 = new Date(2, 29, 2025);
        System.out.println("d4: " + d4.toString());
        System.out.println("Year date of d4: " + d4.yearDate());
    }
}
