package test.driven.development;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Calculator {
    public int add(String numbers) {
        if (numbers.length() == 0) {
            return 0;
        }
        if (numbers.length() == 1) {
            return Integer.parseInt(numbers);
        }
        List<String> numberListString = Arrays.asList(numbers.replace("\n", ",").split(","));
        int sum = 0;
        for (String numberString : numberListString) {
            sum += Integer.parseInt(numberString);
        }
        return sum;
    }
}
