//Завдання 5
//
//Використовуючи Intelij IDEA, створити проект, пакет. Створити
// клас MyArea, в ньому оголосити константу PI = 3.14 та статичний метод areaOfCircle,
// який повинен приймати радіус та використовуючи PI порахувати площу кола. Створити клас Main, де запустити цей метод.

package pckg.home;

public class MyArea {
    final static double PI = 3.14;
    public static double areaOfCircle (double radius){
        return PI*radius*radius;
    }
}
