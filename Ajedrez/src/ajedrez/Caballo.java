
package ajedrez;

public class Caballo extends Pieza{

    public Caballo() {
    }

    public Caballo(String color, int valor) {
        super(color, valor);
    }

    public int[][] movimiento(int a, int b){
        int jugadas[][] = new int [8][2];
        jugadas[0][0] = a+2;
        jugadas[0][1] = b+1;
        jugadas[1][0] = a+1;
        jugadas[1][1] = b+2;
        jugadas[2][0] = a-1;
        jugadas[2][1] = b+2;
        jugadas[3][0] = a-2;
        jugadas[3][1] = b+1;
        jugadas[4][0] = a+2;
        jugadas[4][1] = b-1;
        jugadas[5][0] = a+1;
        jugadas[5][1] = b-2;
        jugadas[6][0] = a-1;
        jugadas[6][1] = b-2;
        jugadas[7][0] = a-2;
        jugadas[7][1] = b-1;
        return jugadas;
    }
}
