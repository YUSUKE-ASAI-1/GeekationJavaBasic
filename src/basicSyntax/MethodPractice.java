package basicSyntax;

public class MethodPractice {

    public static void main(String[] args) {
        int a = 4;
        int b = 2;

        int add = add(a, b);
        int substract = subtract(a, b);
        int multiply = multiply(a, b);
        int divide = divide(a, b);

        printResult(add);
        printResult(substract);
        printResult(multiply);
        printResult(divide);
    }

    public static int add(int x, int y) {
        return x + y;
    }

    public static int subtract(int x, int y) {
        return x - y;
    }

    public static int multiply(int x, int y) {
        return x * y;
    }

    public static int divide(int x, int y) {
        return x / y;
    }

    public static void printResult(int result) {
        System.out.println("計算結果は" + result + "です。");
    }
}