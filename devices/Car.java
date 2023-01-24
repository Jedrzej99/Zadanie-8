package devices;

public class Car extends Device {
    public String model;
    public String producer;
    public double year;
    public double value;


    public Car(String model, String producer, Double year, Double value) {
        super();
        this.model = model;
        this.producer = producer;
        this.year = year;
        this.value = value;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return model.equals(car.model) &&
                producer.equals(car.producer);
    }

    @Override
    public void turnOn() {
        System.out.println("silnik startuje");
    }
}
