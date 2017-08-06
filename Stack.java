/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;
//import static stack.B.x;

/**
 *
 * @author Ashish
 */
public class Stack{
    private static class StackNode{
        private int data;
        private StackNode next;
        public StackNode(int data){
            this.data = data;
        }
        
    }
    
    private StackNode top;
    
    public int pop(){
        if(top == null)
            return -1;
        int item = top.data;
        top = top.next;
        showStack();
        return item;
    }
    
    public void push(int ele){
        StackNode item = new StackNode(ele);
        item.next = top;
        top = item;
        showStack();
    }
    
    public int peek(){
        if(top == null)
            return -1;
        return top.data;
    }
    
    public boolean isEmpty(){
        return top == null;
    }
    
    public void showStack(){
        if(top == null){
            System.out.println("Stack is empty!");
            return;
        }
        StackNode n = top;
        while(n != null){
            System.out.print(n.data+"->");
            n = n.next;
        }
        System.out.println();
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Stack s = new Stack();
        System.out.println(s.peek());
        s.push(2);
        //s.showStack();
        s.push(3);
        //s.showStack();
        System.out.println(s.isEmpty());
        System.out.println(s.pop());
        System.out.println(s.peek());
    }
    
    
}
