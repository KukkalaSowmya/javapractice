//Queue: Create a class called Queue that implements the queue data structure. The class should have methods to enqueue(adding elements), dequeue(removing elements), and peek elements, as well as to check if the queue is empty.

import java.util.Scanner;

class Queue{
  int SIZE = 10;
  int nodes[] = new int[SIZE];
  int front, rear;

  Queue(){
    front = -1;
    rear = -1;
  }
  boolean isFull(){
    if(front == 0 && rear == SIZE - 1){
      return true;
    }
    return false;
  }
  boolean isEmpty(){
    if(front == -1){
      return true;
    }
    return false;
  }
  void enqueue(int item){
    if(isFull()){
      System.out.println("Queue is full");
    }
    else{
      if(front == -1){
        front = 0;
      }
      rear++;
      nodes[rear] = item;
      System.out.print( + item);
    }
  }
  int dequeue(){
    int temp;
    if(isEmpty()){
      System.out.println("Queue is Empty");
      return -1;
    }
    else{
      temp = nodes[front];
      if(front >= rear){
        front = -1;
        rear = -1;
      }
      else{
        front++;
      }
    }
    System.out.println("Element Removed");
    return temp;
  }
}

public class QueueClass{
    public static void main(String args[]){
       Queue q = new Queue();
      q.dequeue();

     for(int i = 1; i < 9; ++i){
      q.enqueue(i);
     }
     q.enqueue(10);
     q.dequeue(3);
    }
}
