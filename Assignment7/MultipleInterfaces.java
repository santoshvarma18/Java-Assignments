package Assignment7;

/*
Create three interfaces, each with two methods. Inherit a new interface that combines the three, adding a new method.
Create a class by implementing the new interface and also inheriting from a concrete class.
Now write four methods, each of which takes one of the four interfaces as an argument. In main( ), create an object of your class and pass it to each of the methods.
*/

interface Tiger{
    void capture();
    void hunt();
}
interface Cheetah{
    void sprint();
    void eat();
}
interface Lion{
    void fight();
    void loner();
}
interface Cats extends Tiger, Cheetah, Lion{
    void muscular();
}

class AnimalCare{
    void wildLifeForce(){
    }
}

class Animal extends AnimalCare implements Cats{

    @Override
    public void capture() {
        System.out.println("Captures");
    }

    @Override
    public void hunt() {
        System.out.println("Hunts");
    }

    @Override
    public void sprint() {
        System.out.println("Sprints");
    }

    @Override
    public void eat() {
        System.out.println("Eats");
    }

    @Override
    public void fight() {
        System.out.println("Fight");
    }

    @Override
    public void loner() {
        System.out.println("Lone King");
    }

    @Override
    public void muscular() {
        System.out.println("Cat family is muscular");
    }
}

public class MultipleInterfaces {
    public static void lifeStyleTiger(Tiger t){t.hunt();}
    public static void lifeStyleCheetah(Cheetah c){c.sprint();}
    public static void lifeStyleLion(Lion l){l.fight();}
    public static void catFamilySimilarities(Cats cat){cat.muscular();}
    public static void main(String[] args) {
        Animal animal = new Animal();
        lifeStyleTiger(animal);
        lifeStyleCheetah(animal);
        lifeStyleLion(animal);
        catFamilySimilarities(animal);
    }
}
