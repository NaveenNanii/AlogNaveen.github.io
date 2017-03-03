package StackAndQueue;

import java.util.NoSuchElementException;


public class MyStackImpl {
		    private int stacksize;
	    private int[] stackArr;
	    private int top;



	    public MyStackImpl(int size){
	        this.stacksize=size;
	        this.stackArr=new int[stacksize];
	        this.top=-1;
	    }


	    public void push(int entry) {
	        if (this.isStackFull()){
	            throw new NoSuchElementException("Stack is already full.cannot add element.");
	        }
	        System.out.println("Adding: "+entry);
	        this.stackArr[++top]=entry;
	    }

	    public int pop(){
	        if (this.isStackEmpty()){
	            throw new NoSuchElementException("Stack is empty.cannot remove element.");
	        }
	        int entry=this.stackArr[top--];
	        System.out.println("removed entry:"+entry);
	        return entry;
	    }


	    public int peek(){
	        return stackArr[top];
	    }

	    public boolean isStackEmpty(){
	        return (top==-1);
	    }

	    public boolean isStackFull(){
	        return (top==stacksize-1);
	    }

	    public static void main(String[] args) {
	        MyStackImpl s=new MyStackImpl(5);
	        try{
	            s.push(4);
	            s.push(8);
	            s.push(3);
	            s.push(89);
	            s.pop();
	            s.push(34);
	            s.push(45);
	            s.push(78);
	        }catch (Exception e){
	            System.out.println(e.getMessage());
	        }try {
	            s.pop();
	            s.pop();
	            s.pop();
	            s.pop();
	            s.pop();
	            s.pop();
	        }catch (Exception e){
	            System.out.println(e.getMessage());
	        }
	    }

	}


