package pl.comarch.szkolenia.strumienie;

/*
Mamy liste liczb. Policz średnią tylko parzystych liczb.
 */

import java.util.List;
import java.util.OptionalDouble;

public class Zadanie3 {
    public static void main(String[] args) {
        List<Integer> list = List.of(2,453,5,23,56,43,2,545,43,34,43,45,254,4565,65,4,23);

        OptionalDouble avrBox = list.stream()
                .filter(x -> x % 2 == 0)
                .mapToInt(x -> x)
                .average();
        System.out.println(((int)
                (avrBox.getAsDouble() * 100)) / 100.0);
    }
}
