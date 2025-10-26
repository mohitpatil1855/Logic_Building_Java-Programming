
import java.util.Scanner;

class Logic {

    void FindSmallestDigit(int iNo) {

        int iCnt = 0;
        int iDigit = 0;
        int iTemp = 9;

        if (iNo < 0) {
            iNo = -iNo;
        }

        for (iCnt = 1; iCnt <= iNo; iCnt++) {
            iDigit = iNo % 10;
            if (iTemp > iDigit) {
                iTemp = iDigit;
            }
            iNo = iNo / 10;
        }
        System.out.println("Smallest Digit is : " + iTemp);

    }
}

class Program5 {

    public static void main(String A[]) {

        Scanner sobj = new Scanner(System.in);
        Logic lobj = new Logic();

        int iValue = 0;
        int iRet = 0;

        System.out.println("Enter  number : ");
        iValue = sobj.nextInt();

        lobj.FindSmallestDigit(iValue);

    }

}
