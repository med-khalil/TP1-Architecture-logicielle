import java.util.List;

public class CarFormatter {
    private final CarManager carManager;

    public CarFormatter(CarManager _carManager) {
        carManager = _carManager;
    }

    public String getCarsNames() {
        StringBuilder sb = new StringBuilder();
        List<Car> carList = carManager.getAllCars();

        for (Car car : carList) {
            sb.append(car.getBrand());
            sb.append(" ");
            sb.append(car.getModel());
            sb.append(", ");
        }

        return sb.substring(0, sb.length() - 2);
    }
}
