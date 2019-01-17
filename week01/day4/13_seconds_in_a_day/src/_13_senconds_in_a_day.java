public class _13_senconds_in_a_day {
    public static void main(String[] args) {
        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;

        int totalDay = 24 * 60 * 60;
        int spentSeconds = 14 * 34 * 42;
        int remainingSeconds = totalDay - spentSeconds;

        // Write a program that prints the remaining seconds (as an integer) from a
        // day if the current time is represented by the variables
        System.out.println("There are " + remainingSeconds + " seconds left from today");

    }
}
