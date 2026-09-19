import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringUpdaterTest {

    private final StringUpdater updater = new StringUpdater();

    @Test
    void returnsReverseStringFromNormal() {
        String inputString = "J@va the be$t!123";
        String result = updater.turnLetters(inputString);
        assertEquals("t@eb eht av$J!123", result);
    }

    @Test
    void returnsEmptyForEmptyInput() {
        String inputString = "";
        String result = updater.turnLetters(inputString);
        assertEquals("", result);
    }

    @Test
    void oneLetterString() {
        String inputString = "a";
        String result = updater.turnLetters(inputString);
        assertEquals(inputString, result);
    }

    @Test
    void keepsNonLettersInPlace() {
        String inputString = "123 !@#";
        String result = updater.turnLetters(inputString);
        assertEquals(inputString, result);
    }

    @Test
    void reverseOnlyLetters() {
        String inputString = "abcd";
        String result = updater.turnLetters(inputString);
        assertEquals("dcba", result);
    }

    @ParameterizedTest
    @CsvSource({
            "Java, avaJ",
            "AbC, CbA",
            "Hello, olleH",
            "MeThoD, DohTeM"
    })
    void reverseRegisterLetters(String input, String expected) {
        String result = updater.turnLetters(input);
        assertEquals(expected, result);
    }

    @Test
    void nullInput() {
        String input = null;
        String result = updater.turnLetters(input);
        assertEquals("", result);
    }
}
