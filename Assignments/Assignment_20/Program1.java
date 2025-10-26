
import java.util.Scanner;

class Logic {

    int EvenSum(int iNo) {

        int iCnt = 0;
        int iSum = 0;

        if (iNo < 0) {
            iNo = -iNo;
        }

        for (iCnt = 1; iCnt <= iNo; iCnt++) {
            if (iCnt % 2 == 0) {
                iSum += iCnt;
            }
        }
        return iSum;
    }
}

class Program1 {

    public static void main(String A[]) {

        Scanner sobj = new Scanner(System.in);
        Logic lobj = new Logic();

        int iValue = 0;
        int iRet = 0;

        System.out.println("Enter  number : ");
        iValue = sobj.nextInt();

        iRet = lobj.EvenSum(iValue);

        System.out.println("Sum of even number is : " + iRet);

    }

}
