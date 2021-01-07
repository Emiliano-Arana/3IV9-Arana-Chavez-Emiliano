
package ajedrez;

public class Alfil extends Pieza{

    public Alfil() {
    }

    public Alfil(String color, int valor) {
        super(color, valor);
    }
    
    public int[][] movimientoDA(int a, int b){
        int x=a,y=b,tam=0;
        do{
            x += 1;
            y += 1;
            tam +=1;
        }while(x<=6&&y<=6);
        int mov[][] = new int[tam][2];
        for(int i=0;i<tam;i++){
            mov[i][0] = a+1;
            mov[i][1] = b+1;
            a += 1;
            b += 1;
        }
        return mov;
    }
    
    public int[][] movimientoDa(int a, int b){
        int x=a,y=b,tam=0;
        do{
            x -= 1;
            y += 1;
            tam +=1;
        }while(x>=1&&y<=6);
        int mov[][] = new int[tam][2];
        for(int i=0;i<tam;i++){
            mov[i][0] = a-1;
            mov[i][1] = b+1;
            a -= 1;
            b += 1;
        }
        return mov;
    }
    
    public int[][] movimientoIA(int a, int b){
        int x=a,y=b,tam=0;
        do{
            x += 1;
            y -= 1;
            tam +=1;
        }while(x<=6&&y>=1);
        int mov[][] = new int[tam][2];
        for(int i=0;i<tam;i++){
            mov[i][0] = a+1;
            mov[i][1] = b-1;
            a += 1;
            b -= 1;
        }
        return mov;
    }
    
    public int[][] movimientoIa(int a, int b){
        int x=a,y=b,tam=0;
        do{
            x -= 1;
            y -= 1;
            tam +=1;
        }while(x>=1&&y>=1);
        int mov[][] = new int[tam][2];
        for(int i=0;i<tam;i++){
            mov[i][0] = a-1;
            mov[i][1] = b-1;
            a -= 1;
            b -= 1;
        }
        return mov;
    }
}
