
import java.util.Scanner;

class Logic {

    void PrintTable(int iNo) {
        int iCnt = 0;
        int iTable = 0;

        if (iNo < 0) {
            iNo = -iNo;
        }

        for (iCnt = 1; iCnt <= 10; iCnt++) {
            iTable = iCnt * iNo;
            System.out.println(iTable);

        }
    }
}

class Program5 {

    public static void main(String A[]) {

        Scanner sobj = new Scanner(System.in);

        Logic lobj = new Logic();

        int iValue1 = 0;

        System.out.println("Enter  number : ");
        iValue1 = sobj.nextInt();

        lobj.PrintTable(iValue1);

    }

}
