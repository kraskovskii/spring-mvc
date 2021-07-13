package service;

import model.Car;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {

    public static List<Car> getListCars() {
        List<Car> cars = new ArrayList<>();

        cars.add(new Car("Audi", "A4", 2005));
        cars.add(new Car("BMW", "3", 2000));
        cars.add(new Car("OPEL", "Astra", 2008));
        cars.add(new Car("Ford", "Focus", 2019));
        cars.add(new Car("Vaz", "Niva", 2003));
        return cars;
    }
}

