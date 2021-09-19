package com.kelaniya.uni.v4;

import com.kelaniya.uni.v4.operation.*;

import java.io.IOException;

public class Main {
    // Main class is the coordinator now
    public static void main(String[] args) throws IOException {// kinda wrong


        CommandLineInputs inputs = new CommandLineInputs(args);
        String operator = inputs.getoperator();


        FileReader fileReader = new FileReader();
        Double[] numbers = fileReader.getNumbers();


        OperationFactory operationFactory = new OperationFactory();
        Operation operation = operationFactory.getInstance(operator);
        Double result = operation.execute(numbers);

        UI ui = new UI();
        ui.showMassage("Result is " + result);
       


    }


}
