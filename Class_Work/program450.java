//HW Doubly linear

class node {

    public int data;
    public node next;
    public node prev;

    public node(int no) {
        this.data = no;
        this.next = null;
        this.prev = null;

    }

}

class DoublyLL {

    private node first;
    private int iCount;

    DoublyLL() {
        System.out.println("Object of DoublyLL gets created..");
        this.first = null;
        this.iCount = 0;
    }

    public void InsertFirst(int no) {
    }

    public void InsertLast(int no) {
    }

    public void InsertAtPos(int no, int pos) {
    }

    public void DeleteFirst() {
    }

    public void DeleteLast() {
    }

    public void DeleteAtLast(int pos) {
    }

    public void Display() {
    }

    public int Count() {
        return this.iCount;
    }

}

class program450 {

    public static void main(String A[]) {

        DoublyLL obj = null;
        int iRet = 0;

        obj = new DoublyLL();

        obj.InsertFirst(51);
        obj.InsertFirst(21);
        obj.InsertFirst(11);

        obj.Display();

        iRet = obj.Count();
        System.out.println("Number of Nodes are: " + iRet);

    }

}
