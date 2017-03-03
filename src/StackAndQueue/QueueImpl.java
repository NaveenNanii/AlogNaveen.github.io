package StackAndQueue;


	public class QueueImpl {
	    private int capacity;
	    int queueArr[];
	    int front=0;
	    int rear=-1;
	    int currentsize=0;


	    public QueueImpl(int queuesize){
	        this.capacity=queuesize;
	        queueArr=new int[this.capacity];
	    }

	    public void enqueue(int item){
	        if (isQueueFull()){
	            System.out.println("overflow!unable to add:"+item);
	        }else {
	                rear++;
	                if (rear==capacity-1){
	                    rear=0;
	                }
	            queueArr[rear]=item;
	            currentsize++;
	            System.out.println("element "+item+"is pushed to queue");
	        }
	    }


	    public void deQueue(){
	        if (isQueueEmpty()){
	            System.out.println("underflow!unable to remove from queue");
	        }else {
	            front++;
	            if (front==capacity-1){
	                System.out.println("pop operation done!removed:"+queueArr[front-1]);
	                front=0;
	            }else {
	                System.out.println("pop operation done!removed:"+queueArr[front-1]);
	            }
	            currentsize--;
	        }
	    }

	    public boolean isQueueFull(){
	        boolean status=false;
	        if (currentsize==capacity){
	            status=true;
	        }
	        return status;
	    }

	    public boolean isQueueEmpty(){
	        boolean status=false;
	        if (currentsize==0){
	            status=true;
	        }
	        return status;
	    }

	    public static void main(String[] args) {
	        QueueImpl q=new QueueImpl(4);
	        q.enqueue(33);
	        q.enqueue(55);
	        q.deQueue();
	        q.enqueue(66);

	    }
	}


