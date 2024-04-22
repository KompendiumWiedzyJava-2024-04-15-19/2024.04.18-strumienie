package pl.comarch.szkolenia.strumienie;

import java.util.List;

/* Mamy liste imion.
Usuń wszystkie imiona zaczynające się na "A" i wypisz wszystkie pozostałe imiona
w kolejności alfabetycznej tylko małymi literami.
 */
public class Zadanie2 {
    public static void main(String[] args) {
        List<String> names = List.of(
                "Janusz",
                "Wiesiek",
                "Adam",
                "Zyta",
                "Karolina",
                "Borys",
                "Tadeusz"
        );

        names.stream()
                .filter(imie -> !imie.startsWith("a") &&
                        !imie.startsWith("A"))
                .map(String::toLowerCase)
                .sorted()
                .forEach(System.out::println);

    }
}
