package matrix;


public class Pila {
    class Node {
    Object lista;
    Node Next;
    Node Previous;

    public Node(Object lista) {
      lista = lista;
      Next = null;
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
      root.Previous = nodo;
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
    if (root == null)
      return null;
    else
      return last; 
    
    
  }
  
    
   public boolean isEmpty() {
    return (len == 0);
  }


} 