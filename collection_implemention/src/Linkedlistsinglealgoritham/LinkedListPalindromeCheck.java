package Linkedlistsinglealgoritham;

public class LinkedListPalindromeCheck{
 
	private Node head;
 
	private static class Node {
		private int value;
		private Node next;
 
		Node(int value) {
			this.value = value;
 
		}
	}
 
	public void addToTheLast(Node node) {
 
		if (head == null) {
			head = node;
		} else {
			Node temp = head;
			while (temp.next != null)
				temp = temp.next;
 
			temp.next = node;
		}
	}
 
 
	public void printList() {
		Node temp = head;
		while (temp != null) {
			System.out.format("%d ", temp.value);
			temp = temp.next;
		}
		System.out.println();
	}
 
	// This function will find middle element in linkedlist
	public static Node findMiddleNode(Node head)
	{
		// step 1
		Node slowPointer, fastPointer; 
		slowPointer = fastPointer = head; 
 
		while(fastPointer !=null) { 
			fastPointer = fastPointer.next; 
			if(fastPointer != null && fastPointer.next != null) { 
				slowPointer = slowPointer.next; 
				fastPointer = fastPointer.next; 
			} 
		} 
 
		return slowPointer; 
	}
 
	// Function to check if linked list is palindrome or not
	public static boolean checkPalindrome (Node head)
	{
		// Find middle node using slow and fast pointer
		Node middleNode=findMiddleNode(head);
		// we got head of second part
		Node secondHead=middleNode.next;
		// It is end of first part of linked list
		middleNode.next=null;
		// get reversed linked list for second part
		Node reverseSecondHead=reverseLinkedList(secondHead);
 
		while(head!=null && reverseSecondHead!=null)
		{
			if(head.value==reverseSecondHead.value)
			{
				head=head.next;
				reverseSecondHead=reverseSecondHead.next;
				continue;
			}
			else
			{
				return false;
			}
		}
 
		return true;
 
 
	}
 
	public static Node reverseLinkedList(Node currentNode) 
	{ 
		// For first node, previousNode will be null 
		Node previousNode=null; 
		Node nextNode; 
		while(currentNode!=null) 
		{ 
			nextNode=currentNode.next; 
			// reversing the link 
			currentNode.next=previousNode; 
			// moving currentNode and previousNode by 1 node 
			previousNode=currentNode; 
			currentNode=nextNode; 
		} 
		return previousNode; 
	} 
 public Node nthFromLastNode(Node head,int n)
	{
		Node firstPtr=head;
		Node secondPtr=head;
 
		for (int i = 0; i < n; i++) {
			firstPtr=firstPtr.next;
 
		}
 
		while(firstPtr!=null)
		{
			firstPtr=firstPtr.next;
			secondPtr=secondPtr.next;
		}
 
		return secondPtr;
	}
 
	public static void main(String[] args) {
		LinkedListPalindromeCheck list = new LinkedListPalindromeCheck();
		// Creating a linked list
		Node head=new Node(1);
		list.addToTheLast(head);
		list.addToTheLast(new Node(2));
		list.addToTheLast(new Node(1));
		list.addToTheLast(new Node(2));
		list.addToTheLast(new Node(1));
 
		list.printList();
 
		System.out.println("Linked list palidrome: "+checkPalindrome(head));
	}
}
 


