
import java.util.Scanner;

class Logic {

    void ChkPrime(int iNo) {

        int iCnt = 0;
        int iDivisor = 0;

        if (iNo < 0) {
            iNo = -iNo;
        }

        for (iCnt = 2; iCnt < iNo; iCnt++) {
            if (iNo % iCnt == 0) {
                iDivisor++;
            }
        }

        if (iDivisor == 0) {
            System.out.println("Number is Prime ");
        } else {
            System.out.println("Number is Not Prime ");
        }
    }
}

class Program1 {

    public static void main(String A[]) {

        Scanner sobj = new Scanner(System.in);
        Logic lobj = new Logic();

        int iValue = 0;

        System.out.println("Enter  number : ");
        iValue = sobj.nextInt();

        lobj.ChkPrime(iValue);

    }

}
