
import java.util.Scanner;

class ArrayX {

    public void Display(int Brr[]) {
        int iCnt = 0;

        for (iCnt = 0; iCnt < Brr.length; iCnt++) {
            System.out.println(Brr[iCnt]);
        }
    }
}

class program98 {

    public static void main(String A[]) {

        Scanner sobj = new Scanner(System.in);

        int isize = 0;

        System.out.println("Enter the size of Array : ");
        isize = sobj.nextInt();       //5

        int Arr[] = new int[isize];

        System.out.println("Enter the elements of Array: ");

        Arr[0] = sobj.nextInt();
        Arr[1] = sobj.nextInt();
        Arr[2] = sobj.nextInt();
        Arr[3] = sobj.nextInt();
        Arr[4] = sobj.nextInt();

        ArrayX aobj = new ArrayX();
        aobj.Display(Arr);

    }
}
