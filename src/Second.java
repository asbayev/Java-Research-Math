public class Second {
    public static void main(String[] args) {
        int second = 10000000;
        int secondIsMinutes = 60;
        int secondIsHours = secondIsMinutes * 60;
        int secondIsDays = secondIsHours * 24;
        int days = second / secondIsHours;
        int hours = (second % secondIsDays) / secondIsHours;
        int minutes = ((second % secondIsDays) % secondIsHours) / secondIsMinutes;
        long leftSeconds = second - secondIsDays * days - hours * secondIsHours - minutes * secondIsMinutes;

        System.out.println("Second: " + second);
        System.out.println("Day: " + days);
        System.out.println("Hours: " + hours);
        System.out.println("Minutes: "+ minutes);
        System.out.println("Left Minutes: "+ leftSeconds);
    }
}
