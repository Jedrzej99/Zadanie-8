import creatures.Animal;
import creatures.Human;
import creatures.salleable;
import devices.Car;
import devices.Phone;

public class Main {
    public static void main(String[] args) {
        Animal pies = new Animal("owczarek");
        for(int i = 0; i < 5; i++) {
            pies.feed();
            pies.takeForAWalk();

        }
        Car nissan = new Car("Juke", "nissan", 2022.0, 10000.0);
        Car nissan2 = new Car("Juke", "nissan", 2022.0, 10000.0);

        Human Jedrzej = new Human();
        Jedrzej.name = "Jedrzej";
        Jedrzej.surname = "Juskowiak";
        Jedrzej.car = nissan;
        Jedrzej.pet = pies;
        System.out.println(Jedrzej.car.model);
        Jedrzej.setSalary(10000.0);
        Jedrzej.getSalary();
        Jedrzej.setCar(nissan);

        if (nissan.equals(nissan2)){
            System.out.println("Samochody są takie same");
        } else {
            System.out.println("Samochody różnią się od siebie");

        }System.out.println(nissan);
        System.out.println(nissan2);
        Phone phone = new Phone("X", "Apple", 2022.0);

        nissan.turnOn();
        phone.turnOn();

        Human Damian = new Human();
        Damian.name = "Damian";
        Damian.surname = "Juskowiak";
        Damian.car = nissan2;
        Damian.cash = 1000.0;
        System.out.println(Damian.car.model);
        Damian.setSalary(3500.8);
        Damian.getSalary();

        Damian.setCar(nissan);

        salleable.sell(Damian, Jedrzej, 100.0);

        Jedrzej.getSalary();
        pies.setOwner(Damian);


        System.out.println(pies.owner);
        pies.sell(Damian, Jedrzej, 100.0);






    }
}