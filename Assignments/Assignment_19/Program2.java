
import java.util.Scanner;

class Logic {

    void DisplayGrade(int iNo) {
        if (iNo >= 80 && iNo <= 100) {
            System.out.println("A Grade ");
        } else if (iNo >= 60 && iNo <= 80) {
            System.out.println("B Grade ");
        } else if (iNo >= 40 && iNo <= 60) {
            System.out.println("C Grade ");
        } else if (iNo < 40 && iNo >= 0) {
            System.out.println("Fail");
        } else {
            System.out.println("Invalid Input ");
        }
    }
}

class Program2 {

    public static void main(String A[]) {

        Scanner sobj = new Scanner(System.in);
        Logic lobj = new Logic();

        int iValue = 0;

        System.out.println("Enter  Marks  : ");
        iValue = sobj.nextInt();

        lobj.DisplayGrade(iValue);

    }

}
