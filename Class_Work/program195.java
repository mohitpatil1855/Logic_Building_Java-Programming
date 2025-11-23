/*
    iRow = 4
    iCol = 4

    triangle pattern


*

*       *

*       *       *

*       *       *       *



 */

import java.util.Scanner;

class Pattern {

    public void Display(int iRow, int iCol) {

        int i = 0;
        int j = 0;

        //Filter for Row and Colomn check
        if (iRow != iCol) {
            System.out.println("Invalid Output..!");
            System.out.println("Row Number and Colomn Number should be same ");
            return;

        }

        for (i = 1; i <= iRow; i++) {

            for (j = 1; j <= i; j++) {     //Condition changed (j <= i)   //optimized time complexity by 40%

                System.out.print("*\t");

            }
            System.out.println("");
            System.out.println("");

        }

    }
}

class program195 {

    public static void main(String A[]) {
        Scanner sobj = new Scanner(System.in);

        int iValue1 = 0;
        int iValue2 = 0;

        System.out.println("Enter Number of Rows :");
        iValue1 = sobj.nextInt();

        System.out.println("Enter Number of Colomns :");
        iValue2 = sobj.nextInt();

        Pattern pobj = new Pattern();

        pobj.Display(iValue1, iValue2);
    }
}
