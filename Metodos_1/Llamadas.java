import java.util.Scanner;

public class Llamadas{
    public static void datos(){
        Scanner entrada = new Scanner(System.in);

        int o,s;
        long cel;
        double b;
        
        int slotCel1[] = new int[3];
        int slotCel2[] = new int[3];
        double slotCredito[] = new double[3];

        slotCel1 = new int[3];
        slotCel2 = new int[3];
        slotCredito = new double[3];

        igualarcon0(slotCel1,slotCel2,slotCredito);

        do{
            do{
                System.out.println("Ingrese el slot que va a utilizar");
                mostrar(slotCel1,slotCel2);
                s = entrada.nextInt();
                if((s>2)||(s<0)){
                    System.out.println("Ingrese un numero del 0 al 2");
                }
            }while((s>2)||(s<0));

            if((slotCel1[s]==0)||(slotCel2[s]==0)){
                do{
                    System.out.println("Ingrese su numero de celular");
                    cel = entrada.nextLong();
                    b = cel/1000000;
                    if((cel<1000000000)||(b>=10000)){
                        System.out.println("Ingrese un numero de 10 digitos");
                    }
                }while((cel<1000000000)||(b>=10000));
                slotCel1[s] = asignar1(cel);
                slotCel2[s] = asignar2(cel,slotCel1[s]);
            }
            
            System.out.println("Seleccione una opcion");
            System.out.println("1. Realizar llamada");
            System.out.println("2. Consultar credito");
            System.out.println("3. Cargar Credito");
            System.out.println("4. Salir");
            o = entrada.nextInt();

            switch(o){
                case 1:
                    if(slotCredito[s]<=0){
                        System.out.println("No tiene credito, porfavor cargue credito para poder llamar");
                    }else{
                        slotCredito[s] = caso1(slotCredito[s]);
                    }
                    break;
                
                case 2:
                    System.out.println("Su credito es: "+slotCredito[s]);
                    break;

                case 3:
                    slotCredito[s] = caso3(slotCredito[s]);
                    System.out.println("Se ha cargado con exito");
                    break;

                case 4:
                    System.out.println("Denada Vuelva Pronto");
                    break;

                default:
                    System.out.println("Porfavor ingrese un numero valido");
                    break;
            }
        }while(o!=4);
    }
    public static void igualarcon0(int slotcel1[], int slotcel2[], double slotcredito[]){
        int i;
        for(i=0;i<slotcel1.length;i++){
            slotcel1[i] = 0;
            slotcel2[i] = 0;
            slotcredito[i] = 0.0;
        }
    }
    public static void mostrar(int slotcel1[], int slotcel2[]){
        int i;
        for(i=0;i<slotcel1.length;i++){
            if((slotcel1[i]==0)&&(slotcel2[i]==0)){
                System.out.println(i+": No hay ningun numero guardado");
            }else{
                System.out.println(i+": "+slotcel1[i]+slotcel2[i]);
            }
        }
    }
    public static int asignar1(long Cel){
        int cel;
        cel = ((int)Math.floor(Cel/100000));
        return cel;
    }
    public static int asignar2(long Cel, int a){
        int cel;
        cel = ((int)Cel-a);
        cel = (cel/100000);
        return cel;
    }
    public static double caso1(double cre){
        Scanner entrada = new Scanner(System.in);

        int j;

        do{
            System.out.println("Escoja la llamada que desee realizar");
            System.out.println("1. Local");
            System.out.println("2. Internacional");
            System.out.println("3. Celular");
            System.out.println("4. Regresar");
            j = entrada.nextInt();

            switch(j){
                case 1:
                    cre -= 0.5;
                    break;

                case 2:
                    cre -= 0.6;
                    break;

                case 3:
                    cre -= 0.2;
                    break;
                
                case 4:
                    System.out.println("...");
                    break;

                default:
                    System.out.println("Ingrese un numero valido");
                    break;
            }
            if(cre<=0){
                System.out.println("Se ha quedado sin saldo");
            }
        }while((j!=4)&&(cre>0));

        return cre;
    }
    public static double caso3(double Cre){
        Scanner entrada = new Scanner(System.in);
        int credito;

        do{
            System.out.println("Ingrese el credito que quiera cargar");
            credito = entrada.nextInt();
            if(credito<0){
                System.out.println("No puede ingresar numeros negativos");
            }
        }while(credito<0);

        Cre = ((double)Cre+credito);

        return Cre;
    }
}