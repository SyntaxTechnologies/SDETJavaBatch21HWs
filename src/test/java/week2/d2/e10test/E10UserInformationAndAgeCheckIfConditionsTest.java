package week2.d2.e10test;

import org.example.week2.d2.e10.E10UserInformationAndAgeCheckIfConditions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class E10UserInformationAndAgeCheckIfConditionsTest {

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
    void testUserInformationAndAgeCheck() {
        E10UserInformationAndAgeCheckIfConditions.main(new String[]{});
        String expectedOutput = "Your name is Weqas, your age is 45, and your mobile number is 123-456-7890" + System.lineSeparator() +
                "You are an adult." + System.lineSeparator();

        String failureMessage = "The output does not match the expected values.\n" +
                "Please ensure that your program assigns the correct values to the variables, prints the user information, and checks the age correctly.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }
}
