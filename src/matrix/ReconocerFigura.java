package matrix;

public class ReconocerFigura {
	 
	public ReconocerFigura() {
		
	}
        /**
         * metodo que busca dentro de la lista de conexiones hechas en el juego cuando esta una figura cerrada y devuelve los puntos de la figura cerrada
         * @param conexiones
         * @param linea 
         */

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
		System.out.println("Termin� el while");
		if (pivot.peek()==llegada) {
			System.out.println("termin�");
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
        /**
         * metodo que elimina las conexiones que estan ya bloqueadas de la lista de conexiones del juego, esto para evitar que a la hora de analizar si una figura esta cerrada o no, tome el camino de la figura nueva o no siga en el camino de una figura ya cerrada
         * @param listaconex
         * @param conexrep 
         */
        
        public void fuerajuego(Linked_List listaconex, Linked_List conexrep){
            Linked_List prueba = new Linked_List();
            if (prueba.contains(conexrep, listaconex)){
                listaconex.delete(listaconex, conexrep);
            }
            
        }
        
       /** public void bloquearborde(Linked_List listaconex){
            Linked_List prueba = new Linked_List();
                if(prueba.isequal(entrada, [A1,A2]){
                    listaconex.delete(listaconex, entrada)
                    }else{
                if(prueba.isequal(entrada, [A2,A3]){
                    listaconex.delete(listaconex, entrada)
                    }}else{
                if(prueba.isequal(entrada, [A3,A4]){
                    listaconex.delete(listaconex, entrada)
                    }}else{
                if(prueba.isequal(entrada, [A4,B4]){
                    listaconex.delete(listaconex, entrada)
                    }}else{
                if(prueba.isequal(entrada, [B4,C4]){
                    listaconex.delete(listaconex, entrada)
                    }}else{
                if(prueba.isequal(entrada, [C4,D4]){
                    listaconex.delete(listaconex, entrada)
                    }}else{
                if(prueba.isequal(entrada, [D4,D3]){
                    listaconex.delete(listaconex, entrada)
                    }}else{
                if(prueba.isequal(entrada, [D3,D2]){
                    listaconex.delete(listaconex, entrada)
                    }}else{
                if(prueba.isequal(entrada, [D1,D2]){
                    listaconex.delete(listaconex, entrada)
                    }}else{
                if(prueba.isequal(entrada, [A1,B1]){
                    listaconex.delete(listaconex, entrada)
                    }}else{
                if(prueba.isequal(entrada, [B1,C1]){
                    listaconex.delete(listaconex, entrada)
                    }}else{
                if(prueba.isequal(entrada, [C1,D1]){
                    listaconex.delete(listaconex, entrada)
                    }}
                return;
                    * 
                          
                       
        }
        /**/
}