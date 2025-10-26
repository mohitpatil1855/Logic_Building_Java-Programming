
import java.util.Scanner;

class Logic {

    void ChkMaximum(int iNo1, int iNo2, int iNo3) {

        if (iNo1 > iNo2) {
            if (iNo1 > iNo3) {
                System.out.println("First number is Maximum:" + iNo1);
            } else {
                System.out.println("third number is Maximum:" + iNo3);
            }
        } else {
            if (iNo2 > iNo3) {
                System.out.println("Second number is Maximum:" + iNo2);
            } else {
                System.out.println("third number is Maximum:" + iNo3);
            }
        }
    }

}

class Program4 {

    public static void main(String A[]) {

        Scanner sobj = new Scanner(System.in);

        int iValue1 = 0, iValue2 = 0, iValue3 = 0;

        System.out.print("Enter first number : ");
        iValue1 = sobj.nextInt();

        System.out.print("Enter second number : ");
        iValue2 = sobj.nextInt();

        System.out.print("Enter third number : ");
        iValue3 = sobj.nextInt();

        Logic lobj = new Logic();

        lobj.ChkMaximum(iValue1, iValue2, iValue3);

    }

}
