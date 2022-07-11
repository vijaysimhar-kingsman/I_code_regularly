package  takeyouforward;

import java.util.*;
class LinkOne{
	int data;
	LinkOne next;
	public LinkOne(int data){
		this.data = data;
		next= null;
	}
}
class stack1{
	public static LinkOne head;
	public boolean isEmpty() {
		return head==null;
	}
	public void push(int data) {
		LinkOne newLinkOne = new LinkOne(data);
		if(isEmpty()){
			head= newLinkOne;
			return;
		}
			newLinkOne.next= head;
			head = newLinkOne;
		
		
	}public void show() {
		if(isEmpty()){
			System.out.println("empty");
		}
		LinkOne temp = head;
		while(temp!=null) {
			System.out.print(temp.data + " ");
			temp=temp.next;
		}
		System.out.println();
	}public void pop() {
		if(!isEmpty()) {
			System.out.println(head.data);
			head= head.next;
		}else {
			System.out.println("stack is empty");
		}
	}
//	static ArrayList<Integer> arr = new ArrayList<>();
//	public void push(int data) {
//		arr.add(data);
//	}public void pop(){
//		System.out.println(arr.get(arr.size()-1));
//		arr.remove(arr.size()-1);
//	}public void show() {
//		System.out.println(arr);
//	}
	
}
public class StackImplementationUsingArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stack1 s = new stack1();
		s.push(8);
		s.show();
		s.push(20);
		s.show();
		s.push(30);
		s.show();
		s.pop();
		s.push(40);
		s.show();
		s.push(50);
		s.show();

	}

}
