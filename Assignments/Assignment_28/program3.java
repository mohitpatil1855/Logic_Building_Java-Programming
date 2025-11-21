/*
A   A   A   A
B   B   B   B
C   C   C   C
D   D   D   D
 */

import java.util.*;

class pattern {

    public void Display(int iRow, int iCol) {
        int i = 0;
        int j = 0;
        char ch = 'A';

        for (i = 1; i <= iRow; i++) {
        
            
            for (j = 1; j <= iCol; j++){
                System.out.print(ch + "\t");
               
            }
             ch++;
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
