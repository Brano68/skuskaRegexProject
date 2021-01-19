package sk.kosickaakademia.regex;

public class Main {
    public static void main(String[] args) {
        NoRegex noRegex = new NoRegex();
        System.out.println(noRegex.isValidSPZ("KK2 7KK"));

        System.out.println(noRegex.isValidID("HU159876"));
    }
}
