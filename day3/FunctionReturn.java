package day3;

public class FunctionReturn {
    public static double circleArea(int radius) {
        double result = radius * radius * 3.14;
        System.out.println(result);

        return result;

        //public static void circleArea(int radius) {
            //System.out.println(radius * radius * 3.14 / 2);

    }
    public static void main(String[] args) {

        // 1. 반지름으로 원의 넓이를 구하는 함수 만들기.
        // 반지름 * 반지름 * 3.14

        // 2. 반지름이 5인 원의 넓이를 구해서 출력
        double num = circleArea(5);
        System.out.println(num); // 1

        // 모든 값 > 자료형
        // 1 > int
        // 3.14 > double
        // "hello" > String
        // true > boolean

        // 함수에서 리턴할 때 값을 하나 가지고 올 수 있다. > 리턴 값

        // 3. 반지름이 5인 원의 넓이를 2로 나눈 값.
        System.out.println(num / 2);

        // 4. 반지름이 5인 원의 넓이를 2 곱한 값.
        System.out.println(num * 2);

        // 리턴 > 함수가 작업한 결과를 직접 받을 수 있음.
        // 함수의 결과를 2차 가공할 수 있음.
    }
}
