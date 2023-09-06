package day6.overloading;

public class Overloading_a {
    public static void main(String[] args) {
        new 사람();
        // 출력 : 사람이 태어났습니다.

        new 사람(10);
        // 출력 : 태어나서부터 10살인 사람이 태어났습니다.

        new 사람(20);
        // 출력 : 태어나서부터 20살인 사람이 태어났습니다.
    }
}

class 사람 {
    int age;
    사람() {
        System.out.println("사람이 태어났습니다.");
    }

    사람(int age) {
        System.out.printf("태어나서 %d인 사람이 태어났습니다.\n", age);
    }
}

// 디폴트 생성자는 자바 자동으로 만들어준다.
// 단, 여러분이 직접 생성자를 하나라도 만들면 디폴트 생성자는 자동 생성되지 않는다.