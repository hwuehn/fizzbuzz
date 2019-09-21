package com.fizzbuzz.data;

public class FizzyStandard {

    public void fizzyFor(int a, int b) {
        for (int i = 1; i <= 100; i++ ) {
            if (i % (a * b) == 0) System.out.println(i + " FizzBuzz");
            else if (i % a == 0) System.out.println(i + " Fizz");
            else if(i % b == 0) System.out.println(i + " Buzz");
            else System.out.println(i);
        }
    }

}
