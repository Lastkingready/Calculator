import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CalculatorTest {
    //include this below test case
    @Test
    void testAdd() {
        Calculator test = new Calculator();
        int output = test.add(1, 2);
        assertEquals(3, output, "Testcase 1 failed");

    }
    @Test
    void testAdd2() {
        Calculator test = new Calculator();
        int output = test.add(1, -4);
        assertEquals(-3, output, "Testcase 2 failed");
    }


    @Test
    void testSubtract() {
        Calculator test = new Calculator();
        int output = test.subtract(589, 230);
        assertEquals(359, output, "Testcase 3 failed");
    }
    @Test
    void testSubtract2() {
        Calculator test = new Calculator();
        int output = test.subtract(-10, -12);
        assertEquals(2, output, "Testcase 4 failed");
    }

    @Test
    void testMultiply() {
        Calculator test = new Calculator();
        int output = test.multiply(3, 12);
        assertEquals(36, output, "Testcase 5 failed");
    }

    @Test
    void testMultiply2() {
        Calculator test = new Calculator();
        int output = test.multiply(9, -5);
        assertEquals(-45, output, "Testcase 6 failed");
    }

    @Test
    void testDivide() {
        Calculator test = new Calculator();
        int output = test.division(20, 10);
        assertEquals(2, output, "Testcase 7 failed");
    }
    @Test
    void testDivide2() {
        Calculator test = new Calculator();
        int output = test.division(-18, 3);
        assertEquals(-6, output, "Testcase 8 failed");
    }

}
