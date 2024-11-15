package examples.flowanalysis;

public class DivisionByZero {
    int test(boolean condition, int value) {
        return value / getValue(condition);
    }

    int getValue(boolean condition) {
        return condition ? 10 : 0;
    }
}
