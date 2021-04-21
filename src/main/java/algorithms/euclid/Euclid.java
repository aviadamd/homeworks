package algorithms.euclid;

import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.function.Predicate;

/**
 * <BR>Euclid algorithm
 * it calculate the great common divisor between two numbers A and B
 * <BR/>
 */
public class Euclid {

    /**
     * implementation using recursion
     * 22/6 = 3 rest of 4
     * 6/4 = 1 rest of 2
     * 4/2 = 2 rest of 0
     * @param number % divisor while is not != 0
     * @param divisor
     * @return
     */
    public int greatCommonDivisor1(int number, int divisor) {
        int remainNumber = (number % divisor);

        if (remainNumber != 0)
             return greatCommonDivisor1(divisor, remainNumber);
        else return divisor;
    }

    /**
     * implementation with out recursion
     * 22/6 = 3 rest of 4
     * 6/4 = 1 rest of 2
     * 4/2 = 2 rest of 0
     *  number / (divisor and temp) = result rest of divisor
     * @param number
     * @param divisor
     * @return
     */
    public int greatCommonDivisor2(int number, int divisor) {
        while (divisor != 0) {
            int temp = divisor;
            divisor = (number % divisor);
            number = temp;
        }
        return number;
    }

    private void isPrime(List<Integer> numbers) {
        for (int i = 2; i < numbers.size(); i++) {
            if (numbers.get(i) % i == 0) {
                System.out.println(numbers.get(i) + " is prime");
            } else {
                System.out.println(numbers.get(i) + " is not prime");
            }
        }
    }

    @Test
    void testIsPrime() {
//        List<Integer> numbers = new ArrayList<>(Arrays.asList(1,4,7,9,0,10,22,22));
//        numbers.stream().filter(e -> e % 2 == 0).forEach(e -> System.out.println(e + " is zugi"));
//        isPrime(numbers);

        for (int i = 2; i <= 22; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " zugi");
            } else {
                System.out.println(i + " not zugi");
            }
        }
    }

    @Test
    public void testSetInterface() {
        Set<Integer> myHashSet = new HashSet<>();
        List<Integer> integerList = new ArrayList<>(Arrays.asList(1,4,6,8,9,10,1,4,6,8,9,10));

        integerList.stream().filter(myHashSet::add).forEach(System.out::println);

        for (int i = 0; i < integerList.size(); i++) {
            if (myHashSet.add(integerList.get(i))) {
                System.out.println(integerList.get(i));
            }
        }
        for (int getNum : integerList) {
            if (myHashSet.add(getNum)) {
                System.out.println(getNum);
            }
        }

        Set<Integer> myLinkedSet = new LinkedHashSet<>();
        integerList.stream().filter(myLinkedSet::add).forEach(System.out::println);

        for (int i = 0; i < integerList.size(); i++) {
            if (myLinkedSet.add(integerList.get(i))) {
                System.out.println(integerList.get(i));
            }
        }
        for (int getNum : integerList) {
            if (myLinkedSet.add(getNum)) {
                System.out.println(getNum);
            }
        }

        integerList.stream()
                .filter(e -> e % 2 == 0)
                .dropWhile(e -> e <= 4)
                .distinct()
                .forEach(System.out::println);

    }

    @Test
    public void aVoid() {
        List<Character> characters = new ArrayList<>();
        char a;

        for (a = 'A'; a <= 'Z'; ++a) {
            characters.add(a);
        }

        Predicate<Character> filter = singleChar -> (singleChar != 'A' && singleChar != 'E');
        characters.removeIf(filter);
        System.out.println("" + characters);
    }
}
