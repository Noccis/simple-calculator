import java.util.Scanner;

public class InputHandler {
    private Scanner scanner = new Scanner(System.in);

    public String getOperation() {
        // This is for creating a conflict
        return scanner.nextLine();

    }

    public double getNumber() {
        while (!scanner.hasNextDouble()) {
            System.out.println("Fel input. Du behöver ange siffror.");
            scanner.next();
        }
        double number = scanner.nextDouble();
        String rinse = scanner.nextLine();
        return number;
    }
}
