//package day6.constructorExam;
//
//public class Exam1 {
//    public static void main(String[] args) {
//        // 1. 그냥 초기화
//        Person p1 = new Person(20,"홍길동");
//        p1.age = 20;
//        p1.name = "홍길동";
//        p1.introduce();
//
//        // 20살 홍길동입니다.
//
//
//        // 2. init 함수를 이용해 초기화
//        Person p2 = new Person();
//        //p2.init(30,"이순신");
//        p2.introduce();
//
//        // 30살 이순신입니다.
//
//        // 3. 생성자를 이용해서 초기화
//        Person p3 = new Person(40, "유관순");
//        p3.introduce();
//
//
//        // 40살 유관순입니다.
//    }
//}
//
//class Person {
//    int age;
//    String name;
//
//    public void init (int param1, String param2) {
//        age = param1;
//        name = param2;
//    }
//
//    public Person (int age, String name) {
//        this.age = age;
//        this.name = name;
//    }
//
//    void introduce() {
//        System.out.println(age + "살 " + name + "입니다.");
//    }
//}