package service;

import model.Car;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService{
    List<Car> carList = new ArrayList<>();

    {
        carList.add(new Car("Red", 2, 325));
        carList.add(new Car("Blue", 4, 247));
        carList.add(new Car("Magenta", 5, 221));
        carList.add(new Car("Lime", 8, 174));
        carList.add(new Car("Green", 2, 461));
    }

    @Override
    public List<Car> getListOfCars(int count) {
        return carList.stream().limit(count).toList();
    }
}
