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
				return;
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

	



	
	}
}