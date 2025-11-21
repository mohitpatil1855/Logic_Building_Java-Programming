/*
1   2   3   4   
5   6   7   8   
9   10  11  12  
13  14  15  16

 */

import java.util.*;

class pattern {

    public void Display(int iRow, int iCol) {
        int i = 0;
        int j = 0;

        int iNum = 0;

        for (iNum = 1, i = 1; i <= iRow; i++) {

            for (j = 1; j <= iCol; j++,iNum++) {
                System.out.print(iNum + "\t");

            }
            System.out.println("");
        }
    }
}

class program5 {

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
