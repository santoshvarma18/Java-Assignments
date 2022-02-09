package Assignment7;

/*
Subclass () {
    //reason: bacause the default constructor must always be provided
}
Option 2-
Subclass (Outer outer) {
    //reason : because creating an instance of **Subclass** requires an instance
    //of outer, which the **Subclass** instance will be bound to
}

Option 3-
Subclass (Outer outer) {
    outer.super();
    //reason : because creating an instance of **Subclass** requires an explicit
    //call to the **Outer's** constructor, in order to have an enclosing instance
    //of **Outer** in scope.
}
Option 4-
Subclass (Outer.inner inner) {
    //reason : because an instance of **inner** is necessary so that there is a
    //source to copy the derived properties from
}
*/

class FirstOuter{
    class FirstInner{
        FirstInner(String name){
            System.out.println("Hello, "+name);
        }

        void print(){
            System.out.println("Parent");
        }
    }
}

class SecondOuter{
    class SecondInner extends FirstOuter.FirstInner{
        SecondInner(FirstOuter fo) {
            fo.super("Santosh");
            print();
            super.print();
        }
        void print(){
            System.out.println("Child");
        }

    }
}

public class InnerOuterClasses {
    public static void main(String[] args) {
        FirstOuter fo = new FirstOuter();
        SecondOuter so = new SecondOuter();
        SecondOuter.SecondInner si = so.new SecondInner(fo);
    }
}
