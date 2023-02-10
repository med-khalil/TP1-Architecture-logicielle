import java.util.List;

public class CarComparer {
    private final CarManager carManager;

    public CarComparer(CarManager _carManager) {
        carManager = _carManager;
    }

    public Car getBestCar() {
        Car bestCar = null;
        List<Car> carList = carManager.getAllCars();
        for (Car car : carList) {
            if (bestCar == null || car.getModel().compareTo(bestCar.getModel()) > 0) {
                bestCar = car;
            }
        }
        return bestCar;
    }
}
