
class Logic {

    int CountDigit(int iNo) {

        int iCnt = 0;
        int iDigit = 0;
        int iCount = 0;

        while (iNo != 0) {
            iDigit = iNo % 10;
            iCount++;
            iNo = iNo / 10;
        }
        return iCount;

    }

}

class program5 {

    public static void main(String A[]) {
        Logic lobj = new Logic();

        int iRet = 0;

        iRet = lobj.CountDigit(7865);

        System.out.println("Total Digits are : " + iRet);
    }

}
