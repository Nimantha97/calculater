package com.kelaniya.uni.v2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {// kinda wrong

        // Make sure validate arguments before using...
        if (args.length == 0) {
            System.out.println("Please provide the operation as an argument ");
            return;
        }


        String operator = args[0];

        if (!(operator.equals("add") || operator.equals("sub") || operator.equals("mul"))) {
            System.out.println("Please provide add,mul or sub as the operator argument");
            return;

        }
        // read the numbers line by line
        List<String> numbers_Str = Files.readAllLines(
                Paths.get("calculater\\src\\java\\com\\kelaniya\\uni\\numbers.txt")
        );


        double num1 = Double.parseDouble(numbers_Str.get(0));
        double num2 = Double.parseDouble(numbers_Str.get(1));

        double result = 0;

        if (operator.equals("add")) {
            result = num1 + num2;
        } else if (operator.equals("sub")) {
            result = num1 - num2;
        } else if (operator.equals("mul")) {
            result = num1 * num2;
        }

        System.out.println("Result is " + result);


    }


}
