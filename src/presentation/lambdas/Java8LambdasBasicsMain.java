package presentation.lambdas;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Java8LambdasBasicsMain {

    private static Consumer printer = (data) -> System.out.println(data);

    public static void main(String[] args) {

        BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;
        Supplier<Integer> get123 = () -> 123;
        Consumer<String> printerStr = (String s) -> System.out.println(s);

        printer.accept(add.apply(5, 10));
        printer.accept(get123.get());
        printerStr.accept("Hello from lambda!");
    }
}
