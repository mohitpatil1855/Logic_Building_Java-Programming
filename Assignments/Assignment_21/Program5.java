
import java.util.Scanner;

class Logic {

    void DivisibleBy2And3(int iNo) {
        if (iNo % 2 == 0 && iNo % 3 == 0) {
            System.out.println("Divisible by 2 & 3 ");
        } else {
            System.out.println("Not Divisible by 2 & 3 ");
        }
    }
}

class Program5 {

    public static void main(String A[]) {

        Scanner sobj = new Scanner(System.in);
        Logic lobj = new Logic();

        int iValue = 0;

        System.out.println("Enter  Number  : ");
        iValue = sobj.nextInt();
        lobj.DivisibleBy2And3(iValue);

    }

}
