package functionalInterfaces;

@FunctionalInterface
public interface Demo {

    int print(int a);
//    void printData();

    default void getA(){
        System.out.println("a");
    }
    static void getB(){
        System.out.println("b");
    }
}
// the type of interfaces where you have only one abstract method -> functional interface
// lambda expressions -> work fine -> only with Functional Interfaces
