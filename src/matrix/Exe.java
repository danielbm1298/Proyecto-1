package matrix;

public class Exe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Lista de conecciones
		
		Linked_List<Linked_List> conex = new Linked_List();
		Linked_List<String> columna1 = new Linked_List();
		columna1.append("A2");
		columna1.append("A3");
		Linked_List<String> columna2 = new Linked_List();
		columna2.append("B2");
		columna2.append("C2");
		Linked_List<String> columna3 = new Linked_List();
		columna3.append("A2");
		columna3.append("B2");
		Linked_List<String> columna4 = new Linked_List();
		columna4.append("A1");
		columna4.append("A2");
		Linked_List<String> columna5 = new Linked_List();
		columna5.append("A3");
		columna5.append("A4");
		Linked_List<String> columna6 = new Linked_List();
		columna6.append("A4");
		columna6.append("B4");
		Linked_List<String> columna7= new Linked_List();
		columna7.append("C3");
		columna7.append("C2");
		Linked_List<String> columna8= new Linked_List();
		columna8.append("C3");
		columna8.append("C4");
		conex.append(columna1);
		conex.append(columna2);
		conex.append(columna3);
		conex.append(columna4);
		conex.append(columna5);
		conex.append(columna6);
		conex.append(columna7);
		conex.append(columna8);
		//Lista linea
		Linked_List<String> lin = new Linked_List();
		lin.append("C4");
		lin.append("B4");
		
		ReconocerFigura prueba = new ReconocerFigura();
		prueba.buscar(conex, lin);

		//System.out.println("terminando");
		
		
		/**
		for(int m = 0 ; m < conex.getLenght();m++) {
			for(int n = 0; n < conex.getNode(m).getData().getLenght();n++) {
				System.out.println(conex.getNode(m).getData().getNode(n).getData());
			}
		}
		
		
		
		Linked_List<Integer> listi�a = new Linked_List();
		listi�a.append(0);
		listi�a.append(1);
		listi�a.append(2);
		listi�a.append(3);
		listi�a.append(4);
		listi�a.append(5);
		listi�a.append(6);
		listi�a.append(7);
		
		System.out.println(listi�a.contains(8, listi�a));
		 


		**/
		}	
	}	
