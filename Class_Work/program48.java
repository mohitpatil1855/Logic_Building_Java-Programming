
import java.util.Scanner;

class LargestNumber {

    int LargestAmong3(int iNo1, int iNo2, int iNo3) {
        if (iNo1 > iNo2) {
            if (iNo1 > iNo3) {
                return iNo1;
            } else {
                return iNo3;
            }
        } else (iNo2 > iNo3) {
            return iNo2;
        }
    }

}

class program48 {

    public static void main(String A[]) {
        Scanner sobj = new Scanner(System.in);

        int iNum1 = 0, iNum2 = 0, iNum3 = 0;

        int iRet = 0;

        System.out.println("Enter first Number: ");
        iNum1 = sobj.nextInt();

        System.out.println("Enter Second Number: ");
        iNum2 = sobj.nextInt();

        System.out.println("Enter Third Number: ");
        iNum3 = sobj.nextInt();

        LargestNumber lObj = new LargestNumber();

        iRet = lObj.LargestAmong3(iNum1, iNum2, iNum3);

        System.out.println("Largest among the three numbers is: " + iRet);

    }
}
