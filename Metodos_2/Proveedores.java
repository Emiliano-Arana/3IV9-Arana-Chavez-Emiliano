import java.util.Scanner;

public class Proveedores{
    public String nombre;
    String producto[] = new String[10];
    int costo[] = new int[10];
    int cantidad[] = new int[10];

    public void proveedores(){
        Scanner entrada = new Scanner(System.in);
        OperacionesP op = new OperacionesP();
        int i,ST,M,m,T;
        double P;

        try{
            System.out.println("Ingrese el nombre del proveedor");
            nombre = entrada.nextLine();

            for(i=0;i<producto.length;i++){
                System.out.println("Ingrese el nombre del producto "+(i+1));
                producto[i] = entrada.nextLine();
            }
            for(i=0;i<costo.length;i++){
                do{
                    System.out.println("Ingrese el precio del producto "+(i+1));
                    costo[i] = entrada.nextInt();
                    if(costo[i]<0){
                        System.out.println("No se aceptan numeros negativos");
                    }
                }while(costo[i]<0);
            }
            for(i=0;i<cantidad.length;i++){
                do{
                    System.out.println("Ingrese la cantidad de producto existente del producto "+(i+1));
                    cantidad[i] = entrada.nextInt();
                    if(cantidad[i]<0){
                        System.out.println("No se aceptan numeros negativos");
                    }
                }while(cantidad[i]<0);
            }

            //vaiables de resultados de operaciones

            ST = op.SumaTotal(costo);
            M = op.CostoMayor(costo);
            m = op.CostoMenor(costo);
            P = op.Promedio(costo);
            T = op.TotalP(costo,cantidad);

            System.out.println("Nombre del proveedor: "+nombre);
            for(i=0;i<costo.length;i++){
                System.out.println("Producto: "+producto[i]+" cantidad: "+cantidad[i]+" costo: "+costo[i]);
            }
            System.out.println("Suma Total: "+ST);
            System.out.println("Costo Mayor: "+M);
            System.out.println("Costo Menor: "+m);
            System.out.println("Promedio: "+P);
            System.out.println("Total: "+T);
        }catch(Exception e){
            System.out.println("Error, valor no valido");
        }
    }
}