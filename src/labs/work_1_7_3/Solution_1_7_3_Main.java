package labs.work_1_7_3;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Solution_1_7_3_Main {

    public static void main(String[] args) {
        solution_1_7_2_Main();
    }

    private static void solution_1_7_2_Main() {

        List<String> listStr = Arrays.asList(
                "Java", "C#", "Fortran",
                "Ada", "Modula",
                "Python", "JavaScript");

        /* Add in a main() method code that invokes updateList() method
           and output the result. */

        System.out.println();
        updateList(listStr);
        System.out.println("Updated list:");
        listStr.forEach(System.out::println);
    }

    private static void printJStr(List<String> list, Predicate<String> predicate) {
        System.out.println("String list with the letter J");
        for (String str : list) {
            if (predicate.test(str)) {
                System.out.print( str + " ");
            }
        }
        System.out.println();
    }

    /* Add in a Main class a updateList() static method, which converts
       the strings of list to uppercases */

    public static void updateList(List<String> list) {
        Converter converter = s -> {
            if (!Converter.isNull(s)) {
                s = s.toUpperCase();
            }
            return s;
        };

        for (int i=0; i<list.size(); i++) {
            list.set(i, converter.convertStr(list.get(i)));
        }
    }
}
