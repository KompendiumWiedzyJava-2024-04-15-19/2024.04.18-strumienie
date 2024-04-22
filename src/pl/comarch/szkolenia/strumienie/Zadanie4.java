package pl.comarch.szkolenia.strumienie;

/*
Stwórz listę stringów ( 10 dowolnych stringów)
napisz program który wyświetla jaka jest
średnia długość stringów które nie zawierają
spacji i wielkich liter po usunięciu ze stringów
kropek i przecinków.
 */

import java.util.List;
import java.util.OptionalDouble;

public class Zadanie4 {
    public static void main(String[] args) {
        List<String> strings = List.of(
                "lkajhsdg fasgdjgas",
                "kjaysgdjFygasjsg",
                "oifwuahfoias",
                "aisydbiay.hbsduyb",
                "ia67sdg8Yagsdiuygf",
                "lkasjhdlfiuhasd",
                "KUT ASF",
                "uasy,dgu",
                "go8asydguyf",
                "ajshdg.fkjhag,sl kh"
        );

        OptionalDouble avgBox = strings.stream()
                .filter(s -> s.equals(s.toLowerCase()))
                .filter(s -> !s.contains(" "))
                .map(s -> s.replace(".", ""))
                .map(s -> s.replace(",", ""))
                .mapToInt(s -> s.length())
                .average();

        System.out.println(avgBox.getAsDouble());
    }
}
