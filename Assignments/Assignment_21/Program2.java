
import java.util.Scanner;

class Logic {

    void CountEvenOddRange(int iNo) {

        int iCnt = 0;
        int iEven = 0;
        int iOdd = 0;

        if (iNo < 0) {
            iNo = -iNo;
        }

        for (iCnt = 1; iCnt <= iNo; iCnt++) {
            if (iCnt % 2 == 0) {
                iEven++;
            } else {
                iOdd++;
            }
        }
        System.out.println("Total Even numbers in Range " + iEven);
        System.out.println("Total Odd numbers in Range " + iOdd);
    }
}

class Program2 {

    public static void main(String A[]) {

        Scanner sobj = new Scanner(System.in);
        Logic lobj = new Logic();

        int iValue = 0;
        int iRet = 0;

        System.out.println("Enter  number : ");
        iValue = sobj.nextInt();

        lobj.CountEvenOddRange(iValue);

    }

}
