
package Pizza;

import java.util.Scanner;

public class Peperonni extends Pizza{
    
    public Peperonni() {
    }

    public Peperonni(String masa, String[] salsa, String[] ingredientes) {
        super(masa, salsa, ingredientes);
        this.ingredientes = new String[4];
        this.ingredientes[0] = "Rodajas";
        this.ingredientes[1] = "Rodajas con Parmesano";
        this.ingredientes[2] = "Rodajas y Albaca";
        this.ingredientes[3] = "Doble Peperoni en Rodajas";      
    }
    
    public String elegiringredientes(){
        Scanner entrada = new Scanner(System.in);
        
        int t;
        String ing;
        
        do{
            System.out.println("Elija los ingredientes que deseas");
            System.out.println("1.- Rodajas");
            System.out.println("2.- Rodajas con Parmesano");
            System.out.println("3.- Rodajas y Albaca");
            System.out.println("4.- Doble Peperoni en Rodajas");
            t = entrada.nextInt();
            if(t<1||t>4){
                System.out.println("Ingrese un numero valido");
            }
        }while(t<1||t>4);
        ing = ingredientes[(t-1)];
        return ing;
    }
}