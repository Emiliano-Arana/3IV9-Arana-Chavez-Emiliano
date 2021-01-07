
package ajedrez;

public class Reina extends Pieza{

    public Reina() {
    }

    public Reina(String color, int valor) {
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
