
import java.util.*;

//OOP Design
class ArrayX {

    private int Arr[];
    private int iSize;

    public ArrayX(int iNo) {
        iSize = iNo;
        Arr = new int[iSize];

        System.out.println("Inside Constructor");
    }

    public void Accept() {
        Scanner sobj = new Scanner(System.in);

        int iCnt = 0;

        System.out.println("Enter Elements of Array :");

        for (iCnt = 0; iCnt < Arr.length; iCnt++) {
            Arr[iCnt] = sobj.nextInt();
        }
    }

    public void Display() {
        System.out.println("Elements of the Array are :");

        int iCnt = 0;

        for (iCnt = 0; iCnt < Arr.length; iCnt++) {
            System.out.println(Arr[iCnt]);
        }

    }

    public float Average() {
        int iCnt = 0, iSum = 0;

        for (iCnt = 0; iCnt < Arr.length; iCnt++) {
            iSum += Arr[iCnt];
        }

        return iSum / iSize;
    }
}      //End of ArrayX class  

class program108 {

    public static void main(String A[]) {

        float fRet = 0.0f;

        ArrayX aobj1 = new ArrayX(5);
        aobj1.Accept();
        aobj1.Display();

        fRet = aobj1.Average();

        System.out.println("Average is :" + fRet);
    }
}
