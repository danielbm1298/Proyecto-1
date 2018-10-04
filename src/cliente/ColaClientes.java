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
  
  /**
   * constructo clase ColaClientes
   */

  public ColaClientes() {
    root = null;
    last = null;
    len = 0;
  }
/**
 * metodo que mete objetos a la cola
 * @param Socket 
 */
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
/**
 * metodo para sacar el primer objeto de la cola
 * @return 
 */
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
  /**
   * devuelve el largo de la cola
   * @return 
   */
  public int len() {
    return len;
  }
  /**
   * metodo que muestra pimer onjeto en la cola
   * @return 
   */
  public Object peek() {
    if (root == null)
      return null;
    else
      return root.cliente;
  }
  /**
   * metodo que verifica que la cola no este vacia
   * @return 
   */
   public boolean isEmpty() {
    return (len == 0);
  }


} 