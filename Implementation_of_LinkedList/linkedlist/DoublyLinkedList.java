package linkedlist;
class Nodes {
	int data;
	Nodes next;
	Nodes prev;
	Nodes(int data){
		this.data=data;
		this.next=null;
		this.prev=null;
	}
}
public class DoublyLinkedList {
	Nodes head=null;
	Nodes tail=null;
	static int size =0;
	
	public void addForward(int data) {
		Nodes newNode = new Nodes(data);
		if(head==null ) {
			head=newNode;
			tail=newNode;
		}
		else {
			newNode.next=head;
			head.prev=newNode;
			head=newNode;
		}
	}
	public void addBackward(int data) {
		Nodes newNode = new Nodes(data);
		if(head==null) {
			head=newNode;
			tail=newNode;
		}
		else {
			tail.next=newNode;
			newNode.prev=tail;
			tail=newNode;
		}
	}
	
	public void displayBackword(){
		Nodes curr=tail;
		if(tail==null) {
			System.out.print("List is empty");
			return ;
		}
		while(curr!=null) {
			System.out.print(curr.data+" ");
			curr=curr.prev;
			
		}
	}

	public static void main(String[] args) {
		DoublyLinkedList ll =new DoublyLinkedList();
		ll.addForward(10);
		ll.addForward(20);
		ll.addForward(30);
		ll.addBackward(100);
		ll.addBackward(200);
		ll.addBackward(300);
		
		ll.displayBackword();
		
		

	}

}
