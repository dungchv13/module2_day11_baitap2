public class Test {
    public static void main(String[] args) {
        Queue myQ = new Queue();
        Solution test = new Solution();
        test.enQueue(0,myQ);
        test.enQueue(1,myQ);
        test.enQueue(2,myQ);
        test.enQueue(3,myQ);
        test.enQueue(4,myQ);
        test.enQueue(5,myQ);
        System.out.println("befor dequeue");
        test.display(myQ);
        System.out.println("after dequeue 2 times");
        test.deQueue(myQ);
        test.deQueue(myQ);
        test.display(myQ);
    }
}
