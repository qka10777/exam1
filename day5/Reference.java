//package day5;
//
//public class Reference {
//    public static class Person {
//        int age;
//        String name;
//
//        public void introduce() {
//            System.out.println("안녕");
//        }
//    }
//
//    public static class Reference {
//
//        public static void test(String param) {
//            System.out.println(param);
//        }
//        public static void main(String[] args) {
//            int num = 10;
//            String str = "hello";
//            double d = 3.14;
//
//
//
//            test(str);
//
//            System.out.println(num);
//        }
//    }
//
//    public static class Reference2 {
//        public static void main(String[] args) {
//
//            Person p1; // 무슨 의미? 사람이 한명 있다.(X)
//            // p1은 null이다.
//
//
//            p1 = new Person(); // 사람 한명 생성해서 사람 리모컨을 p1에 저장
//            Person p2 = new Person(); // 사람 한명 생성해서 사람 리모컨을 p2에 저장
//
//            p1.age = 20;
//            p1.name = "홍길동";
//
//            p2.age = 30;
//            p2.name = "이순신";
//
//            p1.introduce();
//            p2.introduce();
//
//
//            // num1, num2는 원본이고, p1, p2는 창조다(reference)
//            int num1 = 10;
//            int num2 = num1;
//
//            num2 = 20; // num2에 20 대입, 그런다고 num1이 20으로 바뀌진 않는다.
//
//            p1 = p2; // p1이 p2를 가리킨다.
//            p1.name = "임꺽정";
//
//            System.out.println(p1.name);
//            System.out.println(p2.name);
//
//
//        }
//    }
//
//    // 문제 : 일반변수에 값 할당과정 설명
//    public static class Reference_a {
//        public static void main(String[] args) {
//            // 설명
//            int x;
//
//            // 설명
//            x = 20;
//        }
//    }
//
//    // 문제 : 레퍼런스변수에 값 할당과정 설명
//    public static class Reference_b {
//        public static void main(String[] args) {
//            // 설명
//            // 메인 함수가 시작되면 a자동차라는 변수가 스택 영역에 만들어진다.
//            // a자동차 변수는 자동차 타입이기 때문에 자동차 리모컨만 들어올 수 있다.
//            // 현재는 아무것도 넣지 않았기 때문에 비어있다고 볼 수 있다.
//            자동차 a자동차;
//
//
//            // 설명
//            // new 자동차()를 하면 힙에 자동차 클래스를 본 딴 객체가 힙에 만들어진다.
//            // 그와 동시에 객체를 조종할 수 있는(연결되어 있는) 리모컨도 함께 만들어진다.
//            // 리모컨은 스택에 저장할 수 있고 a자동차 변수에 저장한다.
//            a자동차 = new 자동차();
//
//            // 설명
//            // a자동차에 있는 리모컨을 이용해서 연결된 자동차에 명령을 내린다.
//            // 연결된 객체(자동차)가 작동한다.
//            a자동차.달리다();
//
//            // 모든 객체들은 서로를 평생 볼 수 없다.
//            // 모든 객체들은 서로를 원격조종한다.
//        }
//
//        // 자동차 설계도!, 절대 자동차가 아니다.!!!
//        static class 자동차 {
//            // 이 메서드(함수)의 2가지 용도
//            // - ???
//            // - ???
//            void 달리다() {
//                System.out.println("자동차가 달립니다.");
//            }
//        }
//    }
//
//    // 과정설명
//    // ...
//    public static class Reference_c {
//        // 메인 함수
//        public static void main(String[] args) {
//            // 설명
//            자동차 a자동차;
//
//            // 설명
//            a자동차 = new 자동차();
//
//            // 설명
//            a자동차.달리다();
//        }
//
//        // class => 설계도, 틀(객체를 만들기 위한)
//        static class 자동차 {
//            // 달리다 함수/메서드
//            void 달리다() {
//                System.out.println("자동차가 달립니다.");
//            }
//        }
//    }
//}
