package com.kelaniya.uni.v5.operation.repositary;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FileNumberRepository implements NumberRepository {
    public Double[] getNumbers() throws NumberRepositoryExecption {
        // read the numbers line by line
        List<String> numbers_Str = null;
        try {
            numbers_Str = Files.readAllLines(
                    Paths.get("calculater\\src\\java\\com\\kelaniya\\uni\\v2\\numbers.txt")
            );
        } catch (IOException e) {

            throw new NumberRepositoryExecption(e,"Couldn't read the text file");
        }


        double num1 = Double.parseDouble(numbers_Str.get(0));
        double num2 = Double.parseDouble(numbers_Str.get(1));
        return new Double[]{num1,num2};
    }
}
