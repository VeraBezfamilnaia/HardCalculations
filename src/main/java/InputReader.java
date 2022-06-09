import java.util.Scanner;

public class InputReader {
    private static final String REQUIREMENT = "Введите целое число";
    private static Scanner scanner = new Scanner(System.in);

    public static int getUserInput() {
        System.out.println(REQUIREMENT);
        return scanner.nextInt();
    }
}
