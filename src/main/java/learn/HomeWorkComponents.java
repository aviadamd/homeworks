package learn;

import java.util.*;

public class HomeWorkComponents {

    protected final List<Integer> numbers = new ArrayList<>(Arrays.asList(6,11,4,15,1000,36,7));

    protected void changeValuesBetween2VariablesWithoutUsingThirdVariable(int a, int b, int x, int y) {
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
                largest = number;
                // add largest number when number is > than largest variable
            }
            if (number < smallest) {
                smallest = number;
                // add smallest number when number is < than smallest variable
            }
        }

        System.out.println("Largest number :" + largest);
        System.out.println("Smallest number :" + smallest);
    }

    protected List<Integer> randomNumbersWithoutRepetition(int N) {
        //array to store N random integers (0 - N-1)
        int[] nums = new int[N];

        // initialize each value at index i to the value i
        for (int i = 0; i < nums.length; ++i) {
            nums[i] = i;
        }

        Random randomGenerator = new Random(); // using the random class util
        int randomIndex; // the randomly selected index each time through the loop
        int randomValue; // the value at nums[randomIndex] each time through the loop
        List<Integer> collector = new ArrayList<>();
        // randomize order of values
        for(int i = 0; i < nums.length; ++i) {
            randomIndex = randomGenerator.nextInt(nums.length);  // select a random index
            randomValue = nums[randomIndex]; //swap values and hold all the numbers within the random index int
            nums[randomIndex] = nums[i]; // start i from the first num 0
            nums[i] = randomValue; // hold i inside numbs array start from num 0
            collector.add(nums[i]); // add the num value to collector list
        }

        return collector; // return fix random list
    }
}
