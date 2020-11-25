import java.util.Scanner;

public class Empleados{
    public static void empleados(){
        DatosEmpleados empleados = new DatosEmpleados();
        DatosSupervisores supervisores = new DatosSupervisores();
        OperacionesE op = new OperacionesE();
        Scanner entrada = new Scanner(System.in);

        int ID,HN,HD;
        String nombre, puesto, p;
        double sueldo;

        try{
            do{
                //entrada de datos
                System.out.println("Ingrese el ID");
                ID = entrada.nextInt();
                entrada.nextLine();
                System.out.println("Ingrese su nombre");
                nombre = entrada.nextLine();
                System.out.println("Ingrese su puesto");
                puesto = entrada.next();
                puesto = op.text(puesto);

                //segun la opcion seleccionada pasa algo diferente
                switch(ID){
                     case 0:
                        p = empleados.getPuesto();
                        if(puesto.equals(p)){
                            do{
                                System.out.println("Ingrese la cantidad de horas extras nocturnas que ha trabajado");
                                HN = entrada.nextInt();
                                System.out.println("Ingrese la cantidad de horas extras diurnas que ha trabajado");
                                HD = entrada.nextInt();
                                if(HN<0 || HD<0){
                                    System.out.println("No aceptan numeros negativos");
                                }
                            }while(HN<0 || HD<0);
                            sueldo = op.Empleados(HN,HD,empleados.getQuincenal());
                            System.out.println("Su sueldo es de $"+sueldo+" quincenales");
                        }else{
                            System.out.println("El ID y el puesto no coinciden");
                        }
                        break;
                        
                    case 1:
                        p = supervisores.getPuesto();
                        if(puesto.equals(p)){
                            sueldo = op.Supervisores(supervisores.getQuincenal());
                            System.out.println("Su sueldo es de $"+sueldo+" quincenales");
                        }else{
                            System.out.println("El ID y el puesto no coinciden");
                        }
                        break;

                    default:
                        System.out.println("ID no valido");
                        break;
                }
            }while(ID!=0 && ID!=1);              
        }catch(Exception e){
            System.out.println("Ingrese solo numeros enteros en donde es necesario");
        }       
    }
}