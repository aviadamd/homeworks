package learn;

import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class HomeWork {

    private HomeWorkComponents homeWorkComponents;

    @BeforeEach
    public void initHomeWorkComponents() {
        homeWorkComponents = new HomeWorkComponents();
    }

    @Test
    @Order(1)
    @DisplayName("question 1: printValuesBetween2VariablesWithoutUsingThirdVariable")
    public void printValuesBetween2VariablesWithoutUsingThirdVariable() {
        homeWorkComponents.changeValuesBetween2VariablesWithoutUsingThirdVariable(1,1,1,1);
    }

    @Test
    @Order(2)
    @DisplayName("question 2: recursionMethodTest")
    void recursionMethodTest() {
        int fac = 5;
        System.out.println("Factorial of number "+fac+" is : " + homeWorkComponents.factorialRecursionMethod(fac));
    }

    @Test
    @Order(3)
    @DisplayName("question 3: sortedHighestNumberFromList")
    void sortedHighestNumberFromList() {
        System.out.println(homeWorkComponents
                .sortNumbersFromLowestNumberToHighest(homeWorkComponents.numbers));
    }

    @Test
    @Order(4)
    @DisplayName("question 3: sortedHighestNumberFromList")
    void printTheLowestAndTheHighestNumbers() {
        homeWorkComponents.printTheLowestAndTheHighest(homeWorkComponents.numbers);
    }

    @Test
    @Order(5)
    @DisplayName("question 4: printRandomNumbersWithoutRepetition")
    public void printRandomNumbersWithoutRepetition() {
        homeWorkComponents.randomNumbersWithoutRepetition(1000).forEach(System.out::println);
    }

}
