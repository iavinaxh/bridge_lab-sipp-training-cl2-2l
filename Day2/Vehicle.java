class Vehicle {
    String ownerName;
    String vehicleType;
    static double registrationFee = 5000;

    Vehicle(String owner, String type) {
        this.ownerName = owner;
        this.vehicleType = type;
    }

    void displayVehicleDetails() {
        System.out.println("Owner: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: ₹" + registrationFee);
    }

    static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }
}
