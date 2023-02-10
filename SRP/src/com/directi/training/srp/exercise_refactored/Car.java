public class Car {
    private final String id;
    private final String model;
    private final String brand;

    public Car(String _id, String _model, String _brand) {
        id = _id;
        model = _model;
        brand = _brand;
    }

    public String getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }
}
