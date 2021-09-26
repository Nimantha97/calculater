package com.kelaniya.uni.v5.operation.repositary;

import java.io.IOException;

public class NumberRepositoryExecption extends Exception {
    public NumberRepositoryExecption(Exception e, String massage) {
        super(massage, e);
    }
}
