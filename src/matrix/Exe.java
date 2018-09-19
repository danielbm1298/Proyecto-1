package matrix;

public class Exe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Linked_List<Linked_List> listaprincipal = new Linked_List();
		Linked_List<Integer> fila1 = new Linked_List();
		fila1.append(0);
		fila1.append(1);
		fila1.append(2);
		listaprincipal.append(fila1);
		for(int m = 0 ; m < listaprincipal.getLenght()-1;m++) {
			for(int n = 0; n < listaprincipal.getNode(m).getData().getLenght()-1;n++) {
				System.out.println(listaprincipal.getNode(m).getData().getNode(n).getData());
			}
		}
		
		
	}

}
