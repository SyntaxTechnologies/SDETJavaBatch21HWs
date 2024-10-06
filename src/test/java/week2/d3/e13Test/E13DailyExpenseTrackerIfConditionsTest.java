package week2.d3.e13Test;

import org.example.week2.d3.e13.E13DailyExpenseTrackerIfConditions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class E13DailyExpenseTrackerIfConditionsTest {

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
    void testWithinBudget() {
        // Simulate the program with expenses within budget
        E13DailyExpenseTrackerIfConditions.main(new String[]{});
        String expectedOutput = "Your total daily expense is: 76.25" + System.lineSeparator() +
                "You are within the budget." + System.lineSeparator();

        String failureMessage = "The output does not match the expected values.\n" +
                "Please ensure that your program calculates and checks the total expense correctly.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }
}
