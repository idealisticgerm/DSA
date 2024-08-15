package AbstractDemo;

public class Son extends Parent{


    public Son(int age) {
        super(age);
    }

    @Override
    void career() {
        System.out.println("I want to be engineer");
    }

    @Override
    void partner() {
        System.out.println("I love her");
    }
}
