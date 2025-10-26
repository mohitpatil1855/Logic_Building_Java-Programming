
class Logic {

    void FindFactorial(int iNo) {

        int iFact = 1;
        int iCnt = 0;

        for (iCnt = 1; iCnt <= iNo; iCnt++) {
            iFact *= iCnt;
        }
        System.out.println("Factorial of given numbers is: " + iFact);

    }

}

class program3 {

    public static void main(String A[]) {
        Logic lobj = new Logic();

        lobj.FindFactorial(5);
    }

}
