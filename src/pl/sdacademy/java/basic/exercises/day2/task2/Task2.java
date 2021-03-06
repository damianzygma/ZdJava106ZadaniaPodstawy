package pl.sdacademy.java.basic.exercises.day2.task2;

public class Task2 {
    public static void main(String[] args) {

        System.out.println(isWordStarsWithPrefix("programowanie", "pro"));
        System.out.println(isWordStarsWithPrefix(null, "pro"));
        System.out.println(isWordStarsWithPrefix("", "pro"));

        System.out.println();

        System.out.println(isWordEndWithSuffix("programowanie", "pro"));
        System.out.println(isWordEndWithSuffix("programowanie", "nie"));
    }

    private static boolean isWordStarsWithPrefix(String input, String prefix) {
        // logika ? akcja gdy true : akcja gdy false
//        boolean tmp = return input != null ? "ok" : "error";

        return input != null ? input.startsWith(prefix) : false;
//        if(input != null) {
//            return input.startsWith(prefix);
//        }
//        return false;
    }

    private static boolean isWordEndWithSuffix(String input, String suffix) {
        return input != null ? input.endsWith(suffix) : false;
    }
}
