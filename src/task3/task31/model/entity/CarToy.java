package task3.task31.model.entity;

public class CarToy extends AbstractToy {
    private String carBrand;
    private String carType;

    public CarToy(String carBrand, String carType) {
        this.carBrand = carBrand;
        this.carType = carType;
    }

    public CarToy(int price, int age, String gender, String carBrand) {
        super(price, age, gender);
        this.carBrand = carBrand;
    }

    public CarToy(String carBrand) {
        this(carBrand,"undefined");
    }

    public CarToy() {
        this("undefined","undefined");
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }
}
