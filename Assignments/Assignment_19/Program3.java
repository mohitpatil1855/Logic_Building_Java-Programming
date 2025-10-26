
import java.util.Scanner;

class Logic {

    void CheckDivisibility(int iNo) {
        if (iNo % 5 == 0 && iNo % 11 == 0) {
            System.out.println("Divisible by 5 & 11 ");
        } else {
            System.out.println("Not Divisible by 5 & 11 ");
        }
    }
}

class Program3 {

    public static void main(String A[]) {

        Scanner sobj = new Scanner(System.in);
        Logic lobj = new Logic();

        int iValue = 0;

        System.out.println("Enter  Number  : ");
        iValue = sobj.nextInt();

        lobj.CheckDivisibility(iValue);

    }

}
