import java.util.Random;

/*
Доработайте программу в свободном стиле.
Можно сравнить 2 автомобиля между собой
Или пусть авто заедет за фруктами :-)
Добавьте несколько произвольных методов и свойств
<br>
ДОП: Сделать гонки:
- задаём растояние
- едут до финиша.
Сказать кто победит.

<br>
Кто не доделал - задания на семинаре:
1)Напишите класс Car.
В классе должна храниться следующая информация:
название автомобиля - model;
год выпуска - year;
стоимость - price;
цвет - color;
объем двигателя - power.
<br>
2) Доработайте класс Car.
Добавьте в класс Car метод getInfo без параметров, который будет печать на экране значения полей объекта класса model , power и yeare.
<br>
3) Доработайте класс Car.
В классе должна храниться следующая информация:
Свойство - которое говорит заведен авто или нет
Метод - запуска автомобиля
Метод - остановки автомобиля
Метод дороги - при вызове, в качестве аргумента передаем место назначения
И если авто заведён - выводим, что мы на такой-то авто едем место назначения
Если не заведён - сообщить, что авто не заведено. И мы не можем ехать
 */
public class Car {
    String model;
    int year;
    double price;
    String color;
    double power;
    boolean status;

    Car(String model, int year, double price, String color, double power) {
        this.model = model;
        this.year = year;
        this.price = price;
        this.color = color;
        this.power = power;
        this.status = false;
    }

    public void getInfo() {
        System.out.println(model + " " + year + " " + price + " " + color + " " + power);
    }
    public void getName() {
        System.out.print(model);
    }

    public void engineStart() {
        this.status = true;
        System.out.println("Car is ready to go!");
    }

    public void engineStop() {
        this.status = false;
        System.out.println("Engine stopped");
    }

    public void roadRun(String address) {
        if (!status) {
            System.out.println("Engine stopped! can't GO!");
        } else {
            System.out.println("OK, running to the " + address);
        }
    }

    public void getStatus() {
        if (!status) {
            System.out.println("Engine stopped");
        } else {
            System.out.println("Engine is running");
        }
    }
    public int speedChange(){
        Random random = new Random();
        int speed = random.nextInt(100);
        return speed;
    }
}
