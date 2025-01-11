package test.driven.development;

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
        if (numbers.startsWith("//")) {
            numbers = getStringFromCustomDelimiter(numbers);
        }
        if (Integer.parseInt(numbers) < 0) {
            throw new IllegalArgumentException("negative numbers not allowed " + numbers);
        }
        List<String> numberListString = Arrays.asList(numbers.replace("\n", ",").split(","));
        int sum = 0;
        for (String numberString : numberListString) {
            sum += Integer.parseInt(numberString);
        }
        return sum;
    }

    private String getStringFromCustomDelimiter(String numbers) {
        String delimiter = "" + numbers.charAt(2);
        String inputString = numbers.substring(4);
        return inputString.replace(delimiter, ",");
    }
}
