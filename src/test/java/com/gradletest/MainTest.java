package test.java.com.gradletest;

import com.gradletest.Main;
import org.joda.time.DateTime;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void main() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        DateTime dateTime = new DateTime();

        String[] args = null;
        Main.main(args);

        String expectedOut = "Hello World! It's " + dateTime.year().getAsShortText() + "!";
        assertEquals(expectedOut, outContent.toString());
    }
}