package matrix;

public class Linked_List<T> {
	private Node<T> root;
	private int lenght = 0;
	
	public Node<T> getRoot() {
		return root;
	}
	public void setRoot(Node<T> root) {
		this.root = root;
	}
	public int getLenght() {
		return lenght;
	}
	public void setLenght(int lenght) {
		this.lenght = lenght;
	}
	public void append(T new_data) {
		Node<T> new_node = new Node<T>(new_data);
		if(root == null) {
			root = new_node;
			root.setNext(null);
			++this.lenght;
			return;
		}
		Node<T> last = root;
		while(last.getNext() != null) {
			last = last.getNext();
		}
		new_node.setNext(null);
		last.setNext(new_node);
		++this.lenght;
		return;
	}
	public void printList() {
		Node<T> n = root;
		for(int i = 0 ; i<this.lenght;i++) {
			System.out.println(n.getData());
			n = n.getNext();
		}
	}
	public Node<T> getNode(int n){
		Node<T> current = this.root;
		int counter = 0;
		while(counter != n) {
			current = current.getNext();
			++counter;
		}
		return current;
	}
	public void delete(int n) {
		if(n==0) {
			if(root.getNext() != null) {
				Node<T> Next = root.getNext();
				root.setNext(null);
				root = Next;
				--this.lenght;
			}
		}else{
			Node<T> current = this.getNode(n-1);
			Node<T> Next = current.getNext().getNext();
			current.getNext().setNext(null);
			current.setCurrent(Next);
			--this.lenght;
		}return;
	}
	public boolean contains(Object data, Linked_List list) {
		for(int i = 0; i < list.lenght; i++) {
			if(data == list.getNode(i).getData()) {
				return true;
			}
		}
		return false;
	}
}
