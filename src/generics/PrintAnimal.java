package generics;

import org.gfg.collection.Demo;

import java.io.Serializable;

public class PrintAnimal<T extends Integer & Serializable > {
    Object data;
    public PrintAnimal(Object data){
        this.data = data;
    }
    public void printAnimal(){
        System.out.println(data);
    }

    public static void main(String[] args) {
        PrintAnimal<Integer> printAnimal = new PrintAnimal<Integer>(new Animal());
    }
}

// Animal was a interface
// implements -> generics , inplement dos not work
// extends
// extends -> only have 1 class extended
// class and interface
// pass class always as first param
// pass interface as the second param ?
// 2 interface
// boundary to your generics