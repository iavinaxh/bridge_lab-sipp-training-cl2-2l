class Vehicle {
    static double registrationFee = 500.0;
    final String registrationNumber;
    String ownerName;
    String vehicleType;

    Vehicle(String registrationNumber, String ownerName, String vehicleType) {
        this.registrationNumber = registrationNumber;
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    void showRegistration(Object obj) {
        if (obj instanceof Vehicle) {
            System.out.println("Reg. No: " + registrationNumber + ", Owner: " + ownerName + ", Type: " + vehicleType + ", Fee: " + registrationFee);
        }
    }
}
