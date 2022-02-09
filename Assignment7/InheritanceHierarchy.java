package Assignment7;

/*
 Create an inheritance hierarchy of Rodent: Mouse, Gerbil, Hamster,etc.
 In the base class, provide methods that are common to all Rodents,
 and override these in the derived classes to perform different behaviors depending on the specific type of Rodent.
 Create an array of Rodent, fill it with different specific types of Rodents,
 and call your base-class methods to see what happens.
 Make the methods of Rodent abstract whenever possible and all classes should have default constructors that print a message about that class.
*/

abstract class Rodent{
    abstract void run();
    abstract void eat();
}
class Mouse extends Rodent{
    Mouse(){
        System.out.println("I'm a Mouse");
    }
    @Override
    void run() {
        System.out.println("I'm is running");
    }

    @Override
    void eat() {
        System.out.println("I'm is eating");
    }
}
class Gerbil extends Rodent{
    Gerbil(){
        System.out.println("I'm a Gerbil");
    }
    @Override
    void run() {
        System.out.println("I'm is running");
    }

    @Override
    void eat() {
        System.out.println("I'm is eating");
    }
}
class Hamster extends Rodent{
    Hamster(){
        System.out.println("I'm a Hamster");
    }
    @Override
    void run() {
        System.out.println("I'm is running");
    }

    @Override
    void eat() {
        System.out.println("I'm is eating");
    }
}
public class InheritanceHierarchy {
    public static void main(String[] args)
    {
        Rodent r[] = new Rodent[3];
        r[0] = new Mouse();
        r[0].eat();
        r[0].run();
        System.out.println();
        r[1] = new Gerbil();
        r[1].eat();
        r[1].run();
        System.out.println();
        r[2] = new Hamster();
        r[2].eat();
        r[2].run();
    }
}
