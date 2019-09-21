package com.fizzbuzz.data;

import java.util.stream.IntStream;

public class FizzyHOF {

    public void fizzyHOF(int a, int b) {
        IntStream.range(1, 101)
                .mapToObj(i -> (((i%(a*b)==0)? i + " FizzBuzz" :
                               (i%a==0) ? i + " Fizz" :
                               (i%b==0) ? i + " Buzz" : i + "")))
                .forEach(System.out::println);
    }
}
