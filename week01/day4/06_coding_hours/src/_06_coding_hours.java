public class _06_coding_hours {
    public static void main(String[] args) {
        // An average Green Fox attendee codes 6 hours daily
        // The semester is 17 weeks long
        int semesterLength = 17;
        int workingDays = 5;
        int hoursPerDay = 6;
        int codingHours = semesterLength * workingDays * hoursPerDay;
        //
        // Print how many hours is spent with coding in a semester by an attendee,
        // if the attendee only codes on workdays.
        System.out.println("An attendee spends "+ codingHours +" hours with coding during the semester.");
        // Print the percentage of the coding hours in the semester if the average
        // work hours weekly is 52

        int workHours = 52;
        float totalHours = workHours * semesterLength;

        System.out.println("The rate of the coding hours in the semester is " +  codingHours / totalHours * 100 +"%");
    }
}
