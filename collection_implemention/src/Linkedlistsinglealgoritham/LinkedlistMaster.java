package Linkedlistsinglealgoritham;


public class LinkedlistMaster
{
  static Node head;
	static class Node
	{
		int data;
		Node next;
		
		Node(int data)
		{
			this.data=data;
			next=null;
		}
	}
		
		/*static Node newNode(int data) 
		{ 
		  Node temp = new Node(); 
		  temp.data = data; 
		  temp.next = null; 
		  return temp; 
		}*/ 
		public void push(int data)
		{
			Node node =new Node(data);
			node.next=head;
			head=node;
			
		}
		public void print(Node node)
		{
			
			while(node!=null)
			{
				System.out.println(node.data +" ");
				node=node.next;
				
			}
		}
		public static int countnode(Node node)
		{
			int i=0;
			while(node!=null)
			{
				++i;
				node=node.next;
				
			}
			return i;
		}
		
		public Node reverse(Node node)
		{
			Node prev=null;
			Node current=node;
			Node next=null;
			while(current!=null)
			{
				next=current.next;
				current.next=prev;
				prev=current;
				current=next;
			}
			node=prev;
			return node;
			
		}
		public void pairewasp()
		{
			Node temp =head;
			while(temp!=null&&temp.next!=null)
			{
				
				int k=temp.data;
				temp.data=temp.next.data;
				temp.next.data=k;
				temp=temp.next.next;
			}
		}
		
		public void delete(int key)
		{
			Node temp=head;
			Node prev=null;
			if(temp!=null&&temp.data==key)
			{
			head=temp.next;
			}
			while(temp!=null&&temp.data!=key)
			{
				prev=temp;
				temp=temp.next;
			}
			if(temp==null)return;
			prev.next=temp.next;
			
		}
		public void removedublicate()
		{
			Node curr=head;
			while(curr==null)
			{
				Node temp=curr;
				while(temp!=null &&temp.data==curr.data)
				{
					temp=temp.next;
				}
				curr.next=temp;
				curr=curr.next;
			}
		}
		
		/* Function deletes the entire linked list */
	    void deleteList() 
	    { 
	        head = null; 
	    }
	    /* Function to print middle of linked list */
	    void printMiddle() 
	    { 
	        Node slow_ptr = head; 
	        Node fast_ptr = head; 
	        if (head != null) 
	        { 
	            while (fast_ptr != null && fast_ptr.next != null) 
	            { 
	                fast_ptr = fast_ptr.next.next; 
	                slow_ptr = slow_ptr.next; 
	            } 
	            System.out.println("The middle element is [" + 
	                                slow_ptr.data + "] \n"); 
	        } 
	    } 
		// function to find the sum of 
		// nodes of the given linked list 
		public int sum(Node node)
		{
			int sum=0;
			while(node!=null)
			{
				sum+=node.data;
				node=node.next;
			}
			return sum;
		}
		public static Node nthelement(Node head,int n)
		{
			Node firsptr=head;
			Node secondptr=head;
			
			for(int i=0;i<n;i++)
			{
				firsptr=firsptr.next;
				
			}
			while(firsptr!=null)
			{
				firsptr=firsptr.next;
				secondptr=secondptr.next;
			}
			
			return firsptr;
			
		}
		
		public Node findIntersectionNode(Node list1, Node list2) {
			int lengthOfList1 = 0;
			int lengthOfList2 = 0;
			Node temp1=list1, temp2=list2;
			if (temp1 == null || temp2 == null)
				return null;
	 
			// Find the length of both linked list
			while(temp1 != null){
				lengthOfList1++;
				temp1 = temp1.next;
			}
			while(temp2 !=null){
				lengthOfList2++;
				temp2 = temp2.next;
			}
	 
			int difference = 0;
			Node ptr1=list1;
			Node ptr2=list2;
	 
			// Find bigger linked list and iterate upto the different between two linked list.
			if(lengthOfList1 > lengthOfList2){
				difference = lengthOfList1-lengthOfList2;
				int i=0;
				while(i<difference){
					ptr1 = ptr1.next;
					i++;
				}
			}else{
				difference = lengthOfList2-lengthOfList1;
				int i=0;
				while(i<difference){
					ptr2 = ptr2.next;
					i++;
				}
			}
	 
			// Iterate over both linked list and find the common node
			while(ptr1 != null && ptr2 != null){
				if(ptr1 == ptr2){
					return ptr1;
				}
				ptr1 = ptr1.next;
				ptr2 = ptr2.next;
			}
	 
			return null;
		}
	 
		public static void main(String[] args)
		{
			
			LinkedlistMaster ls=new LinkedlistMaster();
			ls.head=new Node(10);
			ls.head.next=new Node(12);
			ls.head.next.next=new Node(45);
			ls.head.next.next.next=new Node(45);
			ls.head.next.next.next.next=new Node(70);
			
			ls.print(head); // print list of value
			head=ls.reverse(head);// revesre value
			System.out.println("list after reverse");
			ls.print(head);
			ls.delete(45);
			System.out.println("list value after delete dublicate ");
			ls.print(head);
			ls.pairewasp();
			System.out.println("list after pairs swap");
			ls.print(head);
			System.out.println("total no of node "+ls.countnode(head));
			System.out.println("sum of node"+ls.sum(head));
			ls.removedublicate();
			System.out.println("list after remove dublicate --");
			ls.print(head);
		
		}
		
		
		
	}

