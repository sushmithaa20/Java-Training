class Animal{
    void eat()
    {
        System.out.println("eating...");
    }
}
class Dog extends Animal{
    void bark()
    {
        System.out.println("barking...");
    }
}

class BabyDog extends Dog{
    void walk()
    {
        System.out.println("walking...");
    }
}

public class MultilevelInhe {
    public static void main(String args[])
    {
        BabyDog d = new BabyDog();
        d.eat();
        d.walk();
        d.bark();
    }
    
}
