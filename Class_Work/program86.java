
import java.util.*;

class Number {

    public long CalculateFactorial(long iNo) {

        int i = 0;
        long lFact = 1;                             //important

        if (iNo < 0) {
            iNo = -iNo;
        }

        for (i = 1; i <= iNo; i++) {

            lFact *= i;

        }
        return lFact;
    }
}//End of Class Number 

class program86 {

    public static void main(String A[]) {
        long lValue = 0;
        long lRet = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Number: ");

        lValue = sobj.nextInt();

        Number nobj = new Number();

        lRet = nobj.CalculateFactorial(lValue);
        System.out.println("Factorial is : " + lRet);

        // Important
        sobj = null;
        nobj = null;

        System.gc();
    }
}
