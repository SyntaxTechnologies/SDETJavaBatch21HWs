package week2.d3.e17test;


import org.example.week2.d3.e17.E17ClassifyAnimalsElseIf;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class E17ClassifyAnimalsElseIfTest {

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
    void testClassifyDog() {
        String simulatedCode = "dog";
        E17ClassifyAnimalsElseIf.main(new String[]{simulatedCode});
        String expectedOutput = "The animal is a mammal." + System.lineSeparator();

        String failureMessage = "The output does not match the expected values for animal 'dog'.\n" +
                "Please ensure that your program classifies the animal correctly.";

        assertEquals(expectedOutput, outContent.toString(), failureMessage);
    }

    
   
}
