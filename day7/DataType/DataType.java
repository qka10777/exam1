package day7.DataType;

public class DataType {

    public static void main(String[] args) {
        // 자료형
        // 원시타입, 객체타입

        // 숫자형
        // 정수 - byte, short, int, long
        // 실수 - float, double
        // 논리값(참 -1 , 거짓 - 0) - boolean
        // 문자 > 단일문자(a - 97) - char

        // 객체형
        // int[] > 배열
        // String > 문자열
        // class로 만드는 것


        // 형변환 > 안전한 경우 자동형변환
        //        > 위험한 경우 수동형변환
        //        > 관계 없는 것끼리는 형변환 X

        // 자바는 객체지향언어
        int num = 10; // 숫자타입은 객체지향의 혜택 X

        // 숫자타입 > 객체타입 (박싱)
        // 래퍼클래스

        // int의 래퍼클래스
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);

        new Integer(10);
        Integer iobj = Integer.valueOf(10);

        // 객체 > 숫자 = 언박싱
        int i = iobj.intValue();

        // 오토박싱, 오토언박싱

        i = iobj; // i는 int, iobj는 Integer > 오토 언박싱
        System.out.println(i);
        Integer iobj2 = 20; // 오토 박싱
        Integer num1 = 20;

        // 원시타입에 해당하는 자료형에는 모두 래퍼클래스가 존재.
        // int > Integer, char > Character
        // double > Double, float > Float, short > Short

        String str = "hihi"; // String도 객체 타입

    }
}
