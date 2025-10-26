
class Logic {

    void ChkPallindrome(int iNo) {

        int iDigit = 0;
        int iRev = 0;
        int iComp = iNo;

        while (iNo != 0) {
            iDigit = iNo % 10;
            iRev = (iRev * 10) + iDigit;
            iNo = iNo / 10;
        }

        if (iRev == iComp) {
            System.out.println("Given number is pallindrome ");
        } else {
            System.out.println("Given number is not pallindrome ");
        }
    }

}

class Program2 {

    public static void main(String A[]) {
        Logic lobj = new Logic();


        lobj.ChkPallindrome(121);

    }

}
