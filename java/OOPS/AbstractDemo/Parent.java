package AbstractDemo;

public abstract class Parent {
    int age;


    public Parent(int age) {
        this.age = age;
    }

    abstract void career();
    abstract void partner();


//    You cannot create objects of a abstract class because if one have to use methods of it how it canbe called cause it has no body implemented
//    Parent mom = new Parent() ;    not possible
}
