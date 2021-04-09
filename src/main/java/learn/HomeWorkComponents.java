package learn;

import java.util.*;

public class HomeWorkComponents {

    protected final List<Integer> numbers = new ArrayList<>(Arrays.asList(6,11,4,15,1000,36,7));

    protected void changeValuesBetween2VariablesWithoutUsingThirdVariable(int a, int b, int x, int y) {
        // not fully understand the question
        if (a == x && b == y) {

            a = x + b;
            b = x - a;
            a = x - y;

            System.out.println("a value : " + a);
            System.out.println("b value : " + b);
            System.out.println("x value : " + x);
            System.out.println("y value : " + y);
        }
    }

    protected int factorialRecursionMethod(int n) {
        // stop number O
        if (n <= 1)
            return 1;
        return (n * factorialRecursionMethod(n -1));
    }

    protected List<Integer> sortNumbersFromLowestNumberToHighest(List<Integer> numbers) {
        Collections.sort(numbers);
        //sort numbers to ordered list
        Collections.reverse(numbers);
        //reverse numbers to present the number from the lowest to highest
        return numbers;
    }

    protected void printTheLowestAndTheHighest(List<Integer> numbers) {
        int largest = numbers.get(0);
        int smallest = numbers.get(0);

        for (Integer number : numbers) {

            if (number > largest) {
                // add largest number when number is > than largest variable
                largest = number;

            }

            if (number < smallest) {
                // add smallest number when number is < than smallest variable
                smallest = number;
            }
        }

        System.out.println("Largest number :" + largest);
        System.out.println("Smallest number :" + smallest);
    }

    protected List<Integer> executeRandomDistinctNumbers(int N) {
        //array to store N random integers params
        int[] storeNumbers = new int[N];

        // initialize each value index to the value i
        for (int i = 0; i < storeNumbers.length; ++i) {
            storeNumbers[i] = i;
        }

        // using the random class util provider
        Random randomNumbers = new Random();

        // the randomly selected index each time through the loop
        int randomIndex;

        // the value at nums[randomIndex] each time through the loop
        int randomValue;

        // add list of numbers to store values and return
        List<Integer> collector = new ArrayList<>();

        // randomize order of values
        for(int i = 0; i < storeNumbers.length; ++i) {

            // select a random index
            randomIndex = randomNumbers.nextInt(storeNumbers.length);

            //swap values and hold all the numbers within the random index int
            randomValue = storeNumbers[randomIndex];

            // start i from the first num 0
            storeNumbers[randomIndex] = storeNumbers[i];

            // hold i inside numbs array start from num 0
            storeNumbers[i] = randomValue;

            // add the num value to collector list
            collector.add(storeNumbers[i]);
        }

        // return fix random list
        return collector;
    }
}
