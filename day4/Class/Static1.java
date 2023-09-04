package day4.Class;

public class Static1 {
    public static void main(String[] args) {
        System.out.println(Person.avgAge);
        //   System.out.println(Person.age); // 객체를 만들지 않았기 때문

        Person p1 = new Person();
        System.out.println(p1.age);
        Person.hi(); //안녕

    }
}

class Person {

    // 인류 평균 나이는 모든 사람이 동일하게 공유해야 하는 값.
    // 객체들이 공유해야 하는 자원에는 static을 붙인다.
    static int avgAge = 100; // 클래스 변수
    int age = 30; // 인스턴스 변수


    public static void hi() {
        System.out.printf("안녕") ;
    }

}