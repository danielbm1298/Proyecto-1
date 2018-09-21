
package proyecto;



public class Coordenates {
    
    int x;
    int y;
    Coordenates A1;
    Coordenates A2;
    Coordenates A3;
    Coordenates A4;
    Coordenates B1;
    Coordenates B2;
    Coordenates B3;
    Coordenates B4;
    Coordenates C1;
    Coordenates C2;
    Coordenates C3;
    Coordenates C4;
    Coordenates D1;
    Coordenates D2;
    Coordenates D3;
    Coordenates D4;
    
    public Coordenates (){
        this.x = 0;
        this.y = 0;
    }
    
    
    public Coordenates(int x, int y){
        
        this.x = x;
        this.y = y;
        this.A1 = new Coordenates(0,3);
        this.A2 = new Coordenates(1,3);
        this.A3 = new Coordenates(2,3);
        this.A4 = new Coordenates(3,3);
        this.B1 = new Coordenates(0,2);
        this.B2 = new Coordenates(1,2);
        this.B3 = new Coordenates(2,2);
        this.B4 = new Coordenates(3,2);
        this.C1 = new Coordenates(0,2);
        this.C2 = new Coordenates(1,1);
        this.C3 = new Coordenates(2,1);
        this.C4 = new Coordenates(3,1);
        this.D1 = new Coordenates(0,0);
        this.D2 = new Coordenates(1,0);
        this.D3 = new Coordenates(2,0);
        this.D4 = new Coordenates(3,0);
        
        
    }

    
    
    
    
    
    
    
    
}
