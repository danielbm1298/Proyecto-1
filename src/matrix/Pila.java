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
    
	public void setLista(Object lista) {
		this.lista = lista;
	}
	

	public Object getLista() {
		return lista;
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
      root.setLista(lista);
      last= root;
    } else {
      nodo.setNext(root);
      root = nodo;
      root.setLista(lista);
    }
    len++;
  }

  public Object pop() {
    if (root == null){
      return null;
    }else{
    Object lista  = root.lista;
    root = root.getNext();
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
    }
    else
      return root.getLista();     
    
  }
  public void printPila() {
		Node n = root;
		for(int i = 0 ; i<this.len;i++) {
			System.out.println(n.getLista());
			n = n.getNext();
		}
	}
  
    
   public boolean isEmpty() {
    return (len == 0);
  }


} 