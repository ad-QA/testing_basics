package com.lbg;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void input_two_positive_numbers_for_add_result_positive_number() {
        //arrange
        Calculator cut = new Calculator();
        double val1 = 4;
        double val2 = 11;
        double expectedResult = 15;

        //act

        double actualResult = cut.add(val1, val2);

        //assert

        assertEquals(expectedResult,actualResult);
    }

    @Test
    void input_two_positive_numbers_for_subtract_result_positive_number() {
        Calculator cut = new Calculator();
        double val1 = 10;
        double val2 = 8;
        double expectedResult = 2;

        double actualResult =cut.subtract(val1, val2);

        assertEquals(expectedResult,actualResult);

    }

    @Test
    void input_two_positive_numbers_for_remaining_percentage_result_positive_number_remainder_percentage() {
        Calculator cut = new Calculator();
        double val1 = 100;
        double val2 = 20;
        double expectedResult = 80;

        double actualResult =cut.remainingPercentage(val1, val2);

        assertEquals(expectedResult,actualResult);
    }
}