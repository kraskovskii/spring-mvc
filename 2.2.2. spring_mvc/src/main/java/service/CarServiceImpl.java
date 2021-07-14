package service;

import model.Car;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Controller
@Scope(scopeName = "singleton")
public class CarServiceImpl implements CarService{

    public List<Car> getListCars() {
        List<Car> cars = new ArrayList<>();

        cars.add(new Car("Audi", "A4", 2005));
        cars.add(new Car("BMW", "3", 2000));
        cars.add(new Car("OPEL", "Astra", 2008));
        cars.add(new Car("Ford", "Focus", 2019));
        cars.add(new Car("Vaz", "Niva", 2003));
        return cars;
    }

    public List<Car> getFilterCar(List<Car> list, int size){
        return list.stream().limit(size).collect(Collectors.toList());
   }
}

