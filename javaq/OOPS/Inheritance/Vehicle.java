package javaq.OOPS.Inheritance;

public class Vehicle {
    int model;
    String color;
    String brand;

    Vehicle() {
//        System.out.println("I am a vehicle class constructor!!");
    }

    Vehicle(int model, String color, String brand) {
        System.out.println("I am in parameter wala constructor");
        this.model = model;
        this.color = color;
        this.brand = brand;

    }

    Vehicle(int model,String brand){
        this(model,"White",brand);
        System.out.println("I m in default color wala constructor");
    }


    void display() {
        System.out.println("Model:" + model + " color:" + color + " brand:" + brand);
    }

    public static void main(String[] args) {
//Vehicle car = new Vehicle();
        Vehicle car = new Vehicle(1999, "Red", "Ford");
        car.display();
    }

}
