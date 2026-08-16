class circularDemo{
    int[] q = new int[5];
    int front= -1, rear = -1;
    void enqueue(int x){
        if((rear + 1)%5 == front){
            System.out.println("Queue is Full");
            return;
        }
        if(front == -1){
            front = 0;}
            rear = (rear+1)%5;
            q[rear]= x;
    }
    void dequeue(){
        if(front == -1){
            System.out.println("Queue is empty");
            return;
        }
        System.out.println("Deleted: "+ q[front]);
        if(front == rear){
            front = rear = -1;
        }
        else{
            front = (front +1)%5;
        }
    }
    void display(){
        if(front == -1){
            System.out.println("Queue is empty");
            return;
        }
        int i = front;
        while(true){
            System.out.println(q[i]+" ");
            if( i == rear){
                break;
            }
            i = (i+1)%5;
        }

    }
}
public class Circular_queue {
    public static void main(String[] args){
        circularDemo c = new circularDemo();
        c.enqueue(10);
        c.enqueue(20);
        c.enqueue(30);
        c.enqueue(40);
        c.dequeue();
        c.enqueue(50);
        c.display();
    }
}
