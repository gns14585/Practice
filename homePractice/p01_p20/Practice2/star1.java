package homePractice.p01_p20.Practice2;

public class star1 {
    public static void main(String[] args) {
        /*
        *
        **
        ***
        ****
        *****
         */

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
        System.out.println();
        }

        System.out.println("- - - - - - - - -");

        /*
        *****
        ****
        ***
        **
        *
        */

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5 - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("- - - - - - - - - -");

        /*
             *
            ***
           *****
          *******
         *********
         */

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4-i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2*i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("- - - - - - - - - -");

        /*
            *
           ***
          *****
         *******
        *********
         *******
          *****
           ***
            *
         */

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4-i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 7 - i * 2; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("- - - - - - - - -");

        /*
        **** ****
        ***   ***
        **     **
        *       *
        **     **
        ***   ***
        **** ****
         */

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4 - i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 4 - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 1; i <= 3; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < 7-i*2; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
