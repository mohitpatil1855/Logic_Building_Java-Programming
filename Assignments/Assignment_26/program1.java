//Input :   5
//Output :   A B C D E

import java.util.Scanner;

class Pattern {

    public void Display(int iNo) {
        int iCnt = 0;   
        char ch = 'A';

        for (iCnt = 1; iCnt <= iNo; iCnt++) {
            System.out.print(ch + "\t");
            ch++;
        }
        System.out.println();

    }
}

class program1 {

    public static void main(String A[]) {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0;

        System.out.println("Enter the Frequency : ");
        iValue = sobj.nextInt();

        Pattern pobj = new Pattern();
        pobj.Display(iValue);

    }
}
