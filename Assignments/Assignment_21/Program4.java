
import java.util.Scanner;

class Logic {

    void CountFactors(int iNo) {

        int iCnt = 0;
        int iFact = 0;

        if (iNo < 0) {
            iNo = -iNo;
        }

        for (iCnt = 1; iCnt < iNo; iCnt++) {
            if (iNo % iCnt == 0) {
                iFact++;
            }
        }

        System.out.println(iFact);

    }
}

class Program4 {

    public static void main(String A[]) {

        Scanner sobj = new Scanner(System.in);
        Logic lobj = new Logic();

        int iValue = 0;
        int iRet = 0;

        System.out.println("Enter  number : ");
        iValue = sobj.nextInt();

        lobj.CountFactors(iValue);

    }
}
