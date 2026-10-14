public class queue {
int [] queue = new int[5];
int front = -1;
int rear = -1;
void enqueue(int value){
    if(rear == 4){
        System.out.println("Queue is full");
    }
    else{
        if(front == -1){
            front = 0;
        }
        rear++;
        queue[rear] = value;
        System.out.println("Inserted");
    }
}
void dequeue(){
    if(front ==-1|| front>rear){
        System.out.println("Queue is empty");
    }
    else{
        System.out.println("dequed" + queue[front]);
        front++;
    }
}
void display(){
    if(front ==-1|| front>rear){
        System.out.println("Queue is empty");
    }
    else{
        for(int i =front; i<=rear;i++){
                System.out.println(queue[i]+" ");
        }
    }
}
public static void main(String[] args){
    queue q  = new queue();
    q.enqueue(10);
    q.enqueue(20);
    q.enqueue(30);
    q.display();
    q.dequeue();
    q.display();
}
}
