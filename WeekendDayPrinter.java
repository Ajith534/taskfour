package taskfour;
import java.util.Scanner;

public class WeekendDayPrinter {
    public static void main(String[] args) {
        String[] weekendDays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the day position (0-6): ");
        int dayIndex = scanner.nextInt();

        try {
           
            if (dayIndex >= 0 && dayIndex <= 6) {
                String dayName = weekendDays[dayIndex];
                System.out.println("Day name: " + dayName);
            } else {
                System.out.println("Error: Day index should be in the range 0-6.");
            }

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index out of bounds. Please enter a valid day index (0-6).");
        }
    }
}
