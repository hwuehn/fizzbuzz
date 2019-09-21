package com.fizzbuzz.data;

public class FizzyTernary {

    public void fizzyTernary(int a, int b) {
        for (int i = 1; i <= 100; i++) {
            String ausgabe = (i % (a * b) == 0) ? i + " FizzBuzz" :
                             (i % a == 0) ? i + " Fizz":
                             (i % b == 0) ? i + " Buzz" : i + "";
            System.out.println(ausgabe);
        }

    }
}
