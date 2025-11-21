//Input :   5
//Output :   5 * 4 * 3 * 2 * 1 *

import java.util.Scanner;

class Pattern {

    public void Display(int iNo) {
        int iCnt = 0;

        for (iCnt = 1; iCnt <= iNo; iCnt++) {
            System.out.print(iCnt + "\t");
            System.out.print("* \t");
        }
        System.out.println();

    }
}

class program3 {

    public static void main(String A[]) {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0;

        System.out.println("Enter the Frequency : ");
        iValue = sobj.nextInt();

        Pattern pobj = new Pattern();
        pobj.Display(iValue);

    }
}
