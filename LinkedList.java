public class LinkedList<T> implements List<T> {
    private Node<T> head;
    private Node<T> tail;
    private int size;

    public LinkedList() {
        head = null;
        tail = null;
    }

    public Node<T> getHead() {
        return head;
    }

    public Node<T> getTail() {
        return tail;
    }

    // public int getSize() {
    //     return size;
    // }

    public boolean isEmpty() {
        return (this.size() == 0);
    }
    
    public void addAtIndex(T data, int index) {
        if (index < 0 || index > this.size()) {
            throw new IllegalArgumentException("Your index is out of the list bounds");
        }
        else if (data == null) {
            throw new IllegalArgumentException("You cannot add null data to the list");
        }
        // If index is at the start of the LL. head changes to the newNode
        if (index == 0) {
            head = new Node<T>(data, head);
        }
        // For all other indexes - positions newNode at the index choice. head doesn't change here since its an insertion other than the first index
        else {
            Node<T> previous = head;
            Node<T> current = head;
            for (int i = 0; i < index; i++) {
                previous = current;
                current = current.getNext();
            }
            Node<T> newNode = new Node<T>(data, current); // Points newNode at the old node which occupied the index choice
            previous.setNext(newNode); // Relinks the front portion of the LL by pointing the previous node to the newNode 
        }
        // Setting tail should be the same for all cases which is iterate through the new LL
        Node<T> current = head;
        while (current.getNext() != null) {
            current = current.getNext();
        }
        tail = current;
        size = size();
    }

    public T getAtIndex(int index) {
        if (index < 0 || (index > (this.size() - 1))) {
            throw new IllegalArgumentException("Your index is out of the list bounds");
        }
        Node<T> current = head;
        for (int i = 0; i < index; i++) {
            current = current.getNext();
        }
        return current.getData();
    }
    
    public T removeAtIndex(int index) {
        if (index < 0 || (index > (this.size() - 1))) {
            throw new IllegalArgumentException("Your index is out of the list bounds");
        }
        T data = null;
        if (index == 0) {
            data = head.getData();
            head = head.getNext();
            // Garbage collection for the previous head since no pointer to it
        }
        else {
            Node<T> previous = head;
            Node<T> current = head;
            for (int i = 0; i < index; i++) {
                previous = current;
                current = current.getNext();
            }
            data = current.getData();
            previous.setNext(current.getNext());
            // Garbage collection for current node
        }
        if (head == null) {
            tail = null;
        }
        else {
            Node<T> current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            tail = current;
        }
        size = size();
        return data;
    }

    public int size() {
	    // head should be pointing at the first Node
	    Node<T> current = this.getHead();
	    int counter = 0;
	    while (current != null) {
		    counter++;
		    current = current.getNext();
	    }
        if (counter == 0) {
            size = 0;
        }
	    return counter;
    }

    public String toString() {
        Node<T> current = head;
        String result = "";
        while (current != null) {
            result = result + current.getData().toString() + "\n";
            current = current.getNext();
        }
        return result;
    }

    
}
