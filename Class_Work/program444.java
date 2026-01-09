
class node {

    public int data;
    public node next;

    //Important constructor
    public node(int no) {
        this.data = no;
        this.next = null;
    }
}

class SinglyLL {

    public node first;
    public int iCount;

    SinglyLL() {
        System.out.println("Object of SinglyLL gets created..");
        this.first = null;
        this.iCount = 0;
    }

    public void InsertFirst(int no) {

        node newn = null;

        //Changed code
        newn = new node(no);

        newn.next = this.first;        //actual insertions
        this.first = newn;

        this.iCount++;
    }

    public void InsertLast(int no) {

        node newn = null;
        node temp = null;

        //Initialization
        newn = new node(no);

        if (this.first == null) {
            this.first = newn;
        } else {
            temp = this.first;

            while (temp.next != null) {
                temp = temp.next;
            }

            temp.next = newn;
            newn.next = null;

            iCount++;

        }

    }

    public void DeleteFirst() {

        if (this.first == null) {
            return;
        } else if (this.first.next == null) {
            this.first = null;

        } else {
            this.first = this.first.next;
        }
        System.gc();                      //call to garbage collector
        this.iCount--;
    }

    public void DeleteLast() {
    }

    public void DeleteAtLast(int pos) {
    }

    public void Display() {
        node temp = null;

        temp = this.first;

        while (temp != null) {
            System.out.print(" | " + temp.data + " |-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public int Count() {
        return this.iCount;
    }

}

class program444 {

    public static void main(String A[]) {

        SinglyLL obj = null;
        int iRet = 0;

        obj = new SinglyLL();

        obj.InsertFirst(51);
        obj.InsertFirst(21);
        obj.InsertFirst(11);

        obj.Display();

        iRet = obj.Count();
        System.out.println("Number of Nodes are: " + iRet);

        obj.InsertLast(101);
        obj.InsertLast(111);
        obj.InsertLast(121);

        obj.Display();

        iRet = obj.Count();
        System.out.println("Number of Nodes are: " + iRet);

        // Important for Memory Deallocation
        obj = null;
        System.gc(); //to call garbage collector

    }

}
