package matrix;


public class Pila {
    class Node {
    Object lista;
    Node Next;
    Node Previous;
    Object data;

    public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public Node(Object lista) {
      this.lista = lista;
      Next = null;
    }

	public Node getNext() {
		return Next;
	}

	public void setNext(Node next) {
		Next = next;
	}

	public Node getPrevious() {
		return Previous;
	}

	public void setPrevious(Node previous) {
		Previous = previous;
	}
    
  }

  Node root;
  Node last;
  int len;

  public Pila() {
    root = null;
    last = null;
    len = 0;
  }

  public void push(Object lista) {
    Node nodo = new Node(lista);
    if (root == null) {
      root= nodo;
      root = last;
    } else {
      nodo.setNext(root);
      root = nodo;
    }
    len++;
  }

  public Object pop() {
    if (root == null){
      return null;
    }else{
    Object lista  = last.lista;
    last = last.Previous;
    len--;
    return lista;
    }
  }
  public int len() {
    return len;
  }
  public Object peek() {
    if (root == null) {
    	

      return null;
<<<<<<< HEAD
    }
    else {
      return last.getData(); 
    }
=======
    else
      return root.getData(); 
>>>>>>> ffd80c5b18afda8229f7402f0cac2f1735736e94
    
    
  }
  public void printPila() {
		Node n = root;
		for(int i = 0 ; i<this.len;i++) {
			System.out.println(n.getData());
			n = n.getNext();
		}
	}
  
    
   public boolean isEmpty() {
    return (len == 0);
  }


} 