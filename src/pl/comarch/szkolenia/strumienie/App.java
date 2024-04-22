package pl.comarch.szkolenia.strumienie;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) {
        List<Integer> list =
                List.of(1,2,2,3,4,5,10,6,-1,7,8,1,9,10,11);

        Stream<Integer> stream = list.stream();
        stream
                .takeWhile(i -> i < 5)
                .forEach(System.out::println);
    }
}
