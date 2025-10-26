
import java.util.Scanner;

class Logic {

    void DisplayEven(int iNo) {

        int iCnt = 0;

        if (iNo < 0) {
            iNo = -iNo;
        }

        for (iCnt = 1; iCnt <= iNo; iCnt++) {
            if (iCnt % 2 == 0) {
                System.out.println(iCnt);
            }
        }

    }
}

class Program2 {

    public static void main(String A[]) {

        Scanner sobj = new Scanner(System.in);
        Logic lobj = new Logic();

        int iValue = 0;

        System.out.println("Enter  number : ");
        iValue = sobj.nextInt();

        lobj.DisplayEven(iValue);

    }

}
