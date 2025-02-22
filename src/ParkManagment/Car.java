package ParkManagment;


public class Car {
    public static int idCounter= 0;
    private int id;
    private String brand;
    private String model;
    private CarData carData;
    public Car(int id, String brand, String model
            ) {
        super();
        this.id = idCounter++;
        this.brand = brand;
        this.model = model;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }

    public double totalFuelConsuptionPerDistance(){
        return (carData.getAverageFuelConsumption()*carData.getTraveledDistance());
    }

}
 