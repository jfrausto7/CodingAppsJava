public class Highway {
    public static void main(String[] args) {
        Car car1 = new Car("Nissan", 2007);
        Car car2 = new Car("Toyota", 2007);
        Car car3 = new Car("Nissan", 3455);
        Car car4 = new Car("Nissan", 4455);
        electricCar car5 = new electricCar("tesla", 2020);



        System.out.println(car1.drive());
        System.out.println(car2.drive());
        System.out.println(car3.drive());
        System.out.println(car5.drive());

        System.out.println(car1.carMake);
        System.out.println(car2.carMake);
        System.out.println(car3.carMake);
        System.out.println(car4.carMake);
        System.out.println(car5.carMake);

    }
}
