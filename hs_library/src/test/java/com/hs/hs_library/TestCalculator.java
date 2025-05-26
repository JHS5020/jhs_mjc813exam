package com.hs.hs_library;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TestCalculator {
    @Test
    public void test_Calculate() {
        Calculator calc = new Calculator();
        assertThat(calc.add(1,11)).isEqualTo(12);
        assertThat(calc.add(-5,20)).isEqualTo(15);
        assertThat(calc.add(0,11)).isEqualTo(11);
        assertThat(calc.sub(1,11)).isEqualTo(-10);
        assertThat(calc.sub(5,3)).isEqualTo(2);
        assertThat(calc.sub(0,11)).isEqualTo(-11);
        assertThat(calc.mul(2,6)).isEqualTo(12);
        assertThat(calc.mul(0,7)).isEqualTo(0);
        assertThat(calc.div(10,7)).isEqualTo(1);
        assertThat(calc.div(20,3)).isEqualTo(6);
        assertThat(calc.mod(10,7)).isEqualTo(3);
        assertThat(calc.mod(20,3)).isEqualTo(2);
        assertThat(calc.pow(3,3)).isEqualTo(27);
        assertThat(calc.pow(2,5)).isEqualTo(32);
        assertThat(calc.addb(new int[] {1,2,3,4})).isEqualTo(10);

    }
}
