package prac;

public class DeleteLinkedListNode {
	
	private static Node head;
	
	static  class Node{
		
		int data;
		Node next;
		
		public Node(int data) {
			
			this.data=data;
			next=null;
			
		}
		
	}
	public static void deleteNode(Node node,int x) {
		
		Node temp = node;
		Node prev =null;
		
		if(temp!=null && temp.data>x) {
			
			node =node.next;
			temp=node;
		}
		
		while(temp!=null) {
			
			while(temp!=null && temp.data<=x) {
				
				prev=temp;
				temp=temp.next;
			}
			
			if(temp==null) {
				return;
			}
			
			prev.next=temp.next;
			temp=prev.next;
		}
		
	} 
	
	public static void printlist(Node node) {
		
		Node current = node;
		
		while(current!=null) {
			
			System.out.printf("%d->",current.data);
			current=current.next;
		}
		System.out.printf("%d",null);
	}
	
	public static void main(String args[]) {
		
		DeleteLinkedListNode dl = new DeleteLinkedListNode();
		
		int num = 6;
		dl.head=new Node(7);
		
		dl.head.next = new Node(15);
		dl.head.next.next = new Node(4);
        dl.head.next.next.next = new Node(20);
        
        dl.printlist(head);
        dl.deleteNode(head, num);
        dl.printlist(head);
        
		
	}

}
