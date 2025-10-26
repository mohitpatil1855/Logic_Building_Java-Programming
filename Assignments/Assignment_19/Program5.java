
import java.util.Scanner;

class Logic {

    void CalculatePower(int base, int exp) {
        int iCnt = 0;
        int iTemp = base;
        for (iCnt = 2; iCnt <= exp; iCnt++) {
            base = base * iTemp;
        }

        System.out.println("Calculated Power of a number is :" + base);
    }
}

class Program5 {

    public static void main(String A[]) {

        Scanner sobj = new Scanner(System.in);
        Logic lobj = new Logic();

        int iValue1 = 0, iValue2 = 0;

        System.out.println("Enter  Base  : ");
        iValue1 = sobj.nextInt();

        System.out.println("Enter  Exp  : ");
        iValue2 = sobj.nextInt();

        lobj.CalculatePower(iValue1, iValue2);

    }

}
