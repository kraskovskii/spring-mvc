package service;

import model.Car;

import java.util.List;

public interface CarService {
    List<Car> getFilterCar(List<Car> list, int size);
    List<Car> getListCars();
}
