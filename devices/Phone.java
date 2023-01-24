package devices;
public class Phone extends Device  {
    public Phone(String model, String producer, double year) {
        super(model, producer, year);
    }

    @Override
    public void turnOn() {
        System.out.println("Telefon został włączony");
    }
}
