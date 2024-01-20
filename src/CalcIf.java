public class CalcIf {
    static void calc(double paramA, double paramB, char operation) {
        double result;
        if (operation == '+') {
            result = paramA + paramB;
        } else if (operation == '-') {
            result = paramA - paramB;
        } else if (operation == '/') {
            result = paramA / paramB;
        } else if (operation == '*') {
            result = paramA * paramB;
        } else {
            System.out.println("Incorrect operation");
            return;  // Return here to exit the method if the operation is incorrect
        }
        System.out.println("Result: " + result);
    }

    public static void main(String[] args) {
        calc(5, 4, '-');
        calc(6, 4, '+');
        calc(9, 10, '/');
        calc(5, 4, '*');
    }
}

