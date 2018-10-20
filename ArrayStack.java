

public class ArrayStack implements Stack{
	Object[] arr;
	int top;

	public ArrayStack(){
		arr = new Object[10];
		top = -1;
	}

	public void push(Object item){

		if(top==arr.length-1)
			grow();
		arr[++top]= item;

	}

	public Object pop(){
		if (empty()){
			throw new IllegalStateException("Stack is Empty.");
		}
		return arr[top--];


	}

	public Object peek(){
		if (empty()){
			throw new IllegalStateException("Stack is Empty.");
		}
		return arr[top];
	}

	public boolean empty(){
		return top==-1;

	}

	public void grow(){
		Object[] newArr = new Object[arr.length * 2];
		for(int i=0; i<arr.length; i++){
			newArr[i]=arr[i];
		}

		arr=newArr;
	}

}

