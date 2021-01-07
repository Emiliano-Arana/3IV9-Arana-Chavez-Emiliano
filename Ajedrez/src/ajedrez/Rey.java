
package ajedrez;


public class Rey extends Pieza{
    private int movidas = 0;

    public Rey(){
        
    }

    public Rey(String color, int valor) {
        super(color, valor);
    }

    public int getMovidas() {
        return movidas;
    }

    public void setMovidas(int movidas) {
        this.movidas = movidas;
    } 
    
    public int[][] movimiento(int a, int b){
        int mov[][] = new int[8][2];
        mov[0][0] = a;
        mov[0][1] = b+1;
        mov[1][0] = a+1;
        mov[1][1] = b+1;
        mov[2][0] = a+1;
        mov[2][1] = b;
        mov[3][0] = a+1;
        mov[3][1] = b-1;
        mov[4][0] = a;
        mov[4][1] = b-1;
        mov[5][0] = a-1;
        mov[5][1] = b-1;
        mov[6][0] = a-1;
        mov[6][1] = b;
        mov[7][0] = a-1;
        mov[7][1] = b+1;
        return mov;
    }
}
