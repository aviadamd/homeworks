package collections;

import org.junit.jupiter.api.Test;
import java.util.*;
import java.util.function.Predicate;

public class Misc {

    @Test
    void testIsPrime() {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(22,14,33,3,5,7,99));
        for (int i = 2; i < numbers.size(); i++) {
            if (numbers.get(i) % i == 0) {
                System.out.println(numbers.get(i) + " is prime");
            } else {
                System.out.println(numbers.get(i) + " is not prime");
            }
        }
    }

    @Test
    void testIsZugi() {
        for (int i = 2; i <= 22; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " zugi");
            } else {
                System.out.println(i + " not zugi");
            }
        }
    }

    @Test
    public void charactersPrint() {
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
