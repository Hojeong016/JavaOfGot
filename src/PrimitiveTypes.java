public class PrimitiveTypes {
    //    public static void main(String[] args) {
//        checkChar();
//    }
    public static void main(String[] args) {
        char charMin = 'A'+ 32;
        char charMax = '\u0000';
        System.out.println("charMin=[" + charMin + "]");
        System.out.println("charMax={" + charMax + "}");

        int intValue = 999;
        System.out.println(intValue);

    }
}


// u (프로그래밍 언어): 주로 프로그래밍 언어에서 문자 상수를 표현할 때 사용되는 이스케이프 시퀀스입니다.
// Java에서 주로 사용되며, 문자 상수에 해당하는 유니코드 코드 포인트를 나타냅니다.
//예를 들어, Java에서 u0041은 'A'에 해당하는 유니코드 코드 포인트를 나타냅니다.
//U+ (유니코드 표준): 주로 유니코드 표준에서 코드 포인트를 나타내기 위한 표기법입니다.
// 유니코드 표준 문서에서는 코드 포인트를 U+ 다음에 오는 4자리 또는 5자리 16진수로 나타냅니다.
//예를 들어, U+0041은 'A'에 해당하는 유니코드 코드 포인트를 나타냅니다.
//따라서, 같은 코드 포인트를 나타내지만 사용되는 문맥에 따라 표기법이 다르게 선택됩니다. u는 주로 프로그래밍 언어에서 문자 상수를 나타내는 데 사용되고,
// U+는 유니코드 표준에서 코드 포인트를 나타내기 위한 표기법으로 사용됩니다.