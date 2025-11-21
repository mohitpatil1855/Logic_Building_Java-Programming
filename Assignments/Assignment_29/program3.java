/*

a       b       c       d       e
1       2       3       4       5
a       b       c       d       e
1       2       3       4       5
a       b       c       d       e

 */

import java.util.*;

class pattern {

    public void Display(int iRow, int iCol) {
        int i = 0;
        int j = 0;

        char ch = 'a';

        for (i = 1; i <= iRow; i++) {
            ch = 'a';                //Reset

            for (j = 1; j <= iCol; j++) {
                if (i % 2 == 0) {
                    System.out.print(j + "\t");
                } else {
                    System.out.print(ch + "\t");
                    ch++;
                }
            }
            System.out.println("");

        }

    }
}

class program3 {

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
