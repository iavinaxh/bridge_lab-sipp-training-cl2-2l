import java.util.*;

class Ride {
    enum RideType { NORMAL, PREMIUM }
    double distance;
    int time;
    RideType type;

    Ride(double distance, int time, RideType type) {
        this.distance = distance;
        this.time = time;
        this.type = type;
    }
}

class InvoiceSummary {
    int totalRides;
    double totalFare;
    double averageFare;

    InvoiceSummary(int totalRides, double totalFare) {
        this.totalRides = totalRides;
        this.totalFare = totalFare;
        this.averageFare = totalFare / totalRides;
    }

    public String toString() {
        return "Total Rides: " + totalRides +
               ", Total Fare: " + totalFare +
               ", Average Fare per Ride: 0.," + averageFare;
    }
}

class FareRates {
    double costPerKm;
    double costPerMin;
    double minFare;

    FareRates(double costPerKm, double costPerMin, double minFare) {
        this.costPerKm = costPerKm;
        this.costPerMin = costPerMin;
        this.minFare = minFare;
    }
}

class CabInvoiceGenerator {
    FareRates normalRates = new FareRates(10, 1, 5);
    FareRates premiumRates = new FareRates(15, 2, 20);

    double calculateFare(Ride ride) {
        FareRates rate = ride.type == Ride.RideType.PREMIUM ? premiumRates : normalRates;
        double fare = ride.distance * rate.costPerKm + ride.time * rate.costPerMin;
        return Math.max(fare, rate.minFare);
    }

    InvoiceSummary calculateFare(Ride[] rides) {
        double totalFare = 0;
        for (Ride ride : rides) {
            totalFare += calculateFare(ride);
        }
        return new InvoiceSummary(rides.length, totalFare);
    }
}

class RideRepository {
    Map<String, List<Ride>> userRides = new HashMap<>();

    void addRides(String userId, Ride[] rides) {
        userRides.put(userId, Arrays.asList(rides));
    }

    Ride[] getRides(String userId) {
        List<Ride> rides = userRides.get(userId);
        return rides != null ? rides.toArray(new Ride[0]) : new Ride[0];
    }
}

class InvoiceService {
    RideRepository rideRepo = new RideRepository();
    CabInvoiceGenerator generator = new CabInvoiceGenerator();

    void addRides(String userId, Ride[] rides) {
        rideRepo.addRides(userId, rides);
    }

    InvoiceSummary getInvoice(String userId) {
        Ride[] rides = rideRepo.getRides(userId);
        return generator.calculateFare(rides);
    }
}

public class Cab {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        InvoiceService service = new InvoiceService();
        Random rand = new Random();
        String userId = "user" + (1000 + rand.nextInt(9000));
        System.out.println("Assigned User ID: " + userId);
        System.out.print("Enter number of rides: ");
        int numRides = sc.nextInt();
        sc.nextLine();
        Ride[] rides = new Ride[numRides];
        for (int i = 0; i < numRides; i++) {
            System.out.println("Enter details for Ride " + (i + 1) + ":");
            System.out.print("Distance (in km): ");
            double distance = sc.nextDouble();
            System.out.print("Time (in minutes): ");
            int time = sc.nextInt();
            sc.nextLine();
            System.out.print("Ride Type (NORMAL or PREMIUM): ");
            String typeStr = sc.nextLine().trim().toUpperCase();
            Ride.RideType type = typeStr.equals("PREMIUM") ? Ride.RideType.PREMIUM : Ride.RideType.NORMAL;
            rides[i] = new Ride(distance, time, type);
        }
        service.addRides(userId, rides);
        InvoiceSummary summary = service.getInvoice(userId);
        System.out.println(summary);
    }
}
