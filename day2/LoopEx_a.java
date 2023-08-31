package day2;
// 문제 : 구구단 작성
// 조건 : 짝수번째만 곱하기
/* 출력예시 :

  2 * 2 = 4
  2 * 4 = 8
  2 * 6 = 12
  2 * 8 = 16

  ...

  9단까지 이런식으로 나오면 됩니다.

*/
public class LoopEx_a {
    public static void main(String[] args) {
        System.out.println("===2단===");
        for(int i = 2; i <= 9; i += 2) {
            System.out.println("2 * " + i + "= " + 2 * i);
        }

        System.out.println("===3단===");
        for(int i = 2; i <= 9; i += 2 ) {
            System.out.println("3 * " + i+ "= "+ 3 * i);
        }

        System.out.println("===4단===");
        for(int i = 2; i <= 9; i += 2) {
            System.out.println("4 * " + i + "= " + 4 * i);
        }

        System.out.println("===5단===");
        for(int i = 2; i <= 9; i += 2) {
            System.out.println("5 * " + i+ "= "+ 5 * i);
        }

        System.out.println("===6단===");
        for(int i = 2; i <= 9; i += 2) {
            System.out.println("6 * " + i+ "= "+ 6 * i);
        }

        System.out.println("===7단===");
        for(int i = 2; i <= 9; i += 2) {
            System.out.println("7 * " + i + "= " + 7 * i);
        }

        System.out.println("===8단===");
        for(int i = 2; i <= 9; i += 2) {
            System.out.println("8 * " + i+ "= "+ 8 * i);
        }

        System.out.println("===9단===");
        for(int i = 2; i <= 9; i += 2) {
            System.out.println("9 * " + i+ "= "+ 9 * i);
        }

    }
}