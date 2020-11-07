import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class MyFirstTest {

    @Test
    public void testIfStringIsEqual() {
        String expected = "Codeup";
        String actual = "Codeup";

        assertEquals(expected, actual);
    }

    @Test
    public void testIfArrayListIsSame() {
        List<String> languages = new ArrayList<>();
        List<String> moreLanguages = new ArrayList<>();

        assertNotSame(languages, moreLanguages);
    }

    @Test
    public void testIfArrayEquals() {
        int[] numbers = {1, 2, 3};
        int[] newNumbers = {3, 2, 3};
        int[] otherNumbers = new int[3];
        otherNumbers[0] = 1;
        otherNumbers[1] = 2;
        otherNumbers[2] = 3;

        assertArrayEquals(numbers, otherNumbers);
        assertFalse(Arrays.equals(numbers, newNumbers));
    }

    @Test
    public void testStringContainsSubstring() {
        String language = "PHP";

        assertTrue(language.contains("H")); // use assertTrue for this statement
        assertFalse(language.contains("J")); // use assertFalse for this statement
    }
}
