package generics;

import java.util.List;

public class Printer<T> {
    T data;
    public Printer(T data){
        this.data = data;
    }
    public void print(){
        System.out.println(data);
    }

    public static void main(String[] args) {
        Printer<Integer> printer = new Printer<>(10);
        printer.print();
        printData(1);
        printData("a");


    }

    public static <T> void printData(T data){
        System.out.println(data);
    }
}
// T: generics
// E: elements of a collection
// K, V -> key and Value