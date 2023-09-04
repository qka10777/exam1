package day4;
// 문제 : 자동차가 3번 달리게 해주세요.
// 출력 : 자동차가 달립니다.
public class Clazz_a {


    public static void main(String[] args) {
        //v1. 1개의 자동차가 3번 달리게 해주세요.
        Car2 s1 = new Car2();
        s1.drive();


        //v2. 3개의 자동차가 1번씩 달리게 해주세요.
        Car3 s2 = new Car3();
        s2.drive2();
        Car3 s3 = new Car3();
        s3.drive2();
        Car3 s4 = new Car3();
        s4.drive2();


        //자동차가 달립니다.
        //자동차가 달립니다.
        //자동차가 달립니다.
        //자동차가 달립니다.
        //자동차가 달립니다.
        //자동차가 달립니다.
    }
}
class Car2 {
    public void drive() {
        for(int i = 0; i < 3; i++)
        System.out.printf("자동차가 달립니다\n");
    }
}

class Car3{
    public void drive2() {
        System.out.printf("자동차가 달립니다\n");
    }
}
