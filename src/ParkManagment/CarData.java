package ParkManagment;


public class CarData {
    
    private double traveledDistance;
    private double averageFuelConsumption;
    
    public double getTraveledDistance() {
        return traveledDistance;
    }
    public double getAverageFuelConsumption() {
        return averageFuelConsumption;
    }
    public void setTraveledDistance(double traveledDistance) {
        this.traveledDistance = absolute(traveledDistance);
    }
    public void setAverageFuelConsumption(double averageFuelConsumption) {
        this.averageFuelConsumption = absolute(averageFuelConsumption);
    }
    private double absolute (double carData){
        return Math.abs(carData);
    }
    public CarData(double traveledDistance, double averageFuelConsumption) {
        this.traveledDistance = absolute(traveledDistance);
        this.averageFuelConsumption = absolute(averageFuelConsumption);
    }
   
}