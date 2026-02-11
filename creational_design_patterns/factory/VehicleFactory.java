public class VehicleFactory {
    public static Vehicle fetchVehicle(String type){
        if(type.trim().equalsIgnoreCase("CAR")){
            return new Car();
        }
        else if(type.trim().equalsIgnoreCase("BIKE")){
            return new Bike();
        }
        else if(type.trim().equalsIgnoreCase("TRUCK")){
            return new Truck();
        }
        throw new IllegalArgumentException("INVALID VEHICLE TYPE!!!");
    }
}
