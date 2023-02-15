public class Program {

    public static void main(String[] args) {
        Car car = new Car("Honda", 2015, 450000.00, "white", 0.7);
        Car car1 = new Car("Mitsubishi", 2017, 1500000, "white", 2.0);
/*      car.getInfo();
        car.roadRun("Krasnodar");
        car.engineStart();
        car.getStatus();
        car.roadRun("Sochi");
        car.engineStop();
        car.getStatus();
        car1.getName();*/
        race(car, car1, 1000);


    }

    public static void race(Car car1, Car car2, int distance) {
        System.out.println(car1.model + " and " + car2.model + "start the race");
        int car1Speed = car1.speedChange();
        int car2Speed = car2.speedChange();
        while (car1Speed < distance || car2Speed < distance) {
            System.out.println(car1.model + " has run " + car1Speed + " meters");
            System.out.println(car2.model + " has run " + car2Speed + " meters");
            System.out.println();
            car1Speed += car1.speedChange();
            car2Speed += car2.speedChange();
        }
        if (car1Speed > car2Speed) {
            System.out.println(car1.model + " wins the race");
        } else if (car1Speed < car2Speed) {
            System.out.println(car2.model + " wins the race");
        } else {
            System.out.println("Nobody wins! Epic race!");
        }
    }
}
