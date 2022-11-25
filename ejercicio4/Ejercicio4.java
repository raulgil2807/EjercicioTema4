package ejercicio4;

import ejercicio4.herencia.SmartPhone;
import ejercicio4.herencia.SmartWatch;

public class Ejercicio4 {
    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone("Xiaomi","Azul Glaciar", 6, 8, 4000, 128, 2.84, 6.39, true, "5Ghz", "Android","4G", true);
        SmartWatch smartWatch = new SmartWatch("Samsung","negro", 2, 2, 247, 16, 1.18, 1.2, true, true, true, true,16,"Wear OS", "2dias", "Samsung");

        System.out.println(smartPhone.toString());
        System.out.println(smartWatch.toString());
    }
}
