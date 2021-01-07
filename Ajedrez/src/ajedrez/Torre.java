
package ajedrez;

public class Torre extends Pieza{
    
    private int movidas = 0;

    public Torre(){
        
    }

    public Torre(String color, int valor) {
        super(color, valor);
    }

    public int getMovidas() {
        return movidas;
    }

    public void setMovidas(int movidas) {
        this.movidas = movidas;
    } 
    
    public int[][] movimientoA(int a,int b){
        int y=b,tam=0;
        do{
            y += 1;
            tam +=1;
        }while(y<=6);
        int mov[][] = new int[tam][2];
        for(int i=0;i<tam;i++){
            mov[i][0] = a;
            mov[i][1] = b+1;
            b += 1;
        }
        return mov;
    }
    
    public int[][] movimientoa(int a,int b){
        int y=b,tam=0;
        do{
            y -= 1;
            tam +=1;
        }while(y>=1);
        int mov[][] = new int[tam][2];
        for(int i=0;i<tam;i++){
            mov[i][0] = a;
            mov[i][1] = b-1;
            b -= 1;
        }
        return mov;
    }
    
    public int[][] movimientoI(int a,int b){
        int x=a,tam=0;
        do{
            x -= 1;
            tam +=1;
        }while(x>=1);
        int mov[][] = new int[tam][2];
        for(int i=0;i<tam;i++){
            mov[i][0] = a-1;
            mov[i][1] = b;
            a -= 1;
        }
        return mov;
    }
    
    public int[][] movimientoD(int a,int b){
        int x=a,tam=0;
        do{
            x += 1;
            tam +=1;
        }while(x<=6);
        int mov[][] = new int[tam][2];
        for(int i=0;i<tam;i++){
            mov[i][0] = a+1;
            mov[i][1] = b;
            a += 1;
        }
        return mov;
    }
}
