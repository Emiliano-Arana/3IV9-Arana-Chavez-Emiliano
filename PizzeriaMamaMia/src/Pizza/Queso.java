
package Pizza;

import java.util.Scanner;

public class Queso extends Pizza{
    
    public Queso() {
    }

    public Queso(String masa, String[] salsa, String[] ingredientes) {
        super(masa, salsa, ingredientes);
        this.ingredientes = new String[2];
        this.ingredientes[0] = "Parmesano";
        this.ingredientes[1] = "Mozzarela";
    }
    
    public String elegirtipoqueso(){
        Scanner entrada = new Scanner(System.in);       
        int t;
        String queso;
        
        do{
            System.out.println("Elija el queso que deseas");
            System.out.println("1.- Parmesano");
            System.out.println("2.- Mozzarela");
            t = entrada.nextInt();
            if(t!=1&&t!=2){
                System.out.println("Ingrese un numero valido");
            }
        }while(t!=1&&t!=2);
        return ingredientes[t-1];
    }
}
