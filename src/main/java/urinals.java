import java.io.*;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Anmol More
 */

public class urinals {

    public static void main(String[] args) {

        String input;
        if (args[0] == null || args[0].trim().isEmpty()) {
            System.out.println("You need to specify a path!");
            return;
        } else {
            input = inputFromFile(args[0]);
        }

        int output = countUrinals(input);

        outputToFile(output);

    }

    protected static void outputToFile(int output) {
        System.out.println(output);
        File outFile = new File("rule.txt");
        int count = 0;
        while(outFile.exists()){
            count++;
            outFile = new File("rule" + count + ".txt");
        }
        FileWriter os = null;
        try {
            os = new FileWriter(outFile);
            os.write(output + "");
            os.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

    protected static int countUrinals(String input) {
        List<Integer> inUrinals = new ArrayList<>();
        int flag = 1;
        int count = 0;
        for (String c: input.split("")) {
            inUrinals.add(Integer.parseInt(c));
        }

        for (int i = 0; i < inUrinals.size() - 1; i++) {
            if (inUrinals.get(i) == 0){
                if (flag == 1 && inUrinals.get(i+1) == 0){
                    count++;
                    flag = 0;
                } else {
                    flag = 1;
                }
            } else {
                if(flag == 0){
                    return -1;
                }
                flag = 0;
            }
        }
        if (inUrinals.get(inUrinals.size() - 1) == 0 && flag == 1){
            count++;
        }

        return count;
    }

    protected static String inputFromFile(String arg) {
        File newFile = new File(arg);

        FileReader fr;
        String output = "";
        try {
            fr = new FileReader(newFile);
            BufferedReader br = new BufferedReader(fr);


            String line;
            while ((line = br.readLine()) != null){
                output = line;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        return output;
    }

}
