package ie.atu.week6;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalcTest {
    Calc myCalc;

    @BeforeEach
    void setUp() {
        myCalc = new Calc();
    }

    @Test
    void testAdd(){assertEquals(10, myCalc.Add(4, 6));}

    @Test
    void testSubtract(){assertEquals(2, myCalc.Subtract(6, 4));}

    @Test
    void testMultiply(){assertEquals(24, myCalc.Multiply(4, 6));}

    @Test
    void testDivide(){assertEquals(6, myCalc.Divide(24, 4));}

    @AfterEach
    void tearDown() {
    }


}