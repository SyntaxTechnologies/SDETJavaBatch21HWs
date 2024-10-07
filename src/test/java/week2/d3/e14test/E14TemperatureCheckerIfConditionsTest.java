package week2.d3.e14test;

import org.example.week2.d3.e14.E14TemperatureCheckerIfConditions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class E14TemperatureCheckerIfConditionsTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final java.io.InputStream originalIn = System.in;

    @BeforeEach
    void setUpStreams() {
        // Redirect System.out to capture outputs
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    void restoreStreams() {
        // Restore original System.out and System.in
        System.setOut(originalOut);
        System.setIn(originalIn);
    }


    @Test
    void testBoundaryTemperature20() {



        E14TemperatureCheckerIfConditions.main(new String[]{});

        // Define expected output
        String expectedOutput = "It's warm outside." + System.lineSeparator();

        // Assert the output
        assertEquals(expectedOutput, outContent.toString(),
                "The boundary temperature 20 did not produce the expected output.");
    }







}