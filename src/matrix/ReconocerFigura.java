package matrix;

public class ReconocerFigura {
	 
	public ReconocerFigura() {
		
	}

	public Pila buscar(Linked_List<Linked_List> conexiones,Linked_List<String> linea) {
		Pila pivot=new Pila();
		String llegada =(String) linea.getNode(1).getData();
		String primer_pivot = new String();
		primer_pivot =linea.getNode(0).getData();
		pivot.push(primer_pivot);
		Linked_List<String> prueba =new Linked_List();
		prueba.append("A2");
		prueba.append("A1");

		Linked_List<String> prueba2 =new Linked_List();
		prueba2.append("A2");
		prueba2.append("A1");

		if (prueba==prueba2) {
			System.out.println("SI SON IGUALES");
		}else {
			System.out.println("no son iguales QUE PICHA");
			
		}



	
		System.out.println(pivot.len());


		System.out.println(pivot.peek());
		

		int indice_lista= 0;

		//System.out.println("seleccionado1 "+seleccionado.getNode(0).getData());
		//System.out.println("seleccionado2 "+seleccionado.getNode(1).getData());
		System.out.println(conexiones.getLenght());
		//for (int i = 0; i < 3; i++) {
		while (conexiones.getLenght()!=1) {
		
		while (conexiones.getLenght()!=indice_lista) {
			if (pivot.peek()==llegada) {
				System.out.println("termino");
				pivot.printPila();
				return pivot;
			}
			Linked_List<Linked_List> seleccionado =(Linked_List) conexiones.getNode(indice_lista).getData();

			System.out.println("empezando comparacion cuando conexiones tiene "+conexiones.getLenght());
		if (seleccionado.getNode(0).getData()==pivot.peek()) { //si el elemento 1 es igual al pivot:
			
			pivot.push(seleccionado.getNode(1).getData());//agrega el otro elemento como pivot
			pivot.printPila();
			System.out.println("se agrego un elemento al pivot");
			//borrar de la lista 
			conexiones.delete(indice_lista);
			indice_lista=0;
			System.out.println("ahora la lista conexiones tiene"+conexiones.getLenght());
	
		}
		else if (seleccionado.getNode(1).getData()==pivot.peek()) {//si el elemento 2 es igual al pivot:
			pivot.push(seleccionado.getNode(0).getData()); //agrega el otro elemento como pivot
			pivot.printPila();
			System.out.println("se agrego un elemento al pivot");
			//borrar de la lista 
			conexiones.delete(indice_lista);
			System.out.println("ahora la lista conexiones tiene"+conexiones.getLenght());
			indice_lista=0;
			
		}
		else{
			System.out.println("ningun elemento se relaciona, se busca el siguiente");
			indice_lista++;
		}

		}
		System.out.println("Terminó el while");
		if (pivot.peek()==llegada) {
			System.out.println("terminó");
		}
		else {
		pivot.pop();
		indice_lista=0;
		}
		}
		
		if (conexiones.getLenght()==0) {
			pivot.printPila();
			System.out.println("imprimendo figura completa");
		}
		//Eliminar el elemento de la lista del pivot y poner el indice en 0
		return pivot;

	



	
	}
	
	public Linked_List conex_en_fig(Pila pila) {
		Linked_List<Linked_List> conex_de_fig =new Linked_List();
		String primer_elemento=(String) pila.peek();
		while (pila.len()!=1) {
			Linked_List<String> elem =new Linked_List();
			elem.append((String) pila.peek());
			System.out.println("añadiendo " +pila.peek());

			pila.pop();
			
			elem.append((String) pila.peek());
			System.out.println("añadiendo " +pila.peek());
			conex_de_fig.append(elem);
			System.out.println("añadiendo a la principal");
			elem.printList();

			
		}
		Linked_List<String> ultima =new Linked_List();
		ultima.append(primer_elemento);
		System.out.println(primer_elemento);
		ultima.append((String) pila.peek());
		System.out.println(pila.peek());

		conex_de_fig.append(ultima);
		
		conex_de_fig.printList();
		System.out.println("LISTA YA LISTA");
		return conex_de_fig;
	}
	

	
}