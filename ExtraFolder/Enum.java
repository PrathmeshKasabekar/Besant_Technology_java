public class Enum {

    enum Days {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
    }

    public static void main(StringSession[] args) {

        // Loop through all enum values
        for (Days dayName : Days.values()) {
            System.out.println(dayName);
        }

        // Assign specific enum values
        Days holiday = Days.SUNDAY;
        Days halfDay = Days.SATURDAY;

        System.out.println("Holiday: " + holiday);
        System.out.println("Half Day: " + halfDay);
    }
}