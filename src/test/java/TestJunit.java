import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestJunit {
    @Test
    public void testInput() {
        String str = "C:\\Users\\morea\\OneDrive\\Desktop\\input.txt";
        assertEquals("Hello", urinals.inputFromFile(str));
    }

    @Test
    public void testCountUrinal() {
        HashMap<String, Integer> testCases = new HashMap<>();
        testCases.put("10001", 1); //returns  (10101)

        testCases.put("1001", 0); //returns  (1001)

        testCases.put("00000", 3); //returns  (10101)

        testCases.put("0000", 2); //returns  (1001)

        testCases.put("01000", 1); //returns  (01010 or 01001)

        for (Map.Entry<String, Integer> testCase: testCases.entrySet()) {
            assertEquals(testCase.getValue(), urinals.countUrinals(testCase.getKey()));
        }

    }
}