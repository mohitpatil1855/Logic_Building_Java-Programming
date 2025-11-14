
import java.util.*;

class digit {

    public void Displaydigits(int iNo) {
        int icnt = 0;
        int iDigit = 0;

        icnt = 1;

        while (iNo != 0) {

            iDigit = iNo % 10;

            System.out.println(iDigit);
            iNo = iNo / 10;

        }
    }
}

class program90 {

    public static void main(String A[]) {
        int iValue = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Number: ");

        iValue = sobj.nextInt();

        digit dobj = new digit();

        dobj.Displaydigits(iValue);

        // Important
        sobj = null;

        System.gc();
    }
}
