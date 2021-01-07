
package ajedrez;

public class Peon extends Pieza{
    
    private int movidas;

    public Peon(){
        movidas = 0;
    }

    public Peon(String color, int valor) {
        super(color, valor);
    }

    public int getMovidas() {
        return movidas;
    }

    public void setMovidas(int movidas) {
        this.movidas = movidas;
    } 
    
    public int[][] movimiento(int a, int b, boolean t){
        if(t){
            if(movidas==0){
                int jugadas[][] = new int[4][2];
                jugadas[0][0] = a;
                jugadas[0][1] = b+1;
                jugadas[1][0] = a;
                jugadas[1][1] = b+2;
                jugadas[2][0] = a+1;
                jugadas[2][1] = b+1;
                jugadas[3][0] = a-1;
                jugadas[3][1] = b+1;
                movidas += 1;
                return jugadas;
            }else{
                int jugadas[][] = new int[3][2];
                jugadas[0][0] = a;
                jugadas[0][1] = b+1;
                jugadas[1][0] = a+1;
                jugadas[1][1] = b+1;
                jugadas[2][0] = a-1;
                jugadas[2][1] = b+1;
                movidas += 1;
                return jugadas;
            }
        }else{
            if(movidas==0){
                int jugadas[][] = new int[2][2];
                jugadas[0][0] = a;
                jugadas[0][1] = b+1;
                jugadas[1][0] = a;
                jugadas[1][1] = b+2;
                movidas += 1;
                return jugadas;
            }else{
                int jugadas[][] = new int[1][2];
                jugadas[0][0] = a;
                jugadas[0][1] = b+2;
                movidas += 1;
                return jugadas;
            }
        }
    }
}
