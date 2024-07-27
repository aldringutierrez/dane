package damas;

import java.util.Arrays;

public class P3 {

	public static void main(String[] args) {
		int dato;
		int a, b;
		int retorno;
		String S ="4 5 6 +";
		S = "4 5 6 - 7 +";
		S = "13 DUP 4 POP 5 DUP + DUP + -";
		S = "5 6 + -";
		S = "1048575 DUP +";
		
		String[] ary = S.split(" ");
		Stack stack = new Stack();

		try {
			for (int i = 0; i < ary.length; i++) {
				if (ary[i].equalsIgnoreCase("-")) {
					// System.out.println("resta " );
					a = stack.pop();
					b = stack.pop();
					// System.out.println("resta " );
					stack.push(a - b);
				} else if (ary[i].equalsIgnoreCase("+")) {
					a = stack.pop();
					b = stack.pop();
					stack.push(a + b);
					// System.out.println("suma " );
				} else if (ary[i].equalsIgnoreCase("DUP")) {
					a = stack.pop();
					stack.push(a);
					stack.push(a);
					// System.out.println("suma " );
				} else if (ary[i].equalsIgnoreCase("POP")) {
					a = stack.pop();
					// System.out.println("suma " );
				} else {
					dato = Integer.parseInt(ary[i]);
					// System.out.println("numero : "+dato );
					stack.push(dato);
				}
				System.out.println("Array" + stack.toString());
			}
			retorno = stack.pop();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			retorno = -1;
		}
		System.out.println("retorno : " + retorno);
	}

}

class Stack {
	private int[] arr = new int[28];
	private int index = 0;

	boolean isEmpty() {
		if (index == 0) {
			return true;
		}
		return false;
	}

	boolean isFull() {
		if (index == arr.length) {
			return true;
		}
		return false;
	}

	void push(int newItem) {
		if (isFull()) {
			return;
		}
		arr[index] = newItem;
		index++;
	}

	int pop() throws Exception {
		if (isEmpty()) {
			throw new Exception();
		}
		int deletedItem = arr[index - 1];
		index--;
		return deletedItem;
	}

	int peek() {
		if (isEmpty()) {
			return 0;
		}
		return arr[index - 1];
	}

	public String toString() {
		return Arrays.toString(arr);
	}

}

/*
 * 
 * stack.push(1); stack.push(2); stack.push(3); System.out.println("Array" +
 * stack.toString()); a = stack.pop(); System.out.println("Array" +
 * stack.toString()); b = stack.pop(); System.out.println("Array" +
 * stack.toString()); stack.push(a+b); System.out.println("Array" +
 * stack.toString()); stack.push(88);
 * 
 * 
 * 
 * 
 * 
 */