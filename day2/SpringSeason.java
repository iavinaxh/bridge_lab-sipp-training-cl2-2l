package day2;
public class SpringSeason {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Please provide month and day as command line arguments.");
            return;
        }

        try {
            int month = Integer.parseInt(args[0]);
            int day = Integer.parseInt(args[1]);

            if (month < 1 || month > 12) {
                System.out.println("Invalid month. Please enter a value between 1 and 12.");
                return;
            }
            if (day < 1 || day > 31) { 
                System.out.println("Invalid day. Please enter a positive day value.");
                return;
            }

            boolean isSpring;

            if (month == 3) {
                isSpring = day >= 20;
            } else if (month == 4 || month == 5) {
                isSpring = true;

            } else if (month == 6) {
                isSpring = day <= 20;
            } else {
              
                isSpring = false;
            }

            if (isSpring) {
                System.out.println("It's a Spring Season");
            } else {
                System.out.println("Not a Spring Season");
            }

        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please ensure month and day are integers.");
        }
    }
}