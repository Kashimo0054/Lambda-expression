//Implementation of anonymous Inner class

interface A {
    void A_method();
}
public class App {
    public static void main(String[] args) {

        A a = new A() {
            @Override
            public void A_method() {
                System.out.println("A_method");
            }
        };
        a.A_method();        

    }
}

Simplifying anonymous inner class using lambda expression

interface A {
    void A_method();

    
}
public class App {
    public static void main(String[] args) {

        A a = () -> System.out.println("A_method");
            
        a.A_method();        

    }
}
