package com.kelaniya.uni.v5;

import com.kelaniya.uni.v5.input.CommandLineInputs;
import com.kelaniya.uni.v5.input.Inputs;
import com.kelaniya.uni.v5.operation.Operation;
import com.kelaniya.uni.v5.operation.OperationFactory;
import com.kelaniya.uni.v5.operation.repositary.FileNumberRepository;
import com.kelaniya.uni.v5.operation.repositary.NumberRepository;
import com.kelaniya.uni.v5.operation.repositary.SqlNumberRepository;
import com.kelaniya.uni.v5.ui.CmdLineUI;
import com.kelaniya.uni.v5.ui.UI;

import java.io.IOException;

public class Main {
    // Main class is the coordinator now
    public static void main(String[] args) throws IOException {// kinda wrong


        Inputs inputs = new CommandLineInputs(args);
        NumberRepository numberRepository = new SqlNumberRepository();
        OperationFactory operationFactory = new OperationFactory();
        UI ui = new CmdLineUI();
        CalculatorApp app = new CalculatorApp(inputs,numberRepository,operationFactory,ui);
        app.execute();

    }


}
