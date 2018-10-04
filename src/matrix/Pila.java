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
/**
 * metodo que agrega nodos a la pila
 * @param lista 
 */
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
  /**metodo que elimina el ultimo valor de la pila
   * 
   * @return 
   */

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
  /**
   * metodo que muestra el ultimo objeto de la pila pero no lo elimina
   * @return 
   */
  public Object peek() {
    if (root == null) {
      return null;
    }
    else
      return root.getLista();     
    
  }
  /**metodo que imprime la pila
   * 
   */
  public void printPila() {
		Node n = root;
		for(int i = 0 ; i<this.len;i++) {
			System.out.println(n.getLista());
			n = n.getNext();
		}
	}
  
    /**metodo que comprueba que la pila esta vacia
     * 
     * @return 
     */
   public boolean isEmpty() {
    return (len == 0);
  }


} 