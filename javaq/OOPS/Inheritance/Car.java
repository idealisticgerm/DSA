package javaq.OOPS.Inheritance;

public class Car extends Vehicle {
    Car(int model,String color,String brand) {
        super(model, color, brand);
        System.out.println("I am child constructor");
    }
    Car(int model,String brand){
        super(model,brand);
    }

    public static void main(String[] args) {
//        Car c = new Car(1978,"blue","Creta");
//        System.out.println(c.brand);
//        c.display();

        Car c  = new Car(2005,"Brezza");
        c.display();
    }
}
