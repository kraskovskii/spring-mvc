package model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Car {
    private String model;
    private String series;
    private int year;

    public Car() {}

    public Car(String model, String series, int year) {
        this.model = model;
        this.series = series;
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", series='" + series + '\'' +
                ", year=" + year +
                '}';
    }
}
