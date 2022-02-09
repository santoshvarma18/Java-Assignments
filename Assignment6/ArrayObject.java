package Assignment6;

public class ArrayObject {
    String name;
    ArrayObject(String name){
        this.name = name;
        System.out.println("Name: "+name);
    }

    public static void main(String[] args) {
        ArrayObject names[] = new ArrayObject[2];
        names[0] = new ArrayObject("Santosh");
        names[1] = new ArrayObject("Tarun");
    }
}
