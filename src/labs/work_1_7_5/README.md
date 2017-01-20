##Laboratory Work 1.7.5

<p>
    <span>
        Create new project called TestDateTime. 
        Add package “com.brainacad.oop.testapidate”.
    </span>
</p> 

Create a class Main with a main() method, which: 

<ol>
    <li>
        Determine and output the current date and the date of 
        birth, and then define and output the number of your 
        years;
    </li>
    <li>
        Determine in which day of the week you were born and what day of
        the week will be the birthday of this year, then determine was 
        whether this year's birthday;
    </li>
    <li>
        Define a new date and time format 
        (example, "dd.MM.yyyy, HH-mm-ss"). Then determine the current 
        date and time for the multiple time-zones and output them in 
        a new format. 
    </li>
</ol>

####Here is the solution code:

*Solution_1_7_5_Main.java*   
```java
public class Solution_1_7_5_Main {

    public static void main(String[] args) {
        solution_1_7_4();
    }

    private static void solution_1_7_4() {

        solution_1_7_5_1();
        solution_1_7_5_2();
        solution_1_7_5_3();
    }


    /* Determine and output the current date and the date of
       birth, and then define and output the number of your
       years; */

    private static void solution_1_7_5_1() {

        System.out.println("\n\t\tsolution_1_7_5_1\n");


        LocalDate current = LocalDate.now();
        LocalDate birthDay = LocalDate.of(1982, Month.FEBRUARY, 1);

        int age = birthDay.until(current).getYears();

        System.out.format("I'm %d years old%n",age);
    }


    /* Determine in which day of the week you were born and what day of
       the week will be the birthday of this year, then determine was
       whether this year's birthday  */

    private static void solution_1_7_5_2() {

        System.out.println("\n\n\t\tsolution_1_7_5_2\n");

        LocalDate birthDay = LocalDate.of(1982, Month.FEBRUARY, 1);
        System.out.format("Birthday day of week is %s%n", birthDay.getDayOfWeek());


        Period period = birthDay.until(LocalDate.now());
        int years = period.getYears();
        LocalDate thisYearBirthDay = birthDay.plusYears(years);
        System.out.format("This year Birthday day of week is %s%n",
                          thisYearBirthDay.getDayOfWeek());


        period = Period.between(LocalDate.now(), thisYearBirthDay);
        String birthDayMessage = period.isNegative()
                                 ? "Birthday has not yet come"
                                 : "Birthday has already passed";
        System.out.println(birthDayMessage);
    }


    /* Define a new date and time format
       (example, "dd.MM.yyyy, HH-mm-ss"). Then determine the current
       date and time for the multiple time-zones and output them in
       a new format. */

    private static void solution_1_7_5_3() {

        System.out.println("\n\t\tsolution_1_7_5_3\n");

        Instant instant = Instant.now();
        LocalDateTime localDateTime_1 = LocalDateTime.ofInstant(instant, ZoneId.of("Europe/Kiev"));
        LocalDateTime localDateTime_2 = LocalDateTime.ofInstant(instant, ZoneId.of("Europe/London"));
        LocalDateTime localDateTime_3 = LocalDateTime.ofInstant(instant, ZoneId.of("Europe/Madrid"));
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy, HH:mm:ss");

        System.out.println("The current date for Kiev: " + localDateTime_1.format(formatter));
        System.out.println("The current date for London: " + localDateTime_2.format(formatter));
        System.out.format("The current date for Madrid: %s%n%n",
                          localDateTime_3.format(formatter));

        System.out.println(ZonedDateTime.of(localDateTime_1, ZoneId.of("Europe/Kiev")));
        System.out.println(ZonedDateTime.of(localDateTime_1, ZoneId.of("Europe/London")));
        System.out.println(ZonedDateTime.of(localDateTime_1, ZoneId.of("Europe/Madrid")));

    }
}
```