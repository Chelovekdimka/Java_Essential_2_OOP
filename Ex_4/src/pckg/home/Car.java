//Завдання 4
//
//Використовуючи Intelij IDEA, створити проект, пакет. (Наново!) Створити клас Машина з полями рік(int),
// швидкість(double), вага(int) колір(String). Створити конструктор за замовчуванням, к
// онструктор з 1 параметром, 2-а, 3-а, 4-а. Перевантажити конструктори викликаючи конструктор із конструктора.
// Створити клас Main, де створити екземляри класу Машина з різними параметрами.

package pckg.home;

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
        this(year, speed);
        this.weight = weight;
    }

    public Car(int year, double speed, int weight, String color) {
        this(year, speed, weight);
        this.color = color;
    }
}