package week1.e5test;

import org.example.week1.e5.E5AssignmentOperator;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

public class E5AssignmentOperatorTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    void testOutput() {
        E5AssignmentOperator.main(new String[]{});
        String expectedOutput = "Chen" + System.lineSeparator() + "5050";

        // Adding a detailed failure message
        String failureMessage = "The output does not match the expected values.\n" +
                "Please ensure that your program prints the value of 'name' on a new line, followed by 'age' and 'iq' on the same line.";

        assertEquals(expectedOutput, outContent.toString().trim(), failureMessage);
    }
}
