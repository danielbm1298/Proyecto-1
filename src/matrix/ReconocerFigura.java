package matrix;

public class ReconocerFigura {
	 
	public ReconocerFigura() {
		
	}

	public void buscar(Linked_List<Linked_List> conexiones,Linked_List<String> linea) {
		Pila pivot=new Pila();
		String llegada =(String) linea.getNode(1).getData();
		String primer_pivot = new String();
		primer_pivot =linea.getNode(0).getData();
		pivot.push(primer_pivot);
		pivot.push("otras");
		pivot.push("asdf");
		System.out.println(pivot.peek());
		

		int indice_lista= 0;
		Linked_List<Linked_List> seleccionado =(Linked_List) conexiones.getNode(indice_lista).getData();
		System.out.println("seleccionado1 "+seleccionado.getNode(0).getData());
		System.out.println("seleccionado2 "+seleccionado.getNode(1).getData());
		System.out.println(conexiones.getLenght());
		
		while (conexiones.getLenght()!=indice_lista) {
			System.out.println("ahora la lista tiene"+conexiones.getLenght());

		if (seleccionado.getNode(0).getData()==pivot.pop()) { //si el elemento 1 es igual al pivot:
			pivot.push(seleccionado.getNode(1).getData());//agrega el otro elemento como pivot
			indice_lista=0;
			//borrar de la lista 
			conexiones.delete(indice_lista);
			System.out.println("ahora la lista tiene"+conexiones.getLenght());
			break;
		}
		if (seleccionado.getNode(1).getData()==pivot.pop()) {//si el elemento 2 es igual al pivot:
			pivot.push(seleccionado.getNode(0).getData()); //agrega el otro elemento como pivot
			indice_lista=0;
			//borrar de la lista 
			conexiones.delete(indice_lista);
			System.out.println("ahora la lista tiene"+conexiones.getLenght());
			indice_lista=0;
			break;
		}
		System.out.println("ningun elemento se relaciona, se busca el siguiente");
		indice_lista++;

		}
		System.out.println("Terminó el guail");
		
		if (conexiones.getLenght()==0) {
			pivot.printPila();
			System.out.println("imprimendo figura completa");
		}
		//Eliminar el elemento de la lista del pivot y poner el indice en 0
		pivot.pop();
		indice_lista=0;


	
	}
}