package breakcontinue;

public class BreakContinueTesting {

    public static void main(String[] args) {
        //labelledContinue();
        //normalContinue();
        //labelledBreak();
        //normalBreak();
        loops();
    }

    public static void labelledContinue() {
        /*output
    i== 1
	j == 1
	j == 2
    i== 2
	j == 1
	j == 2
    i== 3
	j == 1
	j == 2
         */

        outerloop:
        for (int i = 1; i <= 3; i++) {
            System.out.println("i== " + i);
            for (int j = 1; j <= 5; j++) {
                if (j == 3) {
                    continue outerloop;//similar to "labelled break" - continue with next iteration of i
                }
                System.out.println("\tj == " + j);
            }
        }
    }

    public static void normalContinue() {
        /*output
    i== 1
	j == 1
	j == 2
	j == 4
	j == 5
    i== 2
	j == 1
	j == 2
	j == 4
	j == 5
    i== 3
	j == 1
	j == 2
	j == 4
	j == 5
         */
        for (int i = 1; i <= 3; i++) {
            System.out.println("i== " + i);
            for (int j = 1; j <= 5; j++) {
                if (j == 3) {
                    continue;// bypass the s.o.p and continue with next iteration of j
                }
                System.out.println("\tj == " + j);
            }
        }
    }

    public static void labelledBreak() {
        /*output
    i== 1
	j == 1
	j == 2
         */

        outerloop:
        for (int i = 1; i <= 3; i++) {
            System.out.println("i== " + i);
            for (int j = 1; j <= 5; j++) {
                System.out.println("\tj == " + j);
                if (j == 2) {
                    break outerloop;
                }
            }
        }
    }

    public static void normalBreak() {
        /*output
    i== 1
	j== 1
	j== 2
    i== 2
	j== 1
	j== 2
    i== 3
	j== 1
	j== 2
         */

        for (int i = 1; i <= 3; i++) {
            System.out.println("i== " + i);
            for (int j = 1; j <= 5; j++) {
                if (j == 3) {
                    break;//exits the enclosing for loop
                }
                System.out.println("\tj== " + j);
            }
        }
    }

    public static void loops() {
        /*output
    i== 1
	j== 1
	j== 2
	j== 3
	j== 4
	j== 5
    i== 2
	j== 1
	j== 2
	j== 3
	j== 4
	j== 5
    i== 3
	j== 1
	j== 2
	j== 3
	j== 4
	j== 5
         */

        for (int i = 1; i <= 3; i++) {
            System.out.println("i== " + i);
            for (int j = 1; j <= 5; j++) {
                System.out.println("\tj== " + j);
            }
        }
    }
}//end class
