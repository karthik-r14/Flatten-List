import java.util.Scanner;

public class FlattenListDemo {
    public static void main(String args[]) {
        String inputString;
        Scanner scanner = new Scanner(System.in);

        inputString = scanner.nextLine();

        FlattenList flattenList = new FlattenList(inputString);
        flattenList.flattenInputString();

        System.out.println(flattenList.getOutputList());
    }
}