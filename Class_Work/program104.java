
import java.util.*;

//OOP Design
class ArrayX {

    public int Arr[];
    public int iSize;

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

class program104 {

    public static void main(String A[]) {

        ArrayX aobj1 = new ArrayX(5);
        ArrayX aobj2 = new ArrayX(7);

    }
}
