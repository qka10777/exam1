package Test;

public class A {
    public static void main(String[] args) {
        // 지역변수 => 하루살이 변수
        int k = 10; // main 함수 안에서만 산다.

        사람 a사람 = new 사람();
        a사람.나이 = 20;

        int dan = 8;  // main 함수 안에서만 산다.
        for ( int i = 1; i < 9; i++ ) {
            // i => for block 안에서만 산다.
            System.out.println(dan + " * " + i + " = " + dan * i);
        }

        System.out.println(a사람.나이);
        a사람.걷다();
    }
}

class 사람 {
    // 인스턴스 변수
    int 나이;



    void 걷다(int age) {



        System.out.println(나이 + "살인 홍길동씨가 걷습니다.");
    }
}

