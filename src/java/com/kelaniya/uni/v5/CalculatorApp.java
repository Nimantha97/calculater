package com.kelaniya.uni.v5;

import com.kelaniya.uni.v5.input.Inputs;
import com.kelaniya.uni.v5.input.InvalidInputException;
import com.kelaniya.uni.v5.operation.InvalidCalcOperationException;
import com.kelaniya.uni.v5.operation.Operation;
import com.kelaniya.uni.v5.operation.OperationFactory;
import com.kelaniya.uni.v5.operation.repositary.NumberRepository;
import com.kelaniya.uni.v5.operation.repositary.NumberRepositoryExecption;
import com.kelaniya.uni.v5.ui.UI;

import java.io.IOException;

public class CalculatorApp {

    private final Inputs inputs;
    private final NumberRepository numberRepository;
    private final OperationFactory operationFactory;
    private final UI ui;

    public CalculatorApp(Inputs inputs, NumberRepository numberRepository, OperationFactory operationFactory, UI ui) {

        this.inputs = inputs;
        this.numberRepository = numberRepository;
        this.operationFactory = operationFactory;
        this.ui = ui;
    }

    public void execute() {


        String operator = null;
        try {
            operator = inputs.getoperator();
        } catch (InvalidInputException e) {
            return;

        }
        Double[] numbers = new Double[0];
        try {
            numbers = numberRepository.getNumbers();
        } catch (NumberRepositoryExecption numberRepositoryExecption) {
            numberRepositoryExecption.printStackTrace();
        }
        Operation operation = operationFactory.getInstance(operator);
        Double result = null;
        try {
            result = operation.execute(numbers);
        } catch (InvalidCalcOperationException e) {
            ui.showMassage("Error Occurred. " + e.getMessage());
            return;
        }
        ui.showMassage("Result is " + result);

    }
}
