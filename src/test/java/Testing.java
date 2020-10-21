import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class Testing {
    private static List<String> names;

    @BeforeAll
    public static void setUp(){
        names = new ArrayList<>();
        names.add("Fer");
    }

    // We can verify that the names list is not longer null because it was initialized in the setUp() method with the following test:
    @Test
    public void testIfNamesIsInitialized(){
        assertNotNull(names);
    }

    @Test
    public void testIfANameCanBeAdded(){
        assertEquals(1, names.size());
        names.add("Zach");
        assertEquals(2, names.size());
        assertSame("Fer", names.get(0));
        assertSame("Zach", names.get(1));
    }

    @Test
    public void testIfCompanyNameIsEqual() {
        String expected = "Codeup";
        String actual = "Codeup";

        assertEquals(expected, actual);
    }

    @Test
    public void testIfChangeIsCorrect() {
        Double price = 10.0;
        Double discount = 4.5;

        assertEquals(5.5, price - discount, 0);
        assertEquals(5.1, price - discount, 0.5);
        assertNotEquals(4.9, price - discount, 0.5);
    }

    @Test
    public void testIfObjectsAreDifferent() {
        Object dog = new Object();
        Object sheep = new Object();
        Object clonnedSheep = sheep;

        assertNotSame(sheep, dog);
        assertSame(sheep, clonnedSheep);
    }

    @Test
    public void testIfArrayEquals() {
        char[] expected = {'J','u','n','i','t'};
        char[] actual = "Junit".toCharArray();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void testIfGreaterOrLesserThanWorks() {
        boolean learningTDD = true;

        assertTrue(learningTDD);
        assertTrue(5 > 4, "5 is greater than 4");
        assertFalse(5 > 6, "5 is not greater than 6");
    }

    @Test
    public void testIfInstanceIsNull() {
        Device phone = new Device();
        Device laptop = null;
        assertNull(laptop);
        assertNotNull(phone);
    }
}
