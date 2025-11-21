/*
Input:row  : 4
      colomn  : 6

   * # * # * #
   * # * # * #
   * # * # * #
   * # * # * #

 */

import java.util.*;

class pattern {

    public void Display(int iRow, int iCol) {
        int i = 0;
        int j = 0;

        for (i = 1; i <= iRow; i++) {
            for (j = 1; j <= iCol; j++) {
                if (j % 2 != 0) {
                    System.out.print("* \t");
                } else {
                    System.out.print("# \t");
                }

            }
            System.out.println("");
        }
    }
}

class program4 {

    public static void main(String A[]) {
        Scanner sobj = new Scanner(System.in);

        int iValue1 = 0;
        int iValue2 = 0;

        System.out.println("Enter Number of Rows: ");
        iValue1 = sobj.nextInt();

        System.out.println("Enter Number of Colomns: ");
        iValue2 = sobj.nextInt();

        pattern pobj = new pattern();

        pobj.Display(iValue1, iValue2);

    }
}
