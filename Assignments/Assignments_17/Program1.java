
class Logic {

    int SumOfDigits(int iNo) {

        int iCnt = 0;
        int iDigit = 0;
        int iSum = 0;

        while (iNo != 0) {
            iDigit = iNo % 10;
            iSum += iDigit;
            iNo = iNo / 10;
        }
        return iSum;

    }

}

class Program1 {

    public static void main(String A[]) {
        Logic lobj = new Logic();

        int iRet = 0;

        iRet = lobj.SumOfDigits(1234);

        System.out.println("Sum of Digits is : " + iRet);
    }

}
