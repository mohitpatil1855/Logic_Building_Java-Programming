
import java.util.*;

class program294 {

    public static void main(String A[]) {
        int Arr[] = {45, 21, 90, 54, 78};

        //this is For_Each loop
        for (int no : Arr) {
            System.out.println(no);

        }

        Arrays.sort(Arr);   //inbuilt function to sort array

        System.out.println("Arra after sorting: ");

        for (int no : Arr) {
            System.out.println(no);

        }
    }
}
