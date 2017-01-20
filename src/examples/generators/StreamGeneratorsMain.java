package examples.generators;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamGeneratorsMain {

    public static void main(String[] args) {
        //streamGenerateMethodTest();
        streamIterateMethodTest();
    }

    private static void streamGenerateMethodTest() {
        Integer[] integers = Stream
                               .generate(() -> (int) (Math.random() * 10 + 1))
                               .limit(5)
                               .toArray(Integer[]::new);

        System.out.println(Arrays.toString(integers));

        List<Integer> list = Stream
                               .generate(() -> (int) (Math.random() * 10 + 1))
                               .limit(5)
                               .collect(Collectors.toList());

        System.out.println(list);
    }

    private static void streamIterateMethodTest() {
        Integer[] integers = Stream
                .iterate(1, (v) -> v + 1)
                .limit(5)
                .toArray(Integer[]::new);

        System.out.println(Arrays.toString(integers));

        List<Integer> list = Stream
                .iterate(10, (v) -> v + 10)
                .limit(5)
                .collect(Collectors.toList());

        System.out.println(list);
    }
}
