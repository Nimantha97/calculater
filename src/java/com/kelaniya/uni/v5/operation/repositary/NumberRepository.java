package com.kelaniya.uni.v5.operation.repositary;

import java.io.IOException;
import java.sql.SQLException;

public interface NumberRepository {

    Double[] getNumbers() throws NumberRepositoryExecption;

}
