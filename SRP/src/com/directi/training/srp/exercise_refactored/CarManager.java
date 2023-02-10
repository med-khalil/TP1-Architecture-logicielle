import java.util.Arrays;
import java.util.List;

public class CarManager {
    private List<Car> _carsDb = Arrays
            .asList(new Car("1", "Golf III", "Volkswagen"), new Car("2", "Multipla", "Fiat"),
                    new Car("3", "Megane", "Renault"));

    public Car getFromDb(final String carId) {
        for (Car car : getAllCars()) {
            if (car.getId().equals(carId)) {
                return car;
            }
        }
        return null;
    }

    public List<Car> getAllCars() {
        return _carsDb;
    }
}
