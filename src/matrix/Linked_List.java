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
        /**
         * metodo que agrega objetos a la lista
         * @param new_data 
         */
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
        /**
         * metodo que imprime en consola la lista
         */
	public void printList() {
		Node<T> n = root;
		for(int i = 0 ; i<this.lenght;i++) {
			System.out.println(n.getData());
			n = n.getNext();
		}
	}
        /**
         * metodo que busca el objeto en el indice especifico (n)
         * @param n
         * @return 
         */
	public Node<T> getNode(int n){
		Node<T> current = this.root;
		int counter = 0;
		while(counter != n) {
			current = current.getNext();
			++counter;
		}
		return current;
	}
        /**
         * metodo que elimina el nodo que esta en el indice especifico (n)
         * @param n 
         */
	public void delete(int n) {
		Node<T> temp = root;
		if (lenght==1) {
			root=null;
		}
		else{
			
		if (n>=lenght) {
			throw new IllegalArgumentException("Josu");
		}
		else {
			if (n==0) {
				root = root.getNext();
				lenght = lenght-1;
			}
			else {
				if (n==lenght-1) {
					int counter=0;
					while(counter!=n-1) {
						temp= temp.getNext();
						counter+=1;
					}
					temp.setNext(null);
					lenght = lenght-1;
				}
				else {
						int counter=0;
						while(counter != n-1) {
							temp = temp.getNext();
							counter+=1;
						}
						temp.setNext(temp.getNext().getNext());
						lenght = lenght-1;
					}
				}
	
			}
		}
		}
	/**
         * metodo que verifica que un objeto este dentro de una lista
         * @param conex
         * @param listaconex
         * @return 
         */
		
	public boolean contains(Linked_List conex, Linked_List listaconex) {
            Linked_List conexx = new Linked_List();
		for(int i = 0; i < listaconex.lenght; i++) {
			if(conexx.isequal(conex, listaconex)) {
				return true;
			}
		}
		return false;
	}
        /**metodo que saca la interseccion de dos listas de objetos
         * 
         * @param lista1
         * @param lista2
         * @param lista3 
         */

        public void interseccion(Linked_List lista1,Linked_List lista2,Linked_List lista3){
                Node temp1 =  null;
                temp1 = lista1.root;
                while (temp1.getNext() != null){
                    if (contains((Linked_List) temp1.getData(),lista2)){
                        lista3.append(temp1.getData());
                        temp1 = temp1.getNext();
                    }else{
                        temp1 = temp1.getNext();
                    }
                        
                }return ;
        }
        /**
         * metodo que comprueba la igualdad del punto de partida y punto de llegada de la conexion sin importar el orden que tengan
         * @param conex1
         * @param conex2
         * @return 
         */
        public boolean isequal(Linked_List conex1, Linked_List conex2){
            if ((conex1.getNode(0).getData() == conex2.getNode(0).getData()) &&(conex1.getNode(1).getData() == conex2.getNode(1).getData())){
                return true;
            }else{ if((conex1.getNode(0).getData() == conex2.getNode(1).getData()) &&(conex1.getNode(1).getData() == conex2.getNode(0).getData())){
                return true;
            }else{
                return false;
            }
            
                
            }
            
            
        }
        /**
         * metodo que concatena dos listas diferentes en una sola
         * @param lista1
         * @param lista2
         * @return 
         */
        public Linked_List concatenar(Linked_List lista1, Linked_List lista2){
            for(int i=0; i<lista2.getLenght();i++){
                lista1.append(lista2.getNode(i).getData());
            }
            return lista1;
        }
        /**
         * overload del metodo delete(), que elimina el nodo de la lista
         * @param data
         * @param lista 
         */
        public void delete(Object data,Linked_List lista){
            for(int i = 0; i < lista.lenght; i++){
                if(lista.getNode(i).getData()== data){
                    lista.delete(i);
                }
                    
            }System.out.println("Done");
        }
        
}
