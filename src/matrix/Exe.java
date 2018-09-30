package matrix;

public class Exe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Lista de conecciones
		Linked_List<Linked_List> conex = new Linked_List();
		Linked_List<String> columna1 = new Linked_List();
		columna1.append("C2");
		columna1.append("C3");
		Linked_List<String> columna2 = new Linked_List();
		columna2.append("B2");
		columna2.append("B1");
		Linked_List<String> columna3 = new Linked_List();
		columna2.append("B2");
		columna2.append("C2");
		Linked_List<String> columna4 = new Linked_List();
		columna2.append("C3");
		columna2.append("C2");
		conex.append(columna1);
		conex.append(columna2);
		conex.append(columna3);
		conex.append(columna4);
		//Lista linea
		Linked_List<String> lin = new Linked_List();
		lin.append("C2");
		lin.append("C3");
		
		ReconocerFigura prueba = new ReconocerFigura();
		prueba.buscar(conex, lin);

		
		
		/**
		for(int m = 0 ; m < conex.getLenght();m++) {
			for(int n = 0; n < conex.getNode(m).getData().getLenght();n++) {
				System.out.println(conex.getNode(m).getData().getNode(n).getData());
			}
		}
		**/
		
		
		}	
	}	
