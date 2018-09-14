import java.util.ArrayList;
import java.util.Arrays;

public class FlattenList {
    private String inputString;
    private ArrayList<Character> outputList;

    public FlattenList(String inputString) {
        this.inputString = inputString;
        outputList = new ArrayList<>();
    }

    public void flattenInputString() {
        for (int i = 0; i < inputString.length(); ++i) {
            if (Arrays.asList('1', '2', '3', '4', '5', '6', '7', '8', '9').contains(inputString.charAt(i))) {
                outputList.add(inputString.charAt(i));
            }
        }
    }

    public ArrayList<Character> getOutputList() {
        return outputList;
    }
}