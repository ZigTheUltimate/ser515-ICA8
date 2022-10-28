import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class TestJunit {
    @Test
    public void testInput() {
        String str = "C:\\Users\\morea\\OneDrive\\Desktop\\input1.txt";
        System.out.println("====== Anmol More == TEST TYPE ONE EXECUTED =======");
        assertEquals("1001", urinals.inputFromFile(str));

        str = "C:\\Users\\morea\\OneDrive\\Desktop\\input2.txt";
        System.out.println("====== Anmol More == TEST TYPE ONE EXECUTED =======");
        assertEquals("10001", urinals.inputFromFile(str));
    }

    @Test
    public void testCountUrinal() {
        HashMap<String, Integer> testCases = new HashMap<>();

        testCases.put("10001", 1); //returns  (10101)

        testCases.put("1001", 0); //returns  (1001)

        testCases.put("00000", 3); //returns  (10101)

        testCases.put("0000", 2); //returns  (1001)

        testCases.put("01000", 1); //returns  (01010 or 01001)

        testCases.put("10101", 0); // returns (10101)

        testCases.put("11111", -1); // wrong input

        testCases.put("0", 1); // returns (1)

        testCases.put("001100", -1); // wrong input

        int count = 1;

        for (Map.Entry<String, Integer> testCase: testCases.entrySet()) {
            System.out.println("====== Anmol More == TEST TYPE TWO, TEST NO.: " + count + " EXECUTED =======");
            System.out.println(testCase.getKey());
            assertEquals(testCase.getValue(), urinals.countUrinals(testCase.getKey()));
            count++;
        }

    }

    @Test
    public void testOutput(){
        urinals.outputToFile(123);
        File outputFile = new File("rule.txt");
        try {
            BufferedReader br = new BufferedReader(new FileReader(outputFile));
            assertEquals(123, Integer.parseInt(br.readLine()));
        } catch (FileNotFoundException e) {
            Assertions.fail("Output file not created");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        urinals.outputToFile(123);
        outputFile = new File("rule1.txt");
        try {
            BufferedReader br = new BufferedReader(new FileReader(outputFile));
            assertEquals(123, Integer.parseInt(br.readLine()));
        } catch (FileNotFoundException e) {
            Assertions.fail("Output file not created");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}