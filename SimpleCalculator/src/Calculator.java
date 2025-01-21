public class Calculator {
    public double calculate(String operation, double num1, double num2) {
        switch (operation) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            case "/":
                if (num2 != 0) {
                    return num1 / num2;
                } else {
                    System.out.println("Fel: Division med noll är inte tillåten.");
                    return 0;
                }
            default:
                System.out.println("Fel: Ogiltig operation.");
                return 0;
        }
    }
}
