package matrix;

public class Doubly_Circular_Linked_List<T> {
	private DNodo<T> root;
	private DNodo<T> tail;
	private int lenght = 0;
	
	public DNodo<T> getRoot() {
		return root;
	}
	public void setRoot(DNodo<T> root) {
		this.root = root;
	}
	public DNodo<T> getTail() {
		return tail;
	}
	public void setTail(DNodo<T> tail) {
		this.tail = tail;
	}
	public int getLenght() {
		return lenght;
	}
	public void setLenght(int lenght) {
		this.lenght = lenght;
	}
	public void append(T new_data) {
		DNodo<T> new_node = new DNodo<T>(new_data);
		if(root == null) {
			new_node.setNext(new_node);
			new_node.setPrevious(new_node);
			root = new_node;
			tail = root;
		}else {
			new_node.setPrevious(tail);
			tail.setNext(new_node);
			root.setPrevious(new_node);
			new_node.setNext(root);
			tail = new_node;
		}
		lenght++;
	}
	public DNodo<T> getNode(int n){
		DNodo<T> current = this.root;
		int counter = 0;
		while(counter != n) {
			current = current.getNext();
			++counter;
		}return current;
	}
	public void delete(int n) {
		if(n==0) {
			if(root.getNext() != null) {
				DNodo<T> Next = root.getNext();
				root.setNext(null);
				root = Next;
				--this.lenght;
			}
		}else{
			DNodo<T> current = this.getNode(n-1);
			DNodo<T> Next = current.getNext().getNext();
			current.getNext().setNext(null);
			current.setCurrent(Next);
			--this.lenght;
		}return;
	}
	public void printList() {
		DNodo<T> n = root;
		for(int i = 0 ; i<this.lenght;i++) {
			System.out.println(n.getData());
			n = n.getNext();
		}
	}
}
