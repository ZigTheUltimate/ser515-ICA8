import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestJunit {
    @Test
    public void testInput() {
        String str = "test";
        System.out.println("====== Anmol More == TEST TYPE ONE EXECUTED =======");
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
        int count = 1;
        for (Map.Entry<String, Integer> testCase: testCases.entrySet()) {
            System.out.println("====== Anmol More == TEST TYPE TWO COUNT" + count + " EXECUTED =======");
            assertEquals(testCase.getValue(), urinals.countUrinals(testCase.getKey()));
            count++;
        }

    }
}