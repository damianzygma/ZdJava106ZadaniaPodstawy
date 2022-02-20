package pl.sdacademy.java.basic.exercises.day2.task5;

public class Task5 {
    public static void main(String[] args) {
        String input = "Ala ma kota";
        char character = 'a';
        System.out.println(timesContained(input, character));
    }

    //by Marek
    public static int timesContained(String input, char character) {
        if (input != null && !input.isBlank()) {
            int timesContained = 0;
            // Ala ma kota
            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) == character) { // A==a, l==a, ""==a, m==a, ...
                    timesContained++;
                }
            }
            return timesContained;
        }
        return 0;
    }


}
