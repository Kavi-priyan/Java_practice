package Jun18;


public class LinkedList {
	
	class Node{
		int value;
		Node next;
		
		Node(int data){
			value=data;
			
		}
	}
	
	
	
	Node head;
	Node tail;
	int size;
	
	public int size() {
		return size;
		
	}
	
	public void append(int data) {
		Node node=new Node(data);
		
		if(isEmpty()) {
			head=node;
			tail=node;
			
		}
		else {
			tail.next=node;
			tail=node;
		}
		size++;
	}
	
	public void insert(int value,int index)
	{
		
		

		if(index<0) {
			throw new IndexOutOfBoundsException("Index out of bound.");
		}
		else if(index==0) {
			prepend(value);
			return;
		
	}
		
		
		if(index>=size) {
			append(value);
		}
		Node prev=get(index-1);
		Node node=new Node(value);
		
		node.next=prev.next;
		prev.next=node;
		size++;
		
	}
	
	public Node get(int index ) {
		Node temp=head;
		int i=0;
		while(i<index) {
			temp=temp.next;
			i++;
			
		}
		return head;
		
	}
	
	public void delete(int index) {
		
		
		if(index<0) {
			throw new IndexOutOfBoundsException("Index out of bound.");
		}
		else if(index==0) {
			deleteFirst();
			return;
		}
		else if(index>=size) {
			deleteLast();
			return;
		}

		
		
		Node temp=head;
		int i=0;
		while(i<index-1) {
			temp=temp.next;
			i++;
		}
		
		Node Next=temp.next;
		temp.next=Next.next;
	}
	
	public void deleteFirst() {
	
		
	

		head=head.next;
	
		if(head==null) {
			tail=null;
		}
		size--;

	}
	public void deleteLast() {
		Node temp=head;
		int i=0;
		
		
		while(temp.next!=tail) {
			temp=temp.next;
			i++;
			
		}
		
	
		temp.next=null;
		tail=temp;
		size--;

	}
	
	
	public void prepend(int data) {
		Node node=new Node(data);
		
		if(isEmpty()) {
			head=node;
			tail=node;
			
		}
		else {
			node.next=head;
			head=node;
		}
		size++;
	}
	
	public int indexOf(int value) {
		Node temp=head;
		int i=0;
		while(temp.next!=null) {
			
			if(temp.value==value) {
				return i;
			}
			++i;
		}
		return 0;
		
	}
	
	public void diplay() {
		Node temp=head;
		
		while(temp!=null){
			System.out.print(temp.value + (temp.next!=null ?" -> " : "") );
			temp=temp.next;
		}
	}
	
	public boolean isEmpty() {
		return head==null && tail==null;
	}
	
	
	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		System.out.println(l.isEmpty());
		l.append(99);
		l.append(123);
		l.prepend(10);
		l.delete(0);
System.out.println(	l.indexOf(99));
	
		l.diplay();
		
	}

}
