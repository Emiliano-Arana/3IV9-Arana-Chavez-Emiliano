import java.util.Scanner;

public class Edad{
    public static void ingresarDatos(){
        Scanner entrada = new Scanner(System.in);

        int diaN,mesN,anioN;
        int diaA,mesA,anioA;
        int Edad;

        do{
            System.out.println("Ingrese el anio de su nacimiento");
            anioN = entrada.nextInt();
            if(anioN<1500){
                System.out.println("Ingrese un numero mayor a 1499");
                System.out.println();
            }
        }while(anioN<1500);

        do{
            System.out.println("Ingrese numero del mes de su nacimiento");
            mesN = entrada.nextInt();
            if((mesN<1)||(mesN>12)){
                System.out.println("Ingrese un numero del 1 al 12");
                System.out.println();
            }
        }while((mesN<1)||(mesN>12));

        if(anioN%4==0){
            if((mesN==1)||(mesN==3)||(mesN==5)||(mesN==7)||(mesN==8)||(mesN==10)||(mesN==12)){
                do{
                    System.out.println("Ingrese el dia de su nacimiento");
                    diaN = entrada.nextInt();
                    if((diaN<1)||(diaN>31)){
                        System.out.println("Ingrese un numero del 1 al 31");
                        System.out.println();
                    }
                }while((diaN<1)||(diaN>31));
            }else{
                if(mesN==2){
                    do{
                        System.out.println("Ingrese el dia de su nacimiento");
                        diaN = entrada.nextInt();
                        if((diaN<1)||(diaN>29)){
                            System.out.println("Ingrese un numero del 1 al 29");
                            System.out.println();
                        }
                    }while((diaN<1)||(diaN>29));
                }else{
                    do{
                        System.out.println("Ingrese el dia de su nacimiento");
                        diaN = entrada.nextInt();
                        if((diaN<1)||(diaN>30)){
                            System.out.println("Ingrese un numero del 1 al 30");
                            System.out.println();
                        }
                    }while((diaN<1)||(diaN>30));
                }
            }
        }else{
            if((mesN==1)||(mesN==3)||(mesN==5)||(mesN==7)||(mesN==8)||(mesN==10)||(mesN==12)){
                do{
                    System.out.println("Ingrese el dia de su nacimiento");
                    diaN = entrada.nextInt();
                    if((diaN<1)||(diaN>31)){
                        System.out.println("Ingrese un numero del 1 al 31");
                        System.out.println();
                    }
                }while((diaN<1)||(diaN>31));
            }else{
                if(mesN==2){
                    do{
                        System.out.println("Ingrese el dia de su nacimiento");
                        diaN = entrada.nextInt();
                        if((diaN<1)||(diaN>28)){
                            System.out.println("Ingrese un numero del 1 al 29");
                            System.out.println();
                        }
                    }while((diaN<1)||(diaN>28));
                }else{
                    do{
                        System.out.println("Ingrese el dia de su nacimiento");
                        diaN = entrada.nextInt();
                        if((diaN<1)||(diaN>30)){
                            System.out.println("Ingrese un numero del 1 al 30");
                            System.out.println();
                        }
                    }while((diaN<1)||(diaN>30));
                }
            }
        }

        do{
            System.out.println("Ingrese el anio actual");
            anioA = entrada.nextInt();
            if(anioA<1500){
                System.out.println("Ingrese un numero mayor a 1499");
                System.out.println();
            }
        }while(anioA<1500);

        do{
            System.out.println("Ingrese numero del mes actual");
            mesA = entrada.nextInt();
            if((mesA<1)||(mesA>12)){
                System.out.println("Ingrese un numero del 1 al 12");
                System.out.println();
            }
        }while((mesA<1)||(mesA>12));

        if(anioA%4==0){
            if((mesA==1)||(mesA==3)||(mesA==5)||(mesA==7)||(mesA==8)||(mesA==10)||(mesA==12)){
                do{
                    System.out.println("Ingrese el dia actual");
                    diaA = entrada.nextInt();
                    if((diaA<1)||(diaA>31)){
                        System.out.println("Ingrese un numero del 1 al 31");
                        System.out.println();
                    }
                }while((diaA<1)||(diaA>31));
            }else{
                if(mesA==2){
                    do{
                        System.out.println("Ingrese el dia actual");
                        diaA = entrada.nextInt();
                        if((diaA<1)||(diaA>29)){
                            System.out.println("Ingrese un numero del 1 al 29");
                            System.out.println();
                        }
                    }while((diaA<1)||(diaA>29));
                }else{
                    do{
                        System.out.println("Ingrese el dia actual");
                        diaA = entrada.nextInt();
                        if((diaA<1)||(diaA>30)){
                            System.out.println("Ingrese un numero del 1 al 30");
                            System.out.println();
                        }
                    }while((diaA<1)||(diaA>30));
                }
            }
        }else{
            if((mesA==1)||(mesA==3)||(mesA==5)||(mesA==7)||(mesA==8)||(mesA==10)||(mesA==12)){
                do{
                    System.out.println("Ingrese el dia actual");
                    diaA = entrada.nextInt();
                    if((diaA<1)||(diaA>31)){
                        System.out.println("Ingrese un numero del 1 al 31");
                        System.out.println();
                    }
                }while((diaA<1)||(diaA>31));
            }else{
                if(mesA==2){
                    do{
                        System.out.println("Ingrese el dia actual");
                        diaA = entrada.nextInt();
                        if((diaA<1)||(diaA>28)){
                            System.out.println("Ingrese un numero del 1 al 29");
                            System.out.println();
                        }
                    }while((diaA<1)||(diaA>28));
                }else{
                    do{
                        System.out.println("Ingrese el dia actual");
                        diaA = entrada.nextInt();
                        if((diaA<1)||(diaA>30)){
                            System.out.println("Ingrese un numero del 1 al 30");
                            System.out.println();
                        }
                    }while((diaA<1)||(diaA>30));
                }
            }
        }

        Edad = calcularEdad(diaN,mesN,anioN,diaA,mesA,anioA);

        System.out.println("Usted tiene "+Edad+" anios");
    }
    public static int calcularEdad(int dian, int mesn, int anion, int diaa, int mesa, int anioa){
        int edad;

        do{
            edad = anioa - anion - 1;

            if(mesa>mesn){
                edad += 1;
            }
            if(mesa==mesn){
                if(diaa>=dian){
                    edad += 1;
                }
            }
        }while(edad < 0);
        return edad;
    }
}