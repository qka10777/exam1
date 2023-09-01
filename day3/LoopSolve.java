package day3;
// 구구단은 n단 ~ m단 중 홀수단만 1 ~ limit 까지 곱 중 짝수곱만 출력해주세요.

class LoopSolve {
    public static void main(String[] args) {

        for (int i = 1; i < 5; i++) {
            System.out.println("2 X " + i + " = " + 2 * i);
        }

        for (int j = 1; j < 10; j++) {
            if (j % 2 != 0) {
                for (int i = 1; i < 10; i++) {
                    if (i % 2 == 0) {
                        System.out.println(j + " X " + i + " = " + j * i);
                    }
                }
            }
        }


    /*  입출력 예시
    n은 4, m은 20, limit는 10


    5 * 2 = 10
    5 * 4 = 20
    5 * 6 = 30
    5 * 8 = 40
    5 * 10 = 50

    7 * 2 = 14
    7 * 4 = 28
    7 * 6 = 42
    7 * 8 = 56
    7 * 10 = 70
    ...
    ...
    19 * 2 = 38
    19 * 4 = 76
    19 * 6 = 114
    19 * 8 = 152
    19 * 10 = 190


    */
            int n = 4;
            int m = 20;
            int limit = 10;

            for (int j = n; j <= m; j++) {
                if (j % 2 != 0) {
                    for (int i = 1; i < limit; i++) {
                        if (i % 2 == 0) {
                            System.out.println(j + " X " + i + " = " + j * i);
                        }
                    }
                }
            }

    }
}



