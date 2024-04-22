package pl.comarch.szkolenia.strumienie.funkcyjny;

import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class App2 {
    public static void main(String[] args) {
        loadAndCalculate(App2::loadFromFile, App2::calculate2);
        loadAndCalculate(App2::loadFromWeb, App2::calculate3);
    }

    public static int loadFromDB() {
        return 5;
    }

    public static int loadFromFile() {
        return 10;
    }

    public static int loadFromWeb() {
        return 20;
    }

    public static int calculate1(int x) {
        return x * 10;
    }

    public static int calculate2(int x) {
        return x * 20;
    }

    public static int calculate3(int x) {
        return x * 30;
    }

    public static int loadFormDBAndCalculate1() {
        int x = loadFromDB();
        return calculate1(x);
    }

    public static int loadAndCalculate(Supplier<Integer> loadFunction,
                                UnaryOperator<Integer> calculator) {
        int x = loadFunction.get();
        return calculator.apply(x);
    }
}
