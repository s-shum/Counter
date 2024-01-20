public class CalcSwitch {
    static void calc(double paramA, double paramB, char operation) {
        double result = 0;
        switch (operation) {
            case '+':
                result = paramA + paramB;
                break;
            case '-':
                result = paramA - paramB;
                break;
            case '/':
                result = paramA / paramB;
                break;
            case '*':
                result = paramA * paramB;
                break;
            default:
                System.out.println("Incorrect operation");
                return;  // Return here to exit the method if the operation is incorrect
        }
        System.out.println("Result: " + result);
    }

    public static void main(String[] args) {
        // Example usage:
        calc(5, 4, '+');
    }
}
