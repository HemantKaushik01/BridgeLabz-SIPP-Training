package linkedlist;

class Node {
		int data;
		Node next;
		
		Node(int data){
			this.data=data;
		}
	}

 public class  linked {
	  Node head;
	 Node tail;
	static int size;
	 
	 public  void addFirst(int data) {
		 Node temp = new Node(data);
		 if(head==null) {
			 head=tail= temp;
			 
			 
		 }
		 else {
			 temp.next=head;
			 head=temp;
		 }
		 size++;
	 }
	 public void addLast(int data) {
		 Node temp =new Node(data);
		 if(head==null) {
			 head=tail=temp;
		 }
		 else {
			 tail.next=temp;
			 tail = temp;
		 }
		 size++;
	 }
	 public void display() {
		 while(head!=null) {
			 System.out.print(head.data+"->");
			 head=head.next;
		 }
		 System.out.println();
	 }
	 
	 public void addPosition(int data,int k) {
		 Node newNode = new Node(data);
		 if(k==1) {
			 addFirst(data);
		 } 
		 else if(k==size) {
			 addLast(data);
		 }
		 else {
			 Node temp =head;
			 for(int i=1;i<k-1;i++) {
				 temp= temp.next;
			 }
			 newNode.next = temp.next;
			 temp.next=newNode;
			 size++;
			 
		 }
		 
		 
	 }
	 public void deletePosition( int k) {
		 
		 if(size==1) {
			 head=null;
			 size--;
		 }
		 else {
			 Node temp=head;
			 for(int i=1;i<k-1;i++) {
				 temp=temp.next;
			 }
			 temp.next=temp.next.next;
			 size--;
			 
		 }
	 }
	 
     public static void main(String[] args) {
    linked obj=new linked();

    obj.addFirst(40);
    obj.addFirst(50);
    obj.addFirst(60);
    obj.addLast(10);
    obj.addLast(20);
    obj.addLast(30);
    obj.addPosition(333, 3);
   
    obj.display();
    obj.deletePosition( 3);
    obj.display();
    System.out.print(size);
    //System.out.println(obj.head.data+ " "+ obj.head.next.data);
    
     }
        
 
    
 }
    