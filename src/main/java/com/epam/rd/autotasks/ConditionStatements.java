package com.epam.rd.autotasks;

import java.rmi.UnexpectedException;

class ConditionStatements {
    public static int task1(int n) {
        return n > 0 ? n * n : n < 0 ? -n : 0;
    }


}
