package Task1;
public class Main {



    public static void main(String[] args) {
        Driver driver = new Driver(23, "Rasmus");
        Car car = new Car("Kia", "Ceed", 2015, "Station Wagon");
        car.setDriver(driver);
        Car car2 = new Car("Ford","Mustang",1994,"Muscle car");
        car2.setDriver(driver);

        System.out.println(car.toString());
        System.out.println(driver.toString());
        System.out.println(car2.toString());
        System.out.println(driver.toString());

    }
}
