import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TernaryOperatorTest {

    @Test
    void shouldCheckLeapYear(){
        TernaryOperator ternaryOperator=new TernaryOperator();
        int expectedOutput=28;
        int actualOutput = ternaryOperator.LeapYear(28);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void shouldCheckNotLeapYear(){
        TernaryOperator ternaryOperator=new TernaryOperator();
        int expectedOutput=29;
        int actualOutput = ternaryOperator.LeapYear(29);
        assertEquals(expectedOutput, actualOutput);
    }
}