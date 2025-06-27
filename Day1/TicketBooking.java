import java.util.Scanner;

class MovieTicket {
    String movieName;
    int seatNumber;
    double price;

    void bookTicket(String name, int seat, double cost) {
        movieName = name;
        seatNumber = seat;
        price = cost;
    }

    void displayTicket() {
        System.out.println("Movie: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price: " + price);
    }
}

public class TicketBooking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MovieTicket ticket = new MovieTicket();

        System.out.print("Enter Movie Name: ");
        String movie = sc.nextLine();
        System.out.print("Enter Seat Number: ");
        int seat = sc.nextInt();
        System.out.print("Enter Ticket Price: ");
        double price = sc.nextDouble();

        ticket.bookTicket(movie, seat, price);
        System.out.println("\n--- Ticket Details ---");
        ticket.displayTicket();

        sc.close();
    }
}