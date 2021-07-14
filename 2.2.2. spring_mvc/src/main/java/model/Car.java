package model;

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

    public String getSeries() {
        return series;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "model= " + model + ", series= " + series + ", year= " + year;
    }
}
