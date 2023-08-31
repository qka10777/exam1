package day2;

public class LoopEx_c {
    public static void main(String[] args) {



        for(int i = 1; i < 4; i++) {
            for(int j = 0; j < i; j++) {
                System.out.printf("*");
            }
            System.out.println("");
        }

        for(int a = 1; a < 6; a++) {
            for (int b = 0; b < a; b++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for(int c = 1; c < 8; c++) {
            for (int d = 0; d < c; d++) {
                System.out.printf("*");
            }
            System.out.println();
        }


    /*
    높이 : [3]
        for(int i =1; i <= 1; i++)



    *
    **
    ***


    */

    /*

    높이 : [5]

    *
    **
    ***
    ****
    *****

    */

    /*

    높이 : [7]

    *
    **
    ***
    ****
    *****
    ******
    *******

    */
    }
}
