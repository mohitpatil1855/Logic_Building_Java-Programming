
import java.util.Scanner;

class Logic {

    void CheckSign(int iNo) {
        if (iNo == 0) {
            System.out.println("Given Number is Zero ");
        } else if (iNo > 0) {
            System.out.println("Given Number is Positive ");
        } else {
            System.out.println("Given Number is Negative ");
        }
    }
}

class Program5 {

    public static void main(String A[]) {

        Scanner sobj = new Scanner(System.in);
        Logic lobj = new Logic();

        int iValue = 0;

        System.out.println("Enter  number : ");
        iValue = sobj.nextInt();

        lobj.CheckSign(iValue);

    }

}
