package com.kelaniya.uni.v3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FileReader {
    public Double[] getNumbers() throws IOException {
        // read the numbers line by line
        List<String> numbers_Str = Files.readAllLines(
                Paths.get("calculater\\src\\java\\com\\kelaniya\\uni\\v2\\numbers.txt")
        );


        double num1 = Double.parseDouble(numbers_Str.get(0));
        double num2 = Double.parseDouble(numbers_Str.get(1));
        return new Double[]{num1,num2};
    }
}
