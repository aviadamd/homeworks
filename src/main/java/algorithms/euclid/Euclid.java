package algorithms.euclid;

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
}
