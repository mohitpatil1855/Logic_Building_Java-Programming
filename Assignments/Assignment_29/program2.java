/*

2       4       6       8       10
1       3       5       7       9
2       4       6       8       10
1       3       5       7       9

 */

import java.util.*;

class pattern {

    public void Display(int iRow, int iCol) {
        int i = 0;
        int j = 0;

        for (i = 1; i <= iRow; i++) {

            for (j = 1; j <= iCol; j++) {
                if (i % 2 == 0) {
                    System.out.print((j * 2) - 1 + "\t");
                } else {
                    System.out.print((j * 2) + "\t");
                }
            }
            System.out.println("");

        }

    }
}

class program2 {

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
