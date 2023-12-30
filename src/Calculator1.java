import java.util.Scanner;

public class Calculator1 {

    /*public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("첫번째 정수를 입력하세요.");
        int num1 = scanner.nextInt();
        System.out.println("두번째 정수를 입력하세요");
        int num2 = scanner.nextInt();
        System.out.println("입력한 정수="+ num1 +","+ num2);

        System.out.println("연산자를 선택하세요.");
        System.out.println(1+",add, " + 2+ ",subtract, "+3+",multiply, "+4+",divide");
        int number = scanner.nextInt();

        while (true) {
            if (number == 1) {
                int a = add(num1, num2);
                System.out.println(a);
                break;
            } else if (number == 2) {
                int b = subtract(num1, num2);
                System.out.println(b);
                break;
            } else if (number == 3) {
                int c = multiply(num1, num2);
                System.out.println(c);
                break;
            } else if (number == 4) {
                int d = divide(num1, num2);
                System.out.println(d);
                break;
            }

        }
    }*/

    public static int add(int a, int b){
        int sum;
        sum = a + b;
        return sum;
    }

    public static int subtract(int a, int b){
        int sum;
        sum = a - b;
        return sum;
    }

    public  static int multiply(int a, int b){
        int sum;
        sum = a * b;
        return sum;
    }

    public static int divide(int a, int b){
        int sum;
        sum = a / b ;
        return sum;
    }
}
