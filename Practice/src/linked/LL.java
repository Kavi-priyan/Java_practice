package linked;

public class LL {
	
	private Node head;
	private Node tail;
	private int size;
	
	LL(){
		this.size=0;
	}
	
	
	public Node get(int index) {
		
		
		Node temp=head;
		for (int i = 0; i < index; i++) {
			temp=temp.next;
			
		}
		
		return temp;
	}
	
	public int deleteFirst() {
	
		
		int val=head.value;

		head=head.next;
	
		if(head==null) {
			tail=null;
		}
		size--;
return val;
	}
	
	public int deleteLast() {

		
		
	Node indexes=get(size-2);
	
	if(size<=1) {
		deleteFirst();
	}
	
	int val=tail.value;
	indexes.next=null;
	indexes=tail;

	
		--size;
		
		return val;
	}
	
	
	public void insert(int val,int index) {
		
		Node temp=head;
		
		if(index==0) {
			insertFirst(val);
			return ;
		}
		
		
		for (int i = 1; i < index; i++) {
		temp=temp.next;
			
		}
		
		Node node=new Node(val,temp.next);
		
		temp.next=node;
		
	}
	
	
	void insertLast(int value) {
		Node temp=new Node(value);
		
		if(tail==null) {
		 insertFirst(value);
			return;
		}
		
		tail.next=temp;
		
		tail = temp;
		
		size++;
	}
	
	
 void insertFirst(int value) {
		Node temp = new Node(value);
		temp.next=head;
		head=temp;
				
		
		if(tail==null) {
			tail=head;
		}
		size++;
		
		
		
	}
	
 void display() {
		Node temp=head;
		
		while(temp!=null) {
			
			System.out.print(temp.value+"==>");
			temp=temp.next;
		}
		
		
		System.out.print("END");
		
	}
	
	
	
	private class Node {
		Node next;
		private int value;
		
		public Node(int value){
	
			this.value=value;
		}
		
		public Node(int value,Node next){
			this.next=next;
			this.value=value;
		}
		
	}
	

}
