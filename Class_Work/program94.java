
class ArrayX {

    public void Display(int Brr[]) {
        int icnt = 0;
        for (icnt = 0; icnt < Brr.length; icnt++) {
            System.out.println(Brr[icnt]);
        }
    }
}

class program94 {

    public static void main(String A[]) {
        int Arr[] = {10, 20, 30, 40};

        ArrayX aobj = new ArrayX();

        aobj.Display(Arr);
    }
}
