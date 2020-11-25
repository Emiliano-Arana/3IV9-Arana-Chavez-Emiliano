import java.util.Scanner;

public class Menu{
    public static void menu(){
        Scanner entrada = new Scanner(System.in);
        Empleados empleados = new Empleados();
        Proveedores proveedores = new Proveedores();
        Biblioteca biblioteca = new Biblioteca();
        int o;

        try{
            //menu
            System.out.println("Elija una opcion");
            System.out.println("1.- Calcular salario");
            System.out.println("2.- Proveedores");
            System.out.println("3.- Biblioteca");
            System.out.println("4.- Salir");
            o = entrada.nextInt();

            switch (o) {
                case 1:
                    empleados.empleados(); 
                    break;

                case 2:
                    proveedores.proveedores();
                    break;

                case 3:
                    biblioteca.biblioteca();
                    break;

                case 4:
                    //caso salida
                    System.out.println("Deneda vuelva pronto");
                    System.exit(0);
                break;
                
                default:
                    System.out.println("Ingrese un numero valido");
                    break;
            }
        }catch(Exception e){
            System.out.println("Ingrese solo numeros enteros");
        }
    }
}