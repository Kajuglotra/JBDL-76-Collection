package streamsDemo;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class Main {

    // nums collection -> list, set , array
    // u to check wheather the num presnt in list is even or not
    // even square it
    // return summation of all even square

    // 1,2,3,4,5,6,7,8,9,10
    // 2, 4, 6, 8, 10
    // 4+16+36+64+100 =>220

    public static void main(String[] args) {
        // iterative
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        int sum =0;
        for(int i=0;i<list.size();i++){
            if(list.get(i)%2 ==0){
                sum+=list.get(i)*list.get(i);
            }
        }
        System.out.println("Sum with iterative way is "+ sum);

          Optional<Integer> i = list.stream().parallel().filter(new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                System.out.println("I am in filter method");
                return integer%2==0;
            }
        }).map(new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer integer) {
                System.out.println("i am in map method");
                return integer*integer;
            }
        }).reduce( new BinaryOperator<Integer>() {
              @Override
              public Integer apply(Integer integer, Integer integer2) {
                  System.out.println("i am in reduce method is " + integer +" " + integer2);
                  return integer+integer2;
              }
          });
        System.out.println("Sum with declarative way is "+i);


        // lambda expressions here
        Integer output = list.stream().parallel().
                filter(integer -> integer%2==0).
                map(integer -> integer*integer).
                reduce(0, (integer, integer2) -> integer+integer2);
//                collect(Collectors.toList());


//                reduce(0, (integer, integer2) -> integer+integer2);
        System.out.println("Sum with labda exp is "+ output);
    }
}
//map
//filter
// complexity for loop and declarative will be equal
// break from declartive code limit, skip
//i am in reduce method is 0 4
//i am in reduce method is 4 16

// HW
// "", "ksjdfgjbd", " " , "kajgdshk", "kk", "ljsdfhsgdfK", "kkkkkkkkkkkkk"
// for everystring length of string > 10 if it is greater than 10 trin it to 10 else keep it as it is
// check first and the last character of your string if equals print/ collect it

// parallel Stream
// sequential Stream -> for loop

// parallel stream multiple threads
//all thread will try to compute the result
// sequential -> one way (sequence)

// multithreading VS Parallel Streaming

