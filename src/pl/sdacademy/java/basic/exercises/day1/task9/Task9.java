package pl.sdacademy.java.basic.exercises.day1.task9;

public class Task9 {
    public static void main(String[] args) {

        int rangeTo = 15;
        System.out.println("Range form 0 to " + rangeTo);
        for (int i = 0; i <= rangeTo; i++) {
            System.out.println(fizzBuzz(i));
        }
    }

    private static String fizzBuzz(int i) {
        if (i % 15 == 0) {
            return "FizzBuzz";
        } else if (i % 5 == 0) {
            return "Buzz";
        } else if (i % 3 == 0) {
            return "Fizz";
        }
        return String.valueOf(i);

    }


}
