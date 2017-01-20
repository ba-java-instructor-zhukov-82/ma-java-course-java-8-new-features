package labs.work_1_7_4;


import static labs.work_1_7_4.Person.Gender.MALE;
import static labs.work_1_7_4.Person.Gender.FEMALE;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Solution_1_7_4_Main {

    public static void main(String[] args) {
        solution_1_7_2();
    }

    private static void solution_1_7_2() {

        solution_1_7_2_1();
        solution_1_7_2_2();
        solution_1_7_2_3();
    }

    private static void solution_1_7_2_1() {

        System.out.println("\n\t\tsolution_1_7_2_1\n");


        /* create and output a list of integers using Stream
           functions: create an infinite stream of integers,
           starting at 10 and increasing every next on 10,
           then restrict it 10 the first elements,
           which are then halved and collect the list */

        List<Integer> integers = Stream
                                   .iterate(10, (v) -> v + 10)
                                   .limit(10)
                                   .map((v) -> v / 2)
                                   .collect(Collectors.toList());

        System.out.println(integers);


        /* create a list of strings of 10 elements and then using
           the Stream, select, sort and print the lines starting
           with some a symbol */

        List<String> symbols = Arrays.asList(
                "Fortran", "Kotlin", "Java", "Delphi", "Python",
                "Ajax", "Agol", "Basic", "Cobol", "JavaScript"
        );

        symbols.stream()
               .filter((l) -> l.charAt(0) == 'J')
               .sorted()
               .forEach(System.out::println);
    }


    /* Add in a main() method to create
       a collection of objects of type Person. Then using Stream,
       select and print to the console all military men (from 18 to 27
       years old).  */

    private static void solution_1_7_2_2() {

        System.out.println("\n\n\t\tsolution_1_7_2_2\n");

        List<Person> militaryMans = listOfPersons()
                                      .stream()
                                      .filter((p) -> p.getAge() >= 18 &&
                                                     p.getGender() == Person.Gender.MALE)
                                      .collect(Collectors.toList());

        System.out.println(militaryMans);
    }


    /* Determine for list objects of Person type the average age of
       women with using Stream a collection of objects of type Person. */

    private static void solution_1_7_2_3() {

        System.out.println("\n\t\tsolution_1_7_2_3\n");

        List<Person> womans = listOfPersons()
                                    .stream()
                                    .filter((p) -> p.getGender() == Person.Gender.FEMALE)
                                    .collect(Collectors.toList());

        System.out.println(womans);
    }

    public static List<Person> listOfPersons() {
        return Arrays.asList(
                new Person("Mykola", 41, MALE),
                new Person("Olena", 43, FEMALE),
                new Person("Yevhen", 35, MALE),
                new Person("Ksenia", 21, FEMALE),
                new Person("Pavlo", 11, MALE)
        );
    }
}
