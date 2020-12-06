
package pizzeriamamamia;

import Pizza.*;
import java.util.Scanner;

public class Menu {
    public void MenuOperaciones(){
        Scanner entrada = new Scanner(System.in);
        int op=0,cant,total=0,tam;
        int precios[] = new int[16];
        String que;
        
        precios[0] = 75;
        precios[1] = 89;
        precios[2] = 112;
        precios[3] = 135;
        precios[4] = 89;
        precios[5] = 115;
        precios[6] = 135;
        precios[7] = 175;
        precios[8] = 96;
        precios[9] = 119;
        precios[10] = 131;
        precios[11] = 167;
        precios[12] = 88;
        precios[13] = 97;
        precios[14] = 111;
        precios[15] = 157;
        
        do{
            do{
                System.out.println("Bienvenidos a la Pizzeria Los Tacos");
                System.out.println("¿Cuantas pizzas va a ordenar?");
                cant = entrada.nextInt();
                if(cant<1){
                    System.out.println("Porfavor ingrese un numero positivo");
                }
            }while(cant<1);
            Pizza piza[] = new Pizza[cant];
            
            for(int i=0;i<cant;i++){
                
                do{
                    System.out.println("¿Que desea ordenar?");
                    System.out.println("1.- Pizza de Queso");
                    System.out.println("2.- Pizza de Peperoni");
                    System.out.println("3.- Pizza de Vegetariana");
                    op = entrada.nextInt();
                    if(op<1||op>3){
                        System.out.println("Ingrese un numero valido");
                    }
                }while(op<1||op>3);
                
                do{
                    System.out.println("¿De que tamano?");
                    System.out.println("1.- Chico");
                    System.out.println("2.- Mediano");
                    System.out.println("3.- Grande");
                    System.out.println("4.- Familiar");
                    tam = entrada.nextInt();
                    if(tam<1||tam>4){
                        System.out.println("Ingrese un numero valido");
                    }
                }while(tam<1||tam>4);
                
                switch(op){
                    case 1:
                        piza[i] = new Queso();
                        Queso ques = new Queso("masa", null, null);
                        
                        que = ques.elegirtipoqueso();
                        piza[i].hornear();
                        piza[i].cortar(tam);
                        piza[i].empacar();
                        if(que.equals("Mozzarela")){
                            total += precios[tam-1];
                        }else{
                            total += precios[tam+3];
                        }
                        break;
                    case 2:                    
                        piza[i] = new Peperonni();
                        piza[i].hornear();
                        piza[i].cortar(tam);
                        piza[i].empacar();
                        total += precios[tam+7];
                        break;
                    case 3:
                        piza[i] = new Vegetariana();
                        piza[i].hornear();
                        piza[i].cortar(tam);
                        piza[i].empacar();
                        total += precios[tam+11];
                        break;
                    default:
                        System.out.println("Porfavor ingrese un numero valido");
                        break;
                }
            }
            System.out.println("El total a pagar es de $"+total);
            System.exit(0);
        }while(op != 4);
    }
}
