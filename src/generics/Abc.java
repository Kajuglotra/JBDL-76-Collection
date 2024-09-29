package generics;

import java.util.ArrayList;
import java.util.List;

public class Abc<T extends Animal> {
    int val;
//    T animal;
    public Abc(int val){
        this.val = val;
//        this.animal =animal;
    }

    public static void main(String[] args) {
        Abc abc = new Abc<>(1);


        List list = new ArrayList<>();
    }
}
