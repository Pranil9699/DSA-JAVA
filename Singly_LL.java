package linkedlist;
import java.util.Scanner;
public class linkedlist {
	Node head;
	private int size;
	linkedlist(){
		size = 0;
	}
	public class Node {
	 int data;
	 Node next;
	 
	 Node(int value){
		 this.data = value;
		 this.next =null;
	 }
	}
	public void AddFirst(int value) {
		Node newNode = new Node(value);
		if(head==null) {
			head=newNode;
         return;
		}
		newNode.next=head;
		head = newNode;
	}
	public void printlist() {
		Node display = head;
		while(display!=null) {
			System.out.print(display.data+" -> ");
			display=display.next;
			
		}
		System.out.println("null");
	}
	public void AddLast(int value) {
		Node newNode = new Node(value);
		if(head==null) {
			head=newNode;
         return;
		}
		Node lastNode = head;
		while(lastNode.next!=null) {
			lastNode=lastNode.next;
		}
		lastNode.next=newNode;
		}
	public void removeFirst() {
		if(head==null) {
			System.out.println("Linked-list is Empty");
			return;
		}
		head = head.next;
		size--;
	}
	public void removeLast() {
		if(head==null) {
			System.out.println("Linked-list is empty ");
			return;
		}
		size--;
		if(head.next==null) {
         head=null; 
		}
		Node CurrentNode = head;
		Node lastNode = head.next;
		while(lastNode.next!=null) {
			lastNode=lastNode.next;
			CurrentNode = CurrentNode.next;
		}
		lastNode.next=null;
	}
	public int getsize() {
		return size;
	}
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			linkedlist obj = new linkedlist();
			while(true) {
				System.out.println("1.addfirst\n2.addlast\n3.removefirst\n4.removelast\n5.display\n6.CurrentSize\n7.exit()");
				int choice=sc.nextInt();
				int node;
				switch(choice) {
				case 1:
					System.out.println("Enter the Node");
					node = sc.nextInt();
					obj.AddFirst(node);
					break;
				case 2:
					System.out.println("Enter the Node");
					node = sc.nextInt();
					obj.AddLast(node);
					break;
				case 3:
					obj.removeFirst();
					break;
				case 4:
					obj.removeLast();
					break;
				case 5:
					obj.printlist();
					break;
				case 6:
					System.out.println("The Size of Linkedlist is "+obj.getsize());
					break;
				case 7:
					System.exit(1);
					default:
						System.out.println("Wrong Choice");
				}
			}
		}
	}

}



/*
new Addition
package linkedList;
import java.util.Scanner;
public class linkedlist {
	
Node head;
private static int size;
linkedlist(){
	size = 0;
}

public class Node{
	 int data;
     Node next;

     Node(int value){
    	 this.data=value;
    	 this.next=null;
     }
}

public void insertFront(int value) {
	Node newNode  = new Node(value);
	if(head==null) {
		head = newNode;
		return;
	}
	newNode.next = head;
	head = newNode;
}

public void insertEnd(int value) {
	Node newNode  = new Node(value);
	if(head==null) {
		head = newNode;
		return;
	}
	Node temp = head;
	while(temp.next!=null) {
		temp = temp.next;
	}
	temp.next=newNode;
}
public void display() {
	Node temp = head;
	while(temp!=null) {
		System.out.print(temp.data+" -> ");
		temp=temp.next;
	}
	System.out.println("null");
}
public void removeFirst() {
	if(head==null) {
		System.out.print(" This linked list is empty ");
		return;
	} 
	head = head.next;
	size--;
}
public void removeLast() {
	if(head==null) {
		System.out.print(" This linked list is empty ");
		return;
	} 
	size--;
	if(head.next==null) {
head=null;
return;
	} 
	Node currentNode = head ;
	Node lastNode = head.next;
	while(lastNode.next!=null) {
		lastNode=lastNode.next;
		currentNode = currentNode.next;
	}
}
public void insertpos(int value, int pos) {
if(pos<=size) {
Node newNode = new Node(value);
Node temp = head;
int i =1;
while(temp!=null) {
	if(i==(pos-1)) {
		Node temp1=temp.next;
		temp.next=newNode;
		newNode.next=temp1;
	}
	i++;
	temp=temp.next;

}
}
else 
	System.out.println("This position is Invalid");

}
public int getsize() {
	return size;
}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		linkedlist obj = new linkedlist();
		while(true) {
			System.out.println("1.insertfront\n2.insertLast\n3.diplay\n4.removeFirst\n5.removeLast\n6.size\n7.exit\n8.insertpositon\nEnter Your Choice ");
			int choice = sc.nextInt();
			int data;
			switch(choice) {
			case 1:
				System.out.println("Enter the Node");
				data=sc.nextInt();
				obj.insertFront(data);
				size++;
				break;
			case 2:
				System.out.println("Enter the Node");
				data=sc.nextInt();
				obj.insertEnd(data);
				size++;
				break;
			case 3:
				System.out.print("The Linkedlist is ");
				obj.display();
				break;
			case 4:
				System.out.println("Element is Remove");
				obj.removeFirst();
				break;
			case 5:
				System.out.println("Element is Remove");
				obj.removeLast();
				break;
			case 6:
				System.out.println("The Size of Linkedlist "+obj.getsize());
				break;
			case 7:
				System.exit(1);
				break;
         	case 8:
         		System.out.println("Enter the Node");
				data=sc.nextInt();
				System.out.println("Enter The Position");
				int pos = sc.nextInt();
				obj.insertpos(data,pos);
				size++;
				break;
				default:
					System.out.println("Invalid Choiceing");
			}
		}
	}
}
*/
