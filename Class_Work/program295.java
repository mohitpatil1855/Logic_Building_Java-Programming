
import java.util.*;

class program295 {

    public static void main(String A[]) {
        int Arr[] = {45, 21, 90, 54, 78};

        //this is For_Each loop
        for (int no : Arr) {
            System.out.println(no);

        }

        int index = Arrays.binarySearch(Arr, 90);    //Inbuilt functoin for Binary search

        System.out.println("Element found at : " + index);
    }
}
