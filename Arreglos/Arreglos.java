import java.util.Scanner;

public class Arreglos{
    public static void main (String[] args){
        Scanner entrada = new Scanner(System.in);
        int n;
        Arreglos Arrays = new Arreglos();

        do{
            System.out.println("Ingrese un numero para ejecutar un programa");
            System.out.println("1.- Promedio positivos y negativos");
            System.out.println("2.- Promedio posiciones pares");
            System.out.println("3.- Promedio calificaciones");
            System.out.println("4.- Suma de matrices");
            System.out.println("5.- Salir");
            n = entrada.nextInt();

            switch (n) {
                case 1:
                    Arrays.ValoresPromedio();
                    break;
                
                case 2:
                    Arrays.Pares();
                    break;

                case 3:
                    Arrays.Calificaciones();
                    break;

                case 4:
                    Arrays.Suma();
                    break;

                case 5:
                    System.out.println("Denada vuelva pronto");
                    break;

                default:
                    System.out.println("Porfavor Ingrese un valor valido");
                    break;
            }
        }while(n!=5);
    }

    public void ValoresPromedio(){
        Scanner entrada = new Scanner(System.in);

        int ar[] = new int[10];
        float neg,pos;
        float countN,countP;
        int i,cero;
        float proN,proP;

        do{
            countN = 0;
            countP = 0;
            cero = 0;
            neg = 0;
            pos = 0;

            for(int j=0; j<ar.length; j++){
                System.out.println("Ingresa el valor de la columna "+j);
                ar[j] = entrada.nextInt();
                if(ar[j]==0){
                    cero += 1;
                }else{
                    if(ar[j]<0){
                        neg += ar[j];
                        countN += 1;
                    }else{
                        pos += ar[j];
                        countP += 1;
                    }
                }
            }

            proP = pos/countP;
            proN = neg/countN;

            if((countP==0)&&(countN!=0)){
                System.out.println("No se ingresaron numeros positivos");
                System.out.println("El promedio de los negativos es de: "+proN);
                System.out.println("La cantidad de ceros es de: "+cero);
            }
            if((countN==0)&&(countP!=0)){
                System.out.println("El promedio de los positivos es de: "+proP);
                System.out.println("No se ingresaron numeros negativos");
                System.out.println("La cantidad de ceros es de: "+cero);
            }
            if((countN==0)&&(countP==0)){
                System.out.println("No se ingresaron numeros positivos");
                System.out.println("No se ingresaron numeros negativos");
                System.out.println("La cantidad de ceros es de: "+cero);
            }
            if((countN!=0)&&(countP!=0)){
                System.out.println("El promedio de los positivos es de: "+proP);
                System.out.println("El promedio de los negativos es de: "+proN);
                System.out.println("La cantidad de ceros es de: "+cero);
            }

            do{
                System.out.println();
                System.out.println("Deseas repetir?");
                System.out.println("1.- Repetir");
                System.out.println("2.- Volver al menu principal");
                i = entrada.nextInt();
                if((i!=1)&&(i!=2)){
                    System.out.println("Ingresa un numero valido");
                }
            }while((i!=1)&&(i!=2));

        }while(i==1);
    }
    public void Pares(){

        Scanner entrada = new Scanner(System.in);
        int ar[] = new int[10];
        int i;
        float sum,count,total;

        do{
            sum = 0;
            count = 0;

            for(int j=0; j<ar.length; j++){
                System.out.println("Ingresa el valor de la columna "+j);
                ar[j] = entrada.nextInt();

                if(j==0){
                    sum += ar[j];
                    count += 1;
                }else{
                    if(j%2==0){
                        sum += ar[j];
                        count += 1;
                    }
                }
            }

            total = sum/count;

            System.out.println("El promedio de las posiciones pares del arreglo es: "+total);

            do{
                System.out.println();
                System.out.println("Deseas repetir?");
                System.out.println("1.- Repetir");
                System.out.println("2.- Volver al menu principal");
                i = entrada.nextInt();
                if((i!=1)&&(i!=2)){
                    System.out.println("Ingresa un numero valido");
                }
            }while((i!=1)&&(i!=2));

        }while(i==1);
    }
    public void Calificaciones(){

        Scanner entrada = new Scanner(System.in);
        float ar[] = new float[10];
        int i;
        float sum,high,low;
        int sup,Pass,NoPass;

        do{
            sum = 0;
            high = 0;
            low = 0;

            for(int j=0; j<ar.length; j++){
                do{
                    System.out.println("Ingresa la calificacion numero "+(j+1));
                    ar[j] = entrada.nextInt();
                    if((ar[j]<0)||(ar[j]>10)){
                        System.out.println("Ingresa un valor del 0 al 10");
                    }
                }while((ar[j]<0)||(ar[j]>10));
                sum += ar[j];
                if(j==0){
                    high = ar[j];
                    low = ar[j];
                }else{
                    if(ar[j]>high){
                        high = ar[j];
                    }
                    if(ar[j]<low){
                        low = ar[j];
                    }
                }
                        
            }
            sum = sum/10;
            sup = 0;
            Pass = 0;
            NoPass = 0;
            System.out.println("Las calificaciones son las siguientes:");
            for(int j=0; j<ar.length; j++){                       
                System.out.println(ar[j]);
                if(ar[j]>sum){
                    sup += 1;
                }
                if(ar[j]>=6){
                    Pass += 1;
                }else{
                    NoPass += 1;
                }
            }
            System.out.println("El promedio es de: "+sum);
            System.out.println("La calificacion mas alta fue de: "+high);
            System.out.println("La calificacion mas baja fue de: "+low);
            System.out.println("El numero de calificaciones superiores al promedio fue de: "+sup);
            System.out.println("Alumnos aprobados: "+Pass);
            System.out.println("Alumnos reprobados: "+NoPass);

            do{
                System.out.println();
                System.out.println("Deseas repetir?");
                System.out.println("1.- Repetir");
                System.out.println("2.- Volver al menu principal");
                i = entrada.nextInt();
                if((i!=1)&&(i!=2)){
                    System.out.println("Ingresa un numero valido");
                }
            }while((i!=1)&&(i!=2));
        }while(i==1);
    }
    public void Suma(){

        Scanner entrada = new Scanner(System.in);
        double matrizA[][] = new double[3][3];
        double matrizB[][] = new double[3][3];
        double matrizS[][] = new double[3][3];
        int i;

        do{
            System.out.println("Ingrese los valores de la matriz A");
            System.out.println();
            for(int j=0; j<matrizA.length; j++){
                for(int k=0; k<matrizA.length; k++){
                    System.out.println("Ingresa el valor de la columna "+j+" fila "+k);
                    matrizA[j][k] = entrada.nextDouble();
                }               
            }

            System.out.println("Ingrese los valores de la matriz B");
            System.out.println();
            for(int j=0; j<matrizB.length; j++){
                for(int k=0; k<matrizB.length; k++){
                    System.out.println("Ingresa el valor de la columna "+j+" fila "+k);
                    matrizB[j][k] = entrada.nextDouble();
                }               
            }

            System.out.println("Suma en matriz S:");
            for(int j=0; j<matrizS.length; j++){
                for(int k=0; k<matrizS.length; k++){
                    System.out.println("Columna "+j+" fila "+k+": ");
                    matrizS[j][k] = matrizA[j][k] + matrizB[j][k];
                    System.out.println(matrizS[j][k]);
                }               
            }
            do{
                System.out.println();
                System.out.println("Deseas repetir?");
                System.out.println("1.- Repetir");
                System.out.println("2.- Volver al menu principal");
                i = entrada.nextInt();
                if((i!=1)&&(i!=2)){
                    System.out.println("Ingresa un numero valido");
                }
            }while((i!=1)&&(i!=2));
        }while(i==1);
    }
}