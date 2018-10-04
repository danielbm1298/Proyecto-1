package matrix;

public class ReconocerFigura {
	 
	public ReconocerFigura() {
		
	}
/**
 * a Buscar le ingresan dos listas donde la primera son todas las conexiones ya cerradas y la segunda el la ultima
 * conexion realizada por un client, la funcion busca una linea de puntos hasta encontrar al primer elemento y 
 * el ultimo
 * @param conexiones
 * @param linea
 * @return retorna una pila con todos los puntos que corresponden a la figua cerrada o 
 * su no hay figura cerrada devuelve una pila con la conexion que se realizo para luego enviarselo al cliente
 */
	public Pila buscar(Linked_List<Linked_List> conexiones,Linked_List<String> linea) {
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
				System.out.println("termino ");
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
		System.out.println("Termina el while");
		if (pivot.peek()!=llegada) {
			System.out.println("no hay ninguna figura");
			Pila co_inicial =new Pila();
			co_inicial.push(primer_pivot);
			co_inicial.push(llegada);
			return co_inicial;
			

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
		
			
	
		

	



	
	
	/**
	 * funcion que convierte la pila de puntos de una figura en una lista con conexiones para luego compararlas
	 * y descartar las que no se deben analizar
	 * @param pila
	 * @return retorna una lista con listas
	 */
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
	
/**
 * funcion que le ingresa una pila devuelve un string con los elementos de la pila
 * @param pila
 * @return retorna un string con los elementos de esa pila separados por coma
 */
	public String convertir_a_string(Pila pila) {
		String figura_para_graficar="";

		while(pila.len!=1) {
			figura_para_graficar=figura_para_graficar+pila.peek()+",";
			pila.pop();	
		}
		figura_para_graficar=figura_para_graficar+pila.peek();
		return figura_para_graficar;

		
	}

}