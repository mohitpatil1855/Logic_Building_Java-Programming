
import java.util.Scanner;

class ArrayX {

    public void Display(int Brr[]) {
        int iCnt = 0;

        for (iCnt = 0; iCnt < Brr.length; iCnt++) {
            System.out.println(Brr[iCnt]);
        }
    }
}

class program100 {

    public static void main(String A[]) {

        Scanner sobj = new Scanner(System.in);

        int isize = 0;

        System.out.println("Enter the size of Array : ");
        isize = sobj.nextInt();       //5

        int Arr[] = new int[isize];

        System.out.println("Enter the elements of Array: ");
        
        for (int icnt = 0; icnt < Arr.length; icnt++) {
            Arr[icnt] = sobj.nextInt();
        }

        ArrayX aobj = new ArrayX();
        aobj.Display(Arr);

        //Important
        aobj = null;
        Arr = null;
        sobj = null;

        System.gc();
    }
}
