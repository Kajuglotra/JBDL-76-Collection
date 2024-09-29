package functionalInterfaces;

public class Clinet {
    public static void main(String[] args) {
        Demo demo = new Demo() {
            @Override
            public int print(int a) {
                System.out.println("print " +a);
                return 1;
            }
        };
        demo.print(1);

        Demo demo1 = (a) ->  1;

        demo1.print(2);


        Demo1 demo11 = new Demo1() {
            @Override
            public void print(int a) {
                System.out.println(a);
            }

            @Override
            public void print1(int a) {
                System.out.println(a);
            }
        };
//        Demo1 demo12 = (a) -> System.out.println(a);


    }
}
// one abstract method

//object.abc; -> abc is variable or it is method?
//method() -> is this variable ?

