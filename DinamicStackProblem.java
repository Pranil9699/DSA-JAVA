
// stack have 3 element and we want to add the 4th element but first position ????
import java.util.ArrayList;

public class Main {
	static class Node{
	    int data;
	    Node next;
	    Node(int data){
	        this.data= data;
	        next=null;
	    }
	}
	static class Stack{
	    public static Node head;
	    public static boolean isempty(){
	        return head==null;
	    }
	    public static void push(int data){
	        Node newNode= new Node(data);
	        if(head==null){
	            head = newNode;
	            return ;
	        }
	        newNode.next=head;
	        head = newNode;
	    }
	    public static int pop(){
	        if(isempty()){
	            return -1;
	        }
	        int Top= head.data;
	        head = head.next;
	        return Top;
	    }
	    public static int peek()
	    {
	           if(isempty()){
	            return -1;
	        }
	        return head.data;
	    }
}	        
	public static void main(String[] args) {
		Stack s = new Stack();
		s.push(10);
		System.out.println(s.peek());
		s.push(130);
		System.out.println(s.peek());
		s.push(100);
		System.out.println(s.peek());
		ArrayList<Integer> Stackobj = new ArrayList<>();
		
		Stackobj.add(s.pop());
		Stackobj.add(s.pop());
		Stackobj.add(s.pop());
		s.push(4);
		s.push(Stackobj.get(Stackobj.size()-1));Stackobj.remove(Stackobj.get(Stackobj.size()-1));
		s.push(Stackobj.get(Stackobj.size()-1));Stackobj.remove(Stackobj.get(Stackobj.size()-1));
		s.push(Stackobj.get(Stackobj.size()-1));Stackobj.remove(Stackobj.get(Stackobj.size()-1));
		while(!s.isempty()){
		    System.out.println(s.pop());	
		}
	}
}
