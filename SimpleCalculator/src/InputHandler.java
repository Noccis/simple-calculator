import java.util.Scanner;

public class InputHandler {
    private Scanner scanner = new Scanner(System.in);

    public String getOperation() {
        return scanner.nextLine();
    }

    public double getNumber() {
        while (!scanner.hasNextDouble()) {
            System.out.println("Fel: Ange ett giltigt tal.");
            scanner.next();
        }
        double number = scanner.nextDouble();
        String rinse = scanner.nextLine();
        return number;
    }
}
