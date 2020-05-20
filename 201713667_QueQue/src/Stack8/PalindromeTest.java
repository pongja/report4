package Stack8;



import java.util.Scanner;

import java.io.PrintStream;

import java.util.Scanner;



interface Stack{

	boolean isEmpty();

	boolean isFull();

	void push(char item);

	char pop();

}



public class PalindromeTest implements Stack{

	

	private int top;

	private int stackSize;

	private char itemArray[];

	

	public PalindromeTest(int stackSize){

		top = -1;

		this.stackSize = stackSize;

		itemArray = new char[this.stackSize];

	}



	public boolean isEmpty(){

		return (top == -1);

	}

	

	public boolean isFull(){

		return (top == this.stackSize-1);

	}

	

	public void push(char item){

		if(isFull()){

			System.out.println("²ËÃ¡½À´Ï´Ù.");

		}else{

			itemArray[++top] = item;

			System.out.println("Inserted Item : " + item);

		}

	}

	

	public char pop(){

		if(isEmpty()){

			System.out.println("ºñ¾ú½À´Ï´Ù.");

			return 0;

		}else{

			return itemArray[top--];

		}

	}

}