
import java.util.Scanner;

class Logic {

    void CheckPerfect(int iNo) {

        int iCnt = 0;
        int iFac = 0;

        if (iNo < 0) {
            iNo = -iNo;
        }

        for (iCnt = 1; iCnt < iNo; iCnt++) {
            if (iNo % iCnt == 0) {
                iFac = iFac + iCnt;
            }
        }
        if (iNo == iFac) {
            System.out.println("Given number is Perfect number :" + iNo);
        } else {
            System.out.println("Given number is not Perfect number :" + iNo);
        }
    }
}

class Program3 {

    public static void main(String A[]) {

        Scanner sobj = new Scanner(System.in);
        Logic lobj = new Logic();

        int iValue = 0;
        int iRet = 0;

        System.out.println("Enter  number : ");
        iValue = sobj.nextInt();

        lobj.CheckPerfect(iValue);

    }

}
