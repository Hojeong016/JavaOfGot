public class Calculator { // Calculator 클래스
//'상태'
//메소드
//public static void main(String[] args) {
//    int a = subtract(2,1);
//    int b = multiply(2,1);
//    int c = divide(30,5);
//
//    System.out.println(a+b+c);
//
//}
    public static int subtract(int num1, int num2){
       int sum;
       sum= num1 - num2;
       return sum;
    }

    public static int multiply(int num1, int num2){
        int product;
        product = num1 * num2;
        return product;
    }

    public static int divide(int num1, int num2){
        int div;
        div = num1 / num2;
        return div;

    }

    //static  이란 뭐지
    //왜 static을 추가하니까 main 메소드에 다른 메소드들이 실행이 되었을까?
}
