//Завдання 3
//
//Використовуючи Intelij IDEA, створити проект, пакет. (Наново!) Створити клас Машина з полями рік(int),
// швидкість(double), вага(int) колір(String). Створити конструктор за замовчуванням, конструктор з 1 параметром,
// 2-а, 3-я, 4-а. Перевантажити конструктори. Створити клас Main, де створити екземляри класу Машина з різними параметрами.

package pck.home;

public class Car {
    private int year;
    private double speed;
    private int weight;
    private String color;

    public Car() {
    }

    public Car(int year) {
        this.year = year;
    }

    public Car(int year, double speed) {
        this.year = year;
        this.speed = speed;
    }

    public Car(int year, double speed, int weight) {
        this.year = year;
        this.speed = speed;
        this.weight = weight;
    }

    public Car(int year, double speed, int weight, String color) {
        this.year = year;
        this.speed = speed;
        this.weight = weight;
        this.color = color;
    }
}
