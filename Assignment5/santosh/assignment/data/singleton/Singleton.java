package Assignment5.santosh.assignment.data.singleton;

public class Singleton {
    String stringReference;

    public static Singleton stringInitializer(String stringInput){

        // Cannot access and initialise non-static variable reference in a static method.

//        stringReference = stringInput;
        return new Singleton();
    }

    public void print(){
        System.out.println("Global string: "+stringReference);
    }
}
