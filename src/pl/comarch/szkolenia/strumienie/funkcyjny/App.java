package pl.comarch.szkolenia.strumienie.funkcyjny;

import pl.comarch.szkolenia.strumienie.sortowanie.Car;

import java.util.function.*;

public class App {
    public static void main(String[] args) {
        /*Function<String, Integer> funkcja =
                new Function<String, Integer>() {
                    @Override
                    public Integer apply(String s) {
                        return s.length();
                    }
                };*/

        Function<String, Integer> funkcja = s -> s.length();

        System.out.println(funkcja.apply("ABC"));
        System.out.println(funkcja.apply("Janusz"));
        System.out.println(funkcja.apply("java"));

        UnaryOperator<Integer> unaryOperator = i -> i*100;

        System.out.println(unaryOperator.apply(7));
        System.out.println(unaryOperator.apply(10));
        System.out.println(unaryOperator.apply(2));

        BiFunction<String, Integer, Boolean> biFunction =
                (s, i) -> s.length() > i;

        System.out.println(biFunction.apply("janusz", 5));
        System.out.println(biFunction.apply("janusz", 10));
        System.out.println(biFunction.apply("wiesiek", 2));

        Predicate<Car> predicate = c -> c.getPrice() > 200;

        System.out.println(predicate.test(new Car("a", "b", 100)));
        System.out.println(predicate.test(new Car("a", "b", 300)));

        Supplier<Car> supplier =
                () -> new Car("default",
                        "defalut", 0);

        System.out.println(supplier.get());
        System.out.println(supplier.get());

        Consumer<Car> consumer = System.out::println;

        consumer.accept(new Car("x", "y", 100));
        consumer.accept(new Car("Kia", "Ceed", 200));
        consumer.accept(supplier.get());

        Function<String, Integer> function = s -> {
            if(s.length() > 10) {
                return 100;
            } else if(s.length() < 5) {
                return 200;
            } else {
                return 0;
            }
        };
    }
}
