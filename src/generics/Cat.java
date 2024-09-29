package generics;

import java.io.Serializable;

public class Cat extends Animal implements Serializable {
    @Override
    public void eat() {
        System.out.println("cat is eating");
    }
}
