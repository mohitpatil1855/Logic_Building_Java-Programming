
class Logic {

    void CalculateSum(int iNo) {

        int iSum = 0;
        int iCnt = 0;

        for (iCnt = 1; iCnt <= iNo; iCnt++) {
            iSum += iCnt;
        }
        System.out.println("Summation of all natural numbers is: " + iSum);

    }

}

class Program1 {

    public static void main(String A[]) {
        Logic lobj = new Logic();

        lobj.CalculateSum(10);
    }

}
