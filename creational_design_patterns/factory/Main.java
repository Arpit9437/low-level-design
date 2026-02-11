public class Main {
    public static void main(String[] args) {
        Vehicle v1 = VehicleFactory.fetchVehicle("car");
        v1.start();
        v1.stop();

        Vehicle v2 = VehicleFactory.fetchVehicle("bike");
        v2.start();
        v2.stop();

        Vehicle v3 = VehicleFactory.fetchVehicle("truck");
        v3.start();
        v3.stop();

        Vehicle v4 = VehicleFactory.fetchVehicle("plane");
        
    }
}
