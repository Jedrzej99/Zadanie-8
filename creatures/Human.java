package creatures;

import devices.Car;

public class Human   {
    public Animal pet;
    public String name;
    public String surname;
    public Car car;
    private Double salary;
    public double cash;
    public String buyer;


    public Human(String name, Double cash) {
        this.name = name;
        this.cash = cash;
    }

    public Human() {

    }

    public Double getCash() {
        return cash;
    }
    public void setCash(Double cash) {
        this.cash = cash;
    }




    public Car getCar() {

        return this.car;
    }
    public Double getSalary() {
        System.out.println(java.time.LocalDate.now());
        System.out.println(this.salary);
        return this.salary;
    }
    public void setSalary(Double newSalary) {
        if (newSalary < 0) {
            System.out.println("Na koncie nie moze byc ujemna wartość");
        } else {
            System.out.println("Wysyłanie nowych danych do systemu księgowości");
            System.out.println("Konieczność odebrania umowy w kadrach");
            System.out.println("ZUS i US już wiedzą o zmianie wypłaty i nie ma sensu ukrywać dochodu");
            this.salary = newSalary;
        }
    }
    public void setCar(Car newCar) {
        if (this.salary > newCar.value) {
            System.out.println("Udało się kupić samochod");
            this.car = newCar;
        } else if (this.salary > (newCar.value) / 12) {
            System.out.println("Udało się kupić samochód");
            this.car = newCar;
        } else {
            System.out.println("Nie masz wystarczająco pieniędzy. Idź po podwyżke lub zapisz się na studia");
        }
    }
    public String toString(){
        return name+" "+surname+" "+car+" "+salary;
    }
    public void sell(Human seller, Human buyer, Double price) {
        throw new IllegalArgumentException("Humans cannot be sold");
    }


}
