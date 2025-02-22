package ParkManagment;

import java.util.HashSet;
import java.util.Set;

import ParkManagment.carManagmentInterfaces.CarManagment;

public class CarPark implements CarManagment{

    public Set<Car> cars = new HashSet<Car>();
    @Override
    public void addCar(Car car) {
        // TODO Auto-generated method stub
        cars.add(car);
    }
    @Override
    public double AverageParkConsumbtion() {
        // TODO Auto-generated method stub
       if(cars.isEmpty()) return 0;
        return cars.stream().mapToDouble(Car::totalFuelConsuptionPerDistance).average().orElse(0);
    }
    @Override
    public Set<Car> getCars() {
        // TODO Auto-generated method stub
    return cars;
    }
    
}
