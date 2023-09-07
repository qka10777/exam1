//package day7.DataType;
//
//public class DataType_d {
//    public static void main(String[] args) {
//        저장소.저장(10);
//        저장소.저장("안녕");
//        저장소.저장(new 사람());
//        저장소.저장(new 사과());
//        저장소.저장(5.5);
//        저장소.저장(false);
//        저장소.저장('a');
//
//
//        // 실수 > 정수 no
//        // 정수 > 실수 ok
//        // 10 => 10.0, 121 => 121.0
//        // 10.3 => 10
//
//        // 정수 계열
//        byte b = 0; // 1바이트
//        char c = 1; // 2바이트
//        short s = 2; // 2바이트
//        int i = 3; // 4바이트
//        long l = 4; // 8바이트
//
//        // 실수 계열
//        // 4.1f => float 형 실수를 의미
//        float f = 3.14f; // 4바이트
//        // 3.141592 => double 형 실수를 의미
//        double d = 3.141592; // 8 바이트
//
//        // 논리 계열
//        boolean bl = false; // 1/8 바이트, 1비트
//
//        저장소.저장(b);
//        저장소.저장(s);
//        저장소.저장(c);
//        저장소.저장(i);
//        저장소.저장(l);
//        저장소.저장(f);
//        저장소.저장(d);
//        저장소.저장(bl);
//
//    }
//}
//
//class 저장소 {
//
//    // 숫자 관련 값은 double로 다 형변환해서 받을 수 있다.
//    static void 저장(double v) {
//        System.out.println("double 값 : " + v);
//    }
//
//    static void 저장(boolean v) {
//        System.out.println("boolean 값 : " + v);
//    }
//
//    static void 저장(String v) {
//        System.out.println("String 값 : " + v);
//    }
//
//    // 객체 관련 값은 Object로 다 형변환 해서 받을 수 있다.
//    static void 저장(Object a모든것) {
//        System.out.println("사람 값 : " + a모든것);
//    }
//}
//
//// 자바의 모든 객체는 Object를 상속받는다.
//class 사람 { // extends Object가 생략되어있다.
//}
//
//class 사과 { // extends Object가 생략되어있다.
//}
//
//// Object를 상속받지 않는다면 새로운 객체가 추가될 때마다
//// 해당 객체를 매개변수로 받는 저장 메서드를 일일이 새로 만들어야한다.
