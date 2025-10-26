
class Logic {

    boolean ChkEvenOdd(int iNo) {

        if (iNo % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

}

class Program2 {

    public static void main(String A[]) {

        Logic lobj = new Logic();

        boolean bRet = false;

        bRet = lobj.ChkEvenOdd(7);

        if (bRet == true) {
            System.out.println("Number is Even ");
        } else {
            System.out.println("Number is Odd ");
        }
    }
}
