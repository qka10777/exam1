package day3;

public class Function {

    // 함수 정의
    // void - 리턴타입
    // test - 함수명
    // () - 매개변수
    public static void test() { // 시작
        System.out.println("코드1");
        System.out.println("코드2");
        System.out.println("코드3");
        System.out.println("코드4");
    }
    // 함수가 끝나면 호출한 부분으로 리턴한다.

    public static void puls(int num1, int num2, int num3) { // 매개변수

        int result = num1 + num2 + num3;

        System.out.println(result);
    }


    public static void main(String[] args) {
        System.out.println("main 함수 시작");
        // 함수
        // 코드 저장소
        // 입력 > <처리> > 출력

        // 변수

       // int a; // 선언
       // a = 2; // 할당(대입)

       // System.out.println(a);
       // System.out.println(a);
       // System.out.println(a);

        // 함수
        // 1. 함수는 코드 저장소
        // 2. 함수 규칙
        // -규칙1- 함수는 클래스 안에서 정의 해야 한다. (함수 안에 함수 정의 X)
        // -규칙2- 리턴타입, 함수명, 매개변수를 지정해야한다.
        // -규칙3- 같은 이름의 함수를 2개 만들지 않는다.
        // -규칙4- 함수는 호출(사용) 해야만 실행된다.
        // -규칙5- 함수의 개수는 제한이 없다.

        // 정의된 함수를 호출(사용)
        // 1. 함수의 가장 큰 사용 목적 > 코드의 재사용
       // test();
       // System.out.println("another code1");
       // test();
       // System.out.println("another code2");
       // test();
       // System.out.println("another code3");

        // 함수의 확장 > 매개변수
        puls(10, 20, 30); // 30

        puls(100, 200, 300); // 300


        System.out.println("main 함수 끝");


    } // 끝

}
