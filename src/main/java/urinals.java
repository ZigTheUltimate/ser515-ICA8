/**
 * @author Anmol More
 */

public class urinals {

    public static void main(String[] args) {

        // TODO: Read input from file
        String input;
        if (args[0] == null || args[0].trim().isEmpty()) {
            System.out.println("You need to specify a path!");
            return;
        } else {
            input = inputFromFile(args[0]);
        }
        // TODO: Count urinals
        int output = countUrinals(input);

        System.out.println(output);

    }

    protected static int countUrinals(String input) {
        return -1;
    }

    protected static String inputFromFile(String arg) {
        return arg;
    }

}
