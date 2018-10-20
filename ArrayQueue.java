

public class ArrayQueue implements Queue{
	Object[] arr;
	int head; 
	int tail;
	int size;

	public ArrayQueue(){
		arr = new Object[10];
		head = 0;
		tail = -1;
		size = 0;
	}

	public Object dequeue(){
		if (empty())
			throw new IllegalStateException("Queue is Empty.");
		Object temp = arr[head % arr.length];
		head++;
		size--;
		return temp;

	}

	public void enqueue(Object item){
		if(tail>=arr.length)
			grow();
		arr[++tail % arr.length]=item;
		size++;
		


	}

	public boolean empty(){
		return size==0;
	}

	public void grow(){
		Object[] newArr = new Object[arr.length * 2];
		for(int i=head; i<=tail; i++){
			newArr[i-head]=arr[i%arr.length];
		}

		arr=newArr;
		head=0;
		tail=size-1;
	}


}


