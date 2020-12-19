public class Days {
    public static void main(String[] args) {
        int day = 10000;
        int years = day / 365;
        int month = (day % 365) / 31;
        int leftday = day - years * 365 - month * 31;
        System.out.println("All days in 5000 years: " + day);
        System.out.println("Years: " + years);
        System.out.println("Month: " + month);
        System.out.println("Days: " + leftday);
    }
}
