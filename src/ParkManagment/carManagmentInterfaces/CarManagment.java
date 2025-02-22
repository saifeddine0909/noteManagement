package ParkManagment.carManagmentInterfaces;

import java.util.Set;

import ParkManagment.Car;

public interface CarManagment {
void addCar(Car car);
double AverageParkConsumbtion ();
Set<Car> getCars();
} 