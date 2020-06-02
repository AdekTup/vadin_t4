package pl.baksza.vadin_t4.manager;

import org.springframework.stereotype.Service;
import pl.baksza.vadin_t4.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarManager {
    List<Car> carList;

    public CarManager() {
        carList = new ArrayList<>();
        carList.add(new Car("Fiat", "126p"));
        carList.add(new Car("BMV", "x1"));
    }

    public void addCar(Car car) {
        carList.add(car);

    }

    public List<Car> getCarList() {
        return carList;
    }

    public void setCarList(List<Car> carList) {
        this.carList = carList;
    }
}
