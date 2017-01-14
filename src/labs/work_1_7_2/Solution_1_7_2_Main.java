package labs.work_1_7_2;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class Solution_1_7_2_Main {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        solution_1_7_2_Main();
    }

    private static void solution_1_7_2_Main() {

        Integer[] arrayInt = createArray();

        /* Add in a main() method code that invokes sumEven() method
           and in the form of a lambda expression specifies
           the selection condition the values of the array elements */

        System.out.println();
        System.out.format("The sum of even numbers array: %d%n",
                           sumEven(arrayInt, p -> p % 2 == 0));


        List<String> listStr = Arrays.asList(
                "Java", "C#", "Fortran",
                "Ada", "Modula",
                "Python", "JavaScript");

        /* Add in a main() method code that invokes printJStr() method
           and in the form of a lambda expression specifies
           the selection condition the strings */

        System.out.println();
        printJStr(listStr, p -> p.charAt(0) == 'J');
    }

    private static Integer[] createArray() {

        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        System.out.print("Enter min value of randomizer range: ");
        int min = sc.nextInt();
        System.out.print("Enter max value of randomizer range: ");
        int max = sc.nextInt();

        Integer[] array = new Integer[size];

        for (int i = 0; i < array.length; ++i)
            array[i] = (int) (min + Math.random() * (max - min + 1));

        return  array;
    }

    /* Add in a Main class a sumEven() static method that takes
       two parameters: the first - an array of integers, and
       the second - the predicate of Predicate type for
       selecting numbers */

    private static int sumEven(Integer[] array, Predicate<Integer> predicate) {
        int sum = 0;
        for(Integer number : array) {
            if (predicate.test(number)) {
                sum += number;
            }
        }
        return sum;
    }

    /* Add in a Main class a printJStr() static method that takes
       two parameters: the first - an list of strings, and
       the second - the predicate of Predicate type for the selection
       of strings beginning with a given letter */

    private static void printJStr(List<String> list, Predicate<String> predicate) {
        System.out.println("String list with the letter J");
        for (String str : list) {
            if (predicate.test(str)) {
                System.out.print( str + " ");
            }
        }
        System.out.println();
    }
}
