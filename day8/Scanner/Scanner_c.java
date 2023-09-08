package day8.Scanner;

import java.util.Scanner;

public class Scanner_c {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("나이을 입력해주세요:");
        int age = Integer.parseInt(scan.nextLine());

        scan.nextLine(); // 버퍼 비우기용

        System.out.println("이름을 입력해주세요:");
        String name = scan.nextLine();

        // 문자를 >> 숫자로 변환
        // 관련없는 타입끼리는 형변환 X
        // Integer 래퍼클래스 사용
       int num = Integer.parseInt("10"); // 문자로 된 숫자를 실제 숫자형으로 변환


        System.out.printf("안녕하세요 " + age + "세 " + name + "입니다." );

        // 이름을 입력해주세요 : 홍길동
        // 나이를 입력해주세요 : 29
        // 출력 : 안녕하세요 29세 홍길동입니다.

    }
}

