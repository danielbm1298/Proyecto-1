/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

/**
 *
 * @author gewat
 */
public class Node extends Coordenates {
    
    Node next;

    
    Node previous;
    
    Coordenates conección;
    
    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getPrevious() {
        return previous;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }

    public Coordenates getConección() {
        return conección;
    }

    public void setConección(Coordenates conección) {
        this.conección = conección;
    }
    
    
}
