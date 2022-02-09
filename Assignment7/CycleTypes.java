package Assignment7;

/*
Create a Cycle class, with subclasses Unicycle, Bicycle and Tricycle.
Add a balance( ) method to Unicycle and Bicycle, but not to Tricycle.
Create instances of all three types and upcast them to an array of Cycle.
Try to call balance( ) on each element of the array and observe the results.
Downcast and call balance( ) and observe what happens.
*/

class Cycle{
    int wheels(){
        return 0;
    }
    void ride(){
        System.out.println("Cycle ride");
    }
}
class Unicycle extends Cycle{
    int wheels(){
        return 1;
    }
    void balance(){
        System.out.println("Unicycle balance");
    }

    @Override
    void ride() {
        System.out.println("Unicycle ride");
    }
}
class Bicycle extends Cycle{
    int wheels(){
        return 2;
    }
    void balance(){
        System.out.println("Bicycle balance");
    }

    @Override
    void ride() {
        System.out.println("Bicycle ride");
    }
}
class Tricycle extends Cycle{
    int wheels(){
        return 3;
    }

    @Override
    void ride() {
        System.out.println("Tricycle ride");
    }
}


public class CycleTypes {
    public static void main(String[] args) {
        Cycle cycle[] = {new Unicycle(), new Bicycle(), new Tricycle()};
        for (Cycle c : cycle) {
            c.ride();
            System.out.println("wheels = " + c.wheels());
            System.out.println();
        }

        Cycle c = new Unicycle();
        Unicycle uni = (Unicycle)c;
        uni.balance();
    }
}
