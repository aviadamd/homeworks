package algorithms;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BigOn {

    @Test
    void printAllFib() {
        allFib(10);
    }

    @Test
    void printFib() {
        System.out.println(fib(8));
    }

    @Test
    void printValues() {
        printValue(new ArrayList<>(Arrays.asList(1,3,4,5,6,7)));
    }

    public void printValue(List<Integer> number) {
        int sum = 0;
        int product = 1;

        // add each number asian as to the next number with + arithmetic
//        for (int i = 0; i < number.size(); i++) {
//            sum = sum + number.get(i);
//        }

        // add each number asian as to the next number with * arithmetic
//        for (int i = 0; i < number.size(); i++) {
//            product = product * number.get(i);
//        }

        // share the same i
        for (int i = 0; i < number.size(); i++) {
            sum = sum + number.get(i);
            product = product * number.get(i);
        }

        System.out.println("Sum is " + sum + " , product is " + product);
    }

    public int fib(int n) {
       if (n <= 0) return 0;
       else if (n == 1) return 1;
       return fib(n -1) + fib(n - 2);
    }

    void allFib(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(i + " : " + fib(i));
        }
    }
}
