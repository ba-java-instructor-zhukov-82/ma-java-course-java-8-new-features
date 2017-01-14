package presentation.lambdas.functional_interfaces;

import java.util.function.Predicate;

public class PredicateTest {

    public static void main(String[] args) {
        predicateTest();
    }

    private static void predicateTest() {
        Predicate isEvenNum = (num) -> (int)num % 2 == 0;
        Predicate isEmptyString = (str) -> ((String)str).length() == 0;

        System.out.println(isEvenNum.test(5));
        System.out.println(isEmptyString.test(""));
    }
}
