package matrix;

public class ReconocerFigura {
	 
	public ReconocerFigura() {
		
	}

	public void buscar(Linked_List conexiones,Linked_List linea) {
		Pila pivot=new Pila();
		String llegada =(String) linea.getNode(1).getData();
		pivot.push(linea.getNode(0).getData());
		int indice_lista= 0;
		Linked_List seleccionado =(Linked_List) conexiones.getNode(indice_lista).getData();
		
		while (conexiones.getLenght()!=indice_lista) {
		if (seleccionado.getNode(0).getData()==pivot.pop()) { //si el elemento 1 es igual al pivot:
			pivot.push(seleccionado.getNode(1).getData());//agrega el otro elemento como pivot
			indice_lista=0;
			//borrar de la lista 
			conexiones.delete(indice_lista);
			break;
		}
		if (seleccionado.getNode(1).getData()==pivot.pop()) {//si el elemento 2 es igual al pivot:
			pivot.push(seleccionado.getNode(0).getData()); //agrega el otro elemento como pivot
			indice_lista=0;
			//borrar de la lista 
			conexiones.delete(indice_lista);
			indice_lista=0;
			break;
		}
		indice_lista+=1;

		}
		if (conexiones.getLenght()==0) {
		}
		//Eliminar el elemento de la lista del pivot y poner el indice en 0
		pivot.pop();
		indice_lista=0;
		pivot.printPila();
		
	}
}