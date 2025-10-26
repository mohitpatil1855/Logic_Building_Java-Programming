
import java.util.Scanner;

class Logic {

    void ChkMaximum(int iNo1, int iNo2) {

        if (iNo1 > iNo2) {
            System.out.println("First number is Maximum:" + iNo1);
        } else {
            System.out.println("Second number is Maximum:" + iNo2);
        }
    }

}

class Program3 {

    public static void main(String A[]) {

        Scanner sobj = new Scanner(System.in);

        int iValue1 = 0, iValue2 = 0;

        System.out.println("Enter first number : ");
        iValue1 = sobj.nextInt();

        System.out.println("Enter second number : ");
        iValue2 = sobj.nextInt();

        Logic lobj = new Logic();

        lobj.ChkMaximum(iValue1, iValue2);

    }

}
