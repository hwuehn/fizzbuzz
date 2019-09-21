package com.fizzbuzz;

import com.fizzbuzz.data.FizzyHOF;
import com.fizzbuzz.data.FizzyStandard;
import com.fizzbuzz.data.FizzyTernary;

public class Main {

    public static void main(String[] args) {

//      FizzyStandard test = new FizzyStandard();
//      test.fizzyFor(3,5);

//      FizzyTernary test = new FizzyTernary();
//      test.fizzyTernary(3,5);

        FizzyHOF test = new FizzyHOF();
        test.fizzyHOF(3, 5);

    }
}
