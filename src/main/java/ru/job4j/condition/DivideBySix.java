package ru.job4j.condition;

public class DivideBySix {

    public static String checkNumber(int number) {
        String rsl = "";
        if (number % 2 == 0 && number % 3 == 0) {
            rsl = "The number divides by 6.";
        }
        if (number % 2 != 0 && number % 3 == 0) {
            rsl = "The number divides by 3, but it isn't the even number.";
        }
        if (number % 2 == 0 && number % 3 != 0) {
            rsl = "The number doesn't divide by 3, but it is the even number.";
        }
        if (number % 2 != 0 && number % 3 != 0) {
            rsl = "The number doesn't divide by 3 and it isn't the even number.";
        }
        return rsl;
    }

}
