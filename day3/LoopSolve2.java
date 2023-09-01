package day3;

public class LoopSolve2 {

    public static void main(String[] args) {


        int y = 7;
        int lineNum = 1;

        for (int j = 1; j < y * 2; j += 2) {

            // 공백 그리기
            for (int i = 0; i < y - lineNum; i++) {
                System.out.print(" ");
            }

            // 별 그리기
            for (int i = 0; i < j; i++) {
                System.out.print("*");
            }
            System.out.println(); // 줄바꿈
            lineNum++;
        }
    }
}