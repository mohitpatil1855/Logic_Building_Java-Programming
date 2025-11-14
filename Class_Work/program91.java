
import java.util.*;

class digit {

    public int DisplaySumdigits(int iNo) {
        int icnt = 0;
        int iDigit = 0;
        int iSum = 0;

        icnt = 1;

        while (iNo != 0) {

            iDigit = iNo % 10;

            iSum += iDigit;
            iNo = iNo / 10;

        }

        return iSum;
    }
}

class program91 {

    public static void main(String A[]) {
        int iValue = 0;
        int iRet = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Number: ");

        iValue = sobj.nextInt();

        digit dobj = new digit();

        iRet = dobj.DisplaySumdigits(iValue);
        System.out.println(iRet);

        // Important
        sobj = null;

        System.gc();
    }
}
