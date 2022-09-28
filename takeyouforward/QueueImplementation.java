package takeyouforward;
class queue{
	int capacity=3;
	int front=0;
	int rear=-1;
	int queue[] = new int[capacity];
	public void push(int data) {
		if(front!=rear) {
			queue[front]=data;
			front++;
			front=front%capacity;
		}else{
			System.out.println("oh no queue is not kaali");
		}
		
		
	}
	
	public void pop() {
		
		if(front == (rear+1)%capacity){
			System.out.println("queue is empty");
		}else {
			System.out.println(queue[rear]);
			queue[rear]=0;
			rear=rear%capacity;
		}
	}public void show() {
		for(int i=0;i<capacity;i++) {
			System.out.print(queue[i]+" ");
		}System.out.println();
	}
	
}
public class QueueImplementation {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		queue q = new queue();
		q.push(10);
		q.show();
		q.push(11);
		q.show();
		q.push(12);
		q.show();
		q.push(13);
		q.show();
		q.push(14);
		q.show();
		q.push(15);
		q.show();
		q.pop();
		q.show();
		q.pop();
		q.show();
		q.pop();
		q.show();
		q.pop();
		q.show();
		q.pop();
	}

}
