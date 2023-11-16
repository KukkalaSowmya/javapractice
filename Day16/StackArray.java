//Stack: Create a class called Stack that implements the stack data structure. The class should have methods to push, pop, and peek elements, as well as to check if the stack is empty.

public class StackArray{
  int top;
  int capacity;
  int[] stack;
  StackArray()
  {
    top=-1;
    capacity = 10;
    stack = new int[capacity];
  }
  
  public int push(int data)
  {
    if(isFull()){
      System.out.println("Stack is full");
    }
    return stack[++top]=data;
  }
  public int pop()
  {
    if(isEmpty())
    {
      System.out.println("stack is empty");
    }
    return stack[top--];
  }
  public int peek()
  {
    return stack[top];
  }
  public boolean isEmpty()
  {
    return top == -1;
  }
  public boolean isFull()
  {
    return top==capacity-1;
  }

  public  static void main(String[] args){
     StackArray st = new  StackArray();
    st.push(34);
    st.push(45);
    st.push(76);
    st.push(41);
    st.push(58);
    st.push(36);
    System.out.println(st.capacity+ " capacity");
    System.out.println(st.isEmpty());
    System.out.println(st.isFull());
    System.out.println(st.peek()+ " is the peek element");
    System.out.println(st.pop()+ " is the pop element");
  }
}