
public class StackWIthArray {
	int[] arr;
	//use a index to keep track of the top element of the stack
	int top = -1;
	public static void main(String[] args) {

	}
	
	public StackWIthArray() {
		arr = new int[10];
	}
    
    /** Push element x onto stack. */
    public void push(int x) {
        if(top == arr.length-1) {
        	resize();
        }
        arr[top+1] = x;
        top++;
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
    	int res = 0;
        if(top==-1) {
        	res = -1;
        }else {
        	 res = arr[top];
        	 top--;
        }
        return res;
    }
    
    /** Get the top element. */
    public int top() {
    	int res = 0;
        if(top == -1) {
        	res = -1;
        }else {
        	res = arr[top];
        }
        return res;
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
        return top == -1;
    }
	
	public void resize() {
		int[] temp = new int[arr.length*2];
		System.arraycopy(arr, 0, temp, 0, arr.length);
		arr = temp;
	}

}
