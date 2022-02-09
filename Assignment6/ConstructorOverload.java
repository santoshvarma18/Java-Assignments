package Assignment6;

public class ConstructorOverload {
    ConstructorOverload(){
        System.out.println("Default constructor is called");
    }
    ConstructorOverload(String name){
        System.out.println("Hello, "+name+"! I'm a parameterized constructor, calling default constructor....");
        ConstructorOverload callConstructor = new ConstructorOverload();
    }
    public static void main(String[] args) {
        ConstructorOverload invokeConstructor = new ConstructorOverload("Santosh");
    }
}
