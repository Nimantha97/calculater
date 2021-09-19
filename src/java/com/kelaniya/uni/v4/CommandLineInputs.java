package com.kelaniya.uni.v4;

public class CommandLineInputs {

    private final String[] args;


    // Constructor of the class
    public CommandLineInputs(String[] arguments) {
        this.args = arguments;

    }

    public String getoperator() {
        // Make sure validate arguments before using...
        if (args.length == 0) {
            System.out.println("Please provide the operation as an argument ");
            return "";
        }


        String operator = args[0];

        if (!(operator.equals("add") || operator.equals("sub") || operator.equals("mul") ||operator.equals("div"))) {
            System.out.println("Please provide add,mul or sub as the operator argument");
            return "";
        }
        return operator;
    }
}
