package labs.work_1_7_3;

/* Add a MyConverter functional interface that contains
   an convertStr(String str) abstract method to convert a string
   to uppercase and a isNull(String str) static method to check
   the string to null */

@FunctionalInterface
public interface Converter {

    String convertStr(String str);

    static boolean isNull(String str) {
        if (str == null)
            return true;
        return false;
    }
}
