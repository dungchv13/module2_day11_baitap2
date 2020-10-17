public class Solution {
    private int numNode = 0;
    public void enQueue(int data,Queue myQ){
        Node temp = new Node(data);
        if(myQ.front == null){
            myQ.front = myQ.rear = temp;
            myQ.front.link = myQ.rear;
            myQ.rear.link = myQ.front;
        }else{
            myQ.rear.link = temp;
            temp.link = myQ.front;
            myQ.rear = temp;
        }
        numNode++;
    }
    public Node deQueue(Queue myQ){
        if(myQ.front == null){
            return null;
        }else{
            Node temp = myQ.front;
            myQ.front = myQ.front.link;
            myQ.rear.link = myQ.front;
            numNode--;
            return temp;
        }
    }
    public void display(Queue myQ){
        Node temp = myQ.front;
        for (int i = 0; i < numNode; i++) {
            System.out.println(temp.getData());
            temp = temp.link;
        }
    }

}
