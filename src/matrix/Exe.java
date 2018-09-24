package matrix;

public class Exe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		Linked_List<Linked_List> listaprincipal = new Linked_List();
		Linked_List<Integer> fila1 = new Linked_List();
		fila1.append(0);
		fila1.append(1);
		fila1.append(2);
		fila1.append(3);
		listaprincipal.append(fila1);
		
		for(int m = 0 ; m < listaprincipal.getLenght();m++) {
			System.out.println("flago");
			for(int n = 0; n < listaprincipal.getNode(m).getData().getLenght();n++) {
				System.out.println(listaprincipal.getNode(m).getData().getNode(n).getData());
			}
		}
		**/
		
		Linked_List<Doubly_Circular_Linked_List> listaprincipal = new Linked_List();
		Doubly_Circular_Linked_List<Integer> fila1 = new Doubly_Circular_Linked_List();
		fila1.append(0);
		fila1.append(1);
		fila1.append(2);
		fila1.append(3);
		fila1.append(4);
		fila1.append(5);
		fila1.append(6);
		fila1.append(7);
		listaprincipal.append(fila1);
		System.out.println("flag ");
		for(int m = 0 ; m < listaprincipal.getLenght();m++) {
			for(int n = 0; n < 12;n++) {
				System.out.println(listaprincipal.getNode(m).getData().getNode(n).getData());
			}
		}

		
		
		}	
	}	
