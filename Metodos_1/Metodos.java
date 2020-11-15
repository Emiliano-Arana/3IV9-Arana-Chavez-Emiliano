import java.util.Scanner;

public class Metodos{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        Edad edad = new Edad();
        Figuras figuras = new Figuras();
        Llamadas llamadas = new Llamadas();

        int o,p;

        System.out.println("Bienvenido");

        do{
            System.out.println("Porfavor elija una opcion");
            System.out.println("1.- Calcular edad");
            System.out.println("2.- Calcular area y perimetro");
            System.out.println("3.- Calcular costo de llamadas telefonicas");
            System.out.println("4.- Salir");

            o = entrada.nextInt();

            switch(o){
                case 1:
                    do{
                        edad.ingresarDatos();
                        do{
                            System.out.println();
                            System.out.println("1. Repetir");
                            System.out.println("2. Menu");
                            p = entrada.nextInt();
                            if((p!=1)&&(p!=2)){
                                System.out.println();
                                System.out.println("Ingrese un numero valido");
                            }
                        }while((p!=1)&&(p!=2));
                    }while(p==1);
                    break;

                case 2:
                    figuras.eleccion();
                    break;

                case 3:
                    llamadas.datos();
                    break;
            }
        }while(o!=4);
    }
}