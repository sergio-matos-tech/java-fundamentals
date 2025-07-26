package org.test;

public class Calculator {

    private Integer sum;

    public Integer sumArray(Integer[] array) {

        sum = 0;
        int length = array.length;
        for (Integer integer : array) {
            sum += integer;
        }

        return sum;
    }
}
