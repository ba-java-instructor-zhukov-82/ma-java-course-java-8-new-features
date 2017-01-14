##Laboratory Work 1.7.1

<p>
    <span>
        Create new project called TestLambda. 
        Add package “com.brainacad.oop.testlambda”.
    </span>
</p> 

<ol>
    <li>
        Create a class Main with a main() method, which creates array of
        Integer type and fills it with random values. Add in a main() 
        method of the sorting code an array of integer values in 
        descending order, using lambda expressions to specify the sort 
        order. 
    </li>
    <li>
        Add in a main() method code that creates a list of strings and 
        sorts it in the reverse alphabetical order. Using lambda 
        expressions to specify the sort order. 
    </li>
</ol>

####Here is the solution code:

*Solution_1_7_1_Main.java*   
```java
/* Create a class Main with a main() method, which creates array of
   Integer type and fills it with random values. Add in a main()
   method of the sorting code an array of integer values in
   descending order, using lambda expressions to specify the sort
   order. */



public class Solution_1_7_1_Main {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        solution_1_7_1_Main();

        //close standard in -->
        sc.close();
    }

    private static void solution_1_7_1_Main() {

        Integer[] arrayInt = createArray();
        System.out.println("Before sorting:\n" + Arrays.toString(arrayInt));
        Arrays.sort(arrayInt, (a, b) -> b.compareTo(a));
        System.out.println("\nAfter sorting:\n" + Arrays.toString(arrayInt));

        /* Add in a main() method code that creates a list of strings and
           sorts it in the reverse alphabetical order. Using lambda
           expressions to specify the sort order. */

        System.out.println();
        List<String> listStr = Arrays.asList("Java", "C#", "Fortran", "Ada", "Modula", "Python", "JavaScript");
        System.out.println("Before sorting:\n" + listStr);
        Collections.sort(listStr, (s1, s2) -> s2.compareTo(s1));
        System.out.println("\nAfter sorting:\n" + listStr);
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
}
```