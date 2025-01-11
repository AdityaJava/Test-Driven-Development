package test.driven.development;

public class Calculator {
    public int add(String numbers) {
        if (numbers.length() == 0) {
            return 0;
        }
        if (numbers.length() == 1) {
            return Integer.parseInt(numbers);
        }
        return 999;
    }
}
