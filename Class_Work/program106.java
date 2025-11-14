
import java.util.*;

//OOP Design
class ArrayX {

    private int Arr[];
    private int iSize;

    public ArrayX(int iNo) {
        iSize = iNo;
        Arr = new int[iSize];
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
}

class program106 {

    public static void main(String A[]) {

        ArrayX aobj1 = new ArrayX(5);
        System.out.println(aobj1.iSize);  //Error

        // Bad code                      // need of Access Specifier
        aobj1.iSize = 11;                //Error
        aobj1.Arr = null;                //Error

        ArrayX aobj2 = new ArrayX(7);
        System.out.println(aobj2.iSize); //Error

    }
}
