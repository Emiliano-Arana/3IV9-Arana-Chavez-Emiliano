
package Pizza;

import java.util.Scanner;

public class Vegetariana extends Pizza{
    
    public Vegetariana() {
    }

    public Vegetariana(String masa, String[] salsa, String[] ingredientes) {
        super(masa, salsa, ingredientes);
        this.ingredientes = new String[4];
        this.ingredientes[0] = "Champiñones";
        this.ingredientes[1] = "Piña";
        this.ingredientes[2] = "Pimiento";
        this.ingredientes[3] = "Elote";       
    }
    
    public String elegirtipoqueso(){
        Scanner entrada = new Scanner(System.in);
        
        int t;
        String ing;
        
        do{
            System.out.println("Elija los ingredientes que deseas");
            System.out.println("1.- Champiñones");
            System.out.println("2.- Piña");
            System.out.println("3.- Pimiento");
            System.out.println("4.- Elote");
            t = entrada.nextInt();
            if(t!=1&&t!=2){
                System.out.println("Ingrese un numero valido");
            }
        }while(t!=1&&t!=2);
        ing = ingredientes[(t-1)];
        return ing;
    }
}
