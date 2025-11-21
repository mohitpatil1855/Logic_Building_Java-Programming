/*
A    B   C   D
a    b   c   d 
A    B   C   D
a    b   c   d 
 */

import java.util.*;

class pattern {

    public void Display(int iRow, int iCol) {
        int i = 0;
        int j = 0;
        char ch1 = 'a';
        char ch2 = 'A';

        for (i = 1; i <= iRow; i++) {
            ch1 = 'a';
            ch2 = 'A';

            for (j = 1; j <= iCol; j++) {
                if (i % 2 == 0) {
                    System.out.print(ch1 + "\t");
                    ch1++;
                } else {
                    System.out.print(ch2 + "\t");
                    ch2++;
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
