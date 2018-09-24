package cliente;

public class ColaClientes {

  class Node {
    Object cliente;
    Node Next;

    public Node(Object Socket) {
      cliente = Socket;
      Next = null;
    }
  }

  Node root;
  Node last;
  int len;

  public ColaClientes() {
    root = null;
    last = null;
    len = 0;
  }

  public void enqueue(Object Socket) {
    Node nodo = new Node(Socket);
    if (root == null) {
      root= nodo;
      root = last;
    } else {
      last.Next = nodo;
      last = nodo;
    }
    len++;
  }

  public Object dequeue() {
    if (root == null){
      return null;
    }else{
    Object cliente  = root.cliente;
    root = root.Next;
    len--;
    return cliente;
    }
  }
  public int len() {
    return len;
  }
  public Object peek() {
    if (root == null)
      return null;
    else
      return root.cliente;
  }
   public boolean isEmpty() {
    return (len == 0);
  }


} 