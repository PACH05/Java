package javaDSA;

public class Stack {
    public static void main(String[] args) {
      MyStack stk = new MyStack();
	  stk.push(1);
	  stk.push(0);
	  stk.push(3);
	  int x=stk.pop();
	  System.out.println("Poped elemnt = " + x);
	  stk.diplay();
    }
}

class MyStack
{
    int top;
	int arr[] = new int[1000];

    MyStack()
	{
		top = -1;
	}	
	//Function to push an integer into the stack.
    void push(int a)
	{
	   arr[top+1]=a;
	   top++;
	}
    //Function to remove an item from top of the stack.
	int pop()
	{
        if(top==-1){
			return -1;
		}
		else{
			--top;
		}
		return arr[top+1];
	}

	public void diplay()
	{
		System.out.println("Stack Elements :");
		for (int i =top;i>=0; i++) {
		 System.out.println(arr[i]);
		}
	}
}