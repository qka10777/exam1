package day8.Map;
import java.util.ArrayList;
import java.util.HashMap;
public class HashMapExam_a {
    public static void main(String[] args) {

        // 사람 정보를 map으로 저장하고 출력하기
        // 사람 1 정보
        // 이름 : 홍길동
        // 나이 : 22
        // 키 : 170.5
        ArrayList<String> list = new ArrayList<>();
        list.add("홍길동");
        list.add("22");
        list.add("170,5");

        HashMap map = new HashMap();

        map.put("이름", "홍길동");
        map.put("나이", 22);
        map.put("키", 170.5);

        System.out.println(map.get("이름"));
        System.out.println(map.get("나이"));
        System.out.println(map.get("키"));
        System.out.println("============");

        // 사람 2 정보
        // 이름 : 홍길순
        // 나이 : 25
        // 키 : 162.4
        HashMap<String, String> myMap = new HashMap<>();

        myMap.put("이름", "홍길순");
        myMap.put("나이", "25");
        myMap.put("키", "162.4");

        System.out.println(myMap.get("이름"));
        System.out.println(myMap.get("나이"));
        System.out.println(myMap.get("키"));



    }
}

