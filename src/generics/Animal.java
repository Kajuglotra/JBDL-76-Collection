package generics;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Animal implements Serializable {

    void eat(){
        System.out.println("animal is eating");
        List<Cat> result = new ArrayList<>();
        result.add(new Cat());
        result.add(new Cat());
        result.add(new Cat());
        printList(result);
    }


    public static void printList(List<?> list){

        // list of certain type, where you are not sure about the type
        // wildcards
        System.out.println(list); // list of object
    }

    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.eat();
    }

}
//List<T extends Animal>