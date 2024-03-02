package DataStructure;

public class LinkedList {
	//Make a node as a head
	Node head;
	//method to insert a element inside a LinkedList
	public void insert(int data) {
		//create a new node
		Node node = new Node();
		node.data = data;
		node.next = null;
		
		if(head==null) {
			//if this is a first element make this element as a head
			head = node;
		}
		else {
			Node current = head;
			while(current.next!=null)//traverse the linkedlist until the next of the last node is nul
			{
				current = current.next;
			}
			current.next = node; //inserting a element at the last
		}
	}
	//method to display a elements in LinkedList
	public void show() {
		Node current = head;
		while(current!=null) {
			System.out.println(current.data);
			current = current.next;
		}
	}
	
	public void insertAtFirst(int data) {
		// create a new node
		Node newNode = new Node();
		//with the data
		newNode.data = data;
		//the next of the new node will be the head(memory address of the first(now second element))
		newNode.next = head;
		//update the new Node as a head because we insert at in the first place
		head = newNode;
		
	}
	public void insertMiddle(int data, int pos) {
		if (pos == 0) {
            insertAtFirst(data);
            return;
        }

        // Traverse the list until the node at position pos - 1
        Node current = head;
        for (int i = 0; i < pos - 1 && current != null; i++) {
            current = current.next;
        }

        // Check if the position is valid
        if (current == null) {
            System.out.println("Invalid position");
            return;
        }

        // Create a new node with the given data
        Node newNode = new Node();
        newNode.data = data;

        // Insert the new node at position pos
        newNode.next = current.next;
        current.next = newNode;

		
	}
}