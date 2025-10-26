
import java.util.Scanner;

class Logic {

    void SumOfEvenOddDigits(int iNo) {

        int iCnt = 0;
        int iDigit = 0;
        int iEvenSum = 0, iOddSum = 0;

        if (iNo < 0) {
            iNo = -iNo;
        }

        while (iNo != 0) {
            iDigit = iNo % 10;
            
            if (iDigit % 2 == 0) {
                iEvenSum += iDigit;
            } else {
                iOddSum += iDigit;
            }

            iNo = iNo / 10;
        }

        System.out.println("Sum of even number is : " + iEvenSum);
        System.out.println("Sum of odd number is : " + iOddSum);

    }
}

class Program4 {

    public static void main(String A[]) {

        Scanner sobj = new Scanner(System.in);
        Logic lobj = new Logic();

        int iValue = 0;

        System.out.print("Enter  number : ");
        iValue = sobj.nextInt();

        lobj.SumOfEvenOddDigits(iValue);

    }

}
