package com.kelaniya.uni.v5.operation;

public class DivOperation implements Operation {
    public Double execute(Double[] numbers) throws InvalidCalcOperationException {

        if (numbers[1] == 0){
<<<<<<< HEAD

=======
>>>>>>> 9edfa3665b367a88adb717f9d0e7f76fac9d935f
            throw new InvalidCalcOperationException("Do not divide by zero");
        }

        return numbers[0] / numbers[1];
    }
}
