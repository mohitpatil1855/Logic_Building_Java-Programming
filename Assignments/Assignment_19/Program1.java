
import java.util.Scanner;

class Logic {

    boolean CheckLeapYear(int iYear) {
        if (iYear % 4 == 0) {
            return true;
        } else {
            return false;
        }
    }
}

class Program1 {

    public static void main(String A[]) {

        Scanner sobj = new Scanner(System.in);
        Logic lobj = new Logic();

        int iValue = 0;
        boolean bRet = false;

        System.out.println("Enter  Year : ");
        iValue = sobj.nextInt();

        bRet = lobj.CheckLeapYear(iValue);

        if (bRet == true) {
            System.out.println("Given year is Leap year");
        } else {
            System.out.println("Given year is not Leap year");
        }

    }

}
