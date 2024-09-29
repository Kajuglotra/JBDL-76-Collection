package generics;

import java.io.Serializable;

public class Dog extends Animal implements Serializable {
    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }
}

// String
