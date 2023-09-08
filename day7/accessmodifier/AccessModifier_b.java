package day7.accessmodifier;
// 문제 : 사람의 id를 출력해주세요.
// 조건 : 사람의 id를 20으로 설정해주세요.
// 조건 : 사람 클래스의 id 필드의 private 속성은 수정할 수 없습니다.
// 조건 : 사람 클래스에서 출력할 수 없습니다.
public class AccessModifier_b {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setId(20); // id 값을 20으로 설정

        int id = p1.getId(); // id 값을 가져옴

        System.out.println("제 번호는 " + id + " 입니다.");
    }
}

class Person {
    private int id;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }
}
