package com.kelaniya.uni.v5.input;

public class CommandLineInputs implements Inputs {

    private final String[] args;


    // Constructor of the class
    public CommandLineInputs(String[] arguments) {
        this.args = arguments;

    }

    public String getoperator() throws InvalidInputException {
        // Make sure validate arguments before using...
        if (args.length == 0) {

            throw new InvalidInputException("please provide the operation as an argument");
        }


        String operator = args[0];

        if (!(operator.equals("add") || operator.equals("sub") || operator.equals("mul") ||operator.equals("div"))) {

            throw new InvalidInputException("please provide the operation as an argument");
        }
        return operator;
    }
}
