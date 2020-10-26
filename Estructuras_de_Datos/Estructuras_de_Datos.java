import java.util.Scanner;

class Estructuras_de_Datos{

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        String s;
        int o,j,l;
        int v,x,y,z;
        Double a,b,c,d;
        
        System.out.println("Arana Chavez Emiliano");
        System.out.println("Bienvenido al programa de Estructura de Datos");

        do{
            System.out.println("1.- Precio del abono");
            System.out.println("2.- Convertir a binario");
            System.out.println("3.- Conversor de temperatura");
            System.out.println("4.- Contar numeros positivos y negativos");
            System.out.println("5.- Lectura de cantidades");
            System.out.println("6.- Medidas de figuras geometricas");
            System.out.println("7.- Tabla de valores");
            System.out.println("8.- Calcular factorial");
            System.out.println("9.- Imprimir cuadrado");
            System.out.println("10.- Imprimir cuadrado hueco");
            System.out.println("11.- Desplegar patron");
            System.out.println("12.- Imprimir Diamante");
            System.out.println("13.- Calculadora");
            System.out.println("14.- Salir");
            o = entrada.nextInt();
            j = 0;

            switch(o){
                case 1:
                    do{
                        do{
                            System.out.println("Ingrese el precio del abono");
                            a = entrada.nextDouble();
                            System.out.println("Ingrese su edad");
                            x = entrada.nextInt();
                            if((a<0)||(x<0)){
                                System.out.println("Solo se permiten numeros positivos");  
                            }
                        }while((a<0)||(x<0));
                        b = a;
                        if(x>65){
                            b = a*0.60; 
                        }
                        if(x<21){
                            System.out.println("Si sus padres son socios inserte 1");
                            y = entrada.nextInt();
                            if(y==1){
                                b =a*0.55;
                            }else{
                                b =a*0.75;
                            }
                        }
                        System.out.println("El precio de su abono es de "+b);
                        do{                                   
                            System.out.println();
                            System.out.println("1.- Repetir");
                            System.out.println("2.- Menu principal");
                            System.out.println("3.- Salir");
                            j = entrada.nextInt();
                            System.out.println();
                            if((j!=3)&&(j!=2)&&(j!=1)){
                                System.out.println("Ingrese un valor valido");
                            }
                        }while((j!=3)&&(j!=2)&&(j!=1));
                         if(j==3){
                            System.out.println("Denada vuelva pronto");
                         }
                    }while((j!=2)&&(j!=3));
                    break;

                case 2:
                    do{
                        do{
                            System.out.println("Inserte un numero entero");
                            x = entrada.nextInt();
                            if(x<0){
                                System.out.println("Porfavor inserte un numero positivo");
                            }
                        }while(x<0);
                        z = 1;
                        v = 0;
                        do{
                            y = x%2;
                            if(y==1){
                                v = v+z;
                                x = (x-1)/2;
                            }else{
                                x = x/2;
                            }
                            z = z*10;
                        }while(x!=0);
                        System.out.println("El numero en binario es "+v);
                        do{                                   
                            System.out.println();
                            System.out.println("1.- Repetir");
                            System.out.println("2.- Menu principal");
                            System.out.println("3.- Salir");
                            j = entrada.nextInt();
                            System.out.println();
                            if((j!=3)&&(j!=2)&&(j!=1)){
                                System.out.println("Ingrese un valor valido");
                            }
                        }while((j!=3)&&(j!=2)&&(j!=1));
                        if(j==3){
                            System.out.println("Denada vuelva pronto");
                         }
                    }while((j!=2)&&(j!=3));
                    break;

                case 3:
                    do{
                        System.out.println("Inserte temperatura en grados fahrenheit");
                        a = entrada.nextDouble();
                        do{
                            System.out.println("Seleccione a que lo desea convertir");
                            System.out.println("1.- Celsius");
                            System.out.println("2.- Kelvine");
                            System.out.println("3.- Rankine");
                            x = entrada.nextInt();
                            switch(x){
                                case 1:
                                    b = (a-32)*(0.5555);
                                    System.out.println(b+" C");                                
                                    break;

                                case 2:
                                    b = (a-32)*(0.5555)+273.15;
                                    System.out.println(b+" K");
                                    break;

                                case 3:
                                    b = a+459.67;
                                    System.out.println(b+" R");
                                    break;

                                default:
                                    System.out.println("Porfavor ingrese un valor valido");
                                    break;

                            }
                        }while((x!=1)&&(x!=2)&&(x!=3));
                        do{                                   
                            System.out.println();
                            System.out.println("1.- Repetir");
                            System.out.println("2.- Menu principal");
                            System.out.println("3.- Salir");
                            j = entrada.nextInt();
                            System.out.println();
                            if((j!=3)&&(j!=2)&&(j!=1)){
                                System.out.println("Ingrese un valor valido");
                            }
                        }while((j!=3)&&(j!=2)&&(j!=1));
                        if(j==3){
                            System.out.println("Denada vuelva pronto");
                        }
                    }while((j!=2)&&(j!=3));
                    break;

                case 4:
                    do{
                        System.out.println("Introduzca una serie de numeros");
                        System.out.println("La serie terminara cuando ingrese un 0");
                        x = 0;
                        y = 0;
                        do{
                            a = entrada.nextDouble();
                            if(a>0){
                                x = x+1;
                            }
                            if(a<0){
                                y = y+1;
                            }
                        }while(a!=0);
                        System.out.println("Numeros positivos: "+x);
                        System.out.println("Numeros negativos: "+y);
                        do{                                   
                            System.out.println();
                            System.out.println("1.- Repetir");
                            System.out.println("2.- Menu principal");
                            System.out.println("3.- Salir");
                            j = entrada.nextInt();
                            System.out.println();
                            if((j!=3)&&(j!=2)&&(j!=1)){
                                System.out.println("Ingrese un valor valido");
                            }
                        }while((j!=3)&&(j!=2)&&(j!=1));
                        if(j==3){
                            System.out.println("Denada vuelva pronto");
                        }
                    }while((j!=2)&&(j!=3));
                    break;

                case 5:
                    do{
                        do{    
                            System.out.println("Cuantos productos desea ingresar?");
                            x = entrada.nextInt();
                            if(x<0){
                                System.out.println("Porfavor ingrese un numero positivo");
                            }
                        }while(x<0);
                        b = 0.00;
                        for (v=1;v<=x;++v){
                            do{
                                System.out.println("Ingrese el precio del producto "+v);
                                a = entrada.nextDouble();
                                if(a<0){
                                    System.out.println("Porfavor ingrese un valor positivo");
                                }else{
                                    b = b+a;
                                }
                            }while(a<0);
                        }
                        System.out.println();
                        System.out.println("Total de productos comprados: "+x);
                        System.out.println("Factura total: $"+b);
                        do{                                   
                            System.out.println();
                            System.out.println("1.- Repetir");
                            System.out.println("2.- Menu principal");
                            System.out.println("3.- Salir");
                            j = entrada.nextInt();
                            System.out.println();
                            if((j!=3)&&(j!=2)&&(j!=1)){
                                System.out.println("Ingrese un valor valido");
                            }
                        }while((j!=3)&&(j!=2)&&(j!=1));
                        if(j==3){
                            System.out.println("Denada vuelva pronto");
                        }
                    }while((j!=2)&&(j!=3));
                    break;

                case 6:
                    do{
                        do{
                            System.out.println("Elija que hacer");
                            System.out.println("A) area y perimetro de un rectangulo");
                            System.out.println("B) area y perimetro de un triangulo");
                            System.out.println("C) volumen de una esfera y un cilindro");
                            s = entrada.next();
                            l = 0;
                            switch(s){
                                case "A":
                                    do{
                                        System.out.println("Ingrese la base");
                                        a = entrada.nextDouble();
                                        System.out.println("Ingrese la altura del cilindro");
                                        b = entrada.nextDouble();
                                        if((a<0)||(b<0)){
                                            System.out.println("Ingrese un numero positivo");
                                        }
                                    }while((a<0)||(b<0));
                                    c = (b*2)+(a*2);
                                    d = a*b;
                                    System.out.println("El perimetro es: "+c);
                                    System.out.println("El area es: "+d);
                                    l = 1;
                                    break;
    
                                case "a":
                                    do{
                                        System.out.println("Ingrese la base");
                                        a = entrada.nextDouble();
                                        System.out.println("Ingrese la altura");
                                        b = entrada.nextDouble();
                                        if((a<0)||(b<0)){
                                            System.out.println("Ingrese un numero positivo");
                                        }
                                    }while((a<0)||(b<0));
                                    c = (b*2)+(a*2);
                                    d = a*b;
                                    System.out.println("El perimetro es: "+c);
                                    System.out.println("El area es: "+d);
                                    l = 1;
                                    break;

                                case "B":
                                    do{
                                        System.out.println("Ingrese la base");
                                        a = entrada.nextDouble();
                                        System.out.println("Ingrese la altura");
                                        b = entrada.nextDouble();
                                        if((a<0)||(b<0)){
                                            System.out.println("Ingrese un numero positivo");
                                        }
                                    }while((a<0)||(b<0));
                                    c = a*3;
                                    d = a*b;
                                    System.out.println("El perimetro es: "+c);
                                    System.out.println("El area es: "+d);
                                    l = 1;
                                    break;

                                case "b":
                                    do{
                                        System.out.println("Ingrese la base");
                                        a = entrada.nextDouble();
                                        System.out.println("Ingrese la altura");
                                        b = entrada.nextDouble();
                                        if((a<0)||(b<0)){
                                            System.out.println("Ingrese un numero positivo");
                                        }
                                    }while((a<0)||(b<0));
                                    c = a*3;
                                    d = a*b;
                                    System.out.println("El perimetro es: "+c);
                                    System.out.println("El area es: "+d);
                                    l = 1;
                                    break; 

                                case "C":
                                    do{
                                        System.out.println("Ingrese el radio");
                                        a = entrada.nextDouble();
                                        System.out.println("Ingrese la altura");
                                        b = entrada.nextDouble();
                                        if((a<0)||(b<0)){
                                            System.out.println("Ingrese un numero positivo");
                                        }
                                    }while((a<0)||(b<0));
                                    c = (3.1416*(a*a))*b;
                                    d = (4*3.1416*(a*a*a))/3;
                                    System.out.println("El volumen del cilindro es: "+c);
                                    System.out.println("El volumen de la esfera: "+d);
                                    l = 1;
                                    break; 

                                case "c":
                                    do{
                                        System.out.println("Ingrese el radio");
                                        a = entrada.nextDouble();
                                        System.out.println("Ingrese la altura");
                                        b = entrada.nextDouble();
                                        if((a<0)||(b<0)){
                                            System.out.println("Ingrese un numero positivo");
                                        }
                                    }while((a<0)||(b<0));
                                    c = (3.1416*(a*a))*b;
                                    d = (4*3.1416*(a*a*a))/3;
                                    System.out.println("El volumen del cilindro es: "+c);
                                    System.out.println("El volumen de la esfera: "+d);
                                    l = 1;
                                    break;
                                
                                default:
                                    System.out.println("Porfavor ingrese un valor valido");
                                    break;

                            }
                        }while(l!=1);                      
                        do{                                   
                            System.out.println();
                            System.out.println("1.- Repetir");
                            System.out.println("2.- Menu principal");
                            System.out.println("3.- Salir");
                            j = entrada.nextInt();
                            System.out.println();
                            if((j!=3)&&(j!=2)&&(j!=1)){
                                System.out.println("Ingrese un valor valido");
                            }
                        }while((j!=3)&&(j!=2)&&(j!=1));
                        if(j==3){
                            System.out.println("Denada vuelva pronto");
                        }
                    }while((j!=2)&&(j!=3));
                    break;

                case 7:
                    do{
                        do{
                            System.out.println("Inserte el numero de filas de la tabla");
                            x = entrada.nextInt();
                            if(x<=0){
                                System.out.println("Inserte un numero mayor que cero");
                            }
                        }while(x<=0);
                        for(v=1;v<=x;++v){
                            System.out.print(" "+v+" ");
                            System.out.print(" "+(v*10)+" ");
                            System.out.print(" "+(v*100)+" ");
                            System.out.println(" "+(v*1000));
                        }
                        do{                                   
                            System.out.println();
                            System.out.println("1.- Repetir");
                            System.out.println("2.- Menu principal");
                            System.out.println("3.- Salir");
                            j = entrada.nextInt();
                            System.out.println();
                            if((j!=3)&&(j!=2)&&(j!=1)){
                                System.out.println("Ingrese un valor valido");
                            }
                        }while((j!=3)&&(j!=2)&&(j!=1));
                        if(j==3){
                            System.out.println("Denada vuelva pronto");
                        }
                    }while((j!=2)&&(j!=3));                   
                    break;

                case 8:
                    do{
                        do{
                            System.out.println("Ingrese un numero");
                            x = entrada.nextInt();
                            if(x<0){
                                System.out.println("Por favor ingrese un numero positivo");
                            }
                        }while(x<0);
                        y = 1;
                        if(x>0){
                            for(v=1;v<=x;++v){
                                y = y*v;
                            }
                        } 
                        System.out.println("El factorial de "+x+" es: "+y);                                    
                        do{                                   
                            System.out.println();
                            System.out.println("1.- Repetir");
                            System.out.println("2.- Menu principal");
                            System.out.println("3.- Salir");
                            j = entrada.nextInt();
                            System.out.println();
                            if((j!=3)&&(j!=2)&&(j!=1)){
                                System.out.println("Ingrese un valor valido");
                            }
                        }while((j!=3)&&(j!=2)&&(j!=1));
                        if(j==3){
                            System.out.println("Denada vuelva pronto");
                        }
                    }while((j!=2)&&(j!=3));
                    break;

                case 9:
                    do{
                        do{
                            System.out.println("Ingrese el valor de un lado");
                            x = entrada.nextInt();
                            System.out.println();
                            if((x>20)||(x<1)){
                                System.out.println("Por favor ingrese un numero entre 1 y 20");
                            }
                        }while((x>20)||(x<1));
                        for(v=1;v<=x;++v){
                            for(y=2;y<=x;++y){
                                System.out.print("*");
                            }
                            System.out.println("*");
                        }
                        do{                                   
                            System.out.println();
                            System.out.println("1.- Repetir");
                            System.out.println("2.- Menu principal");
                            System.out.println("3.- Salir");
                            j = entrada.nextInt();
                            System.out.println();
                            if((j!=3)&&(j!=2)&&(j!=1)){
                                System.out.println("Ingrese un valor valido");
                            }
                        }while((j!=3)&&(j!=2)&&(j!=1));
                        if(j==3){
                            System.out.println("Denada vuelva pronto");
                        }
                    }while((j!=2)&&(j!=3));
                    break;

                case 10:
                    do{
                        do{
                            System.out.println("Ingrese el valor de un lado");
                            x = entrada.nextInt();
                            System.out.println();
                            if((x>20)||(x<1)){
                                System.out.println("Por favor ingrese un numero entre 1 y 20");
                            }
                        }while((x>20)||(x<1));
                        if(x==1){
                            System.out.print("*");
                        }else{
                            for(y=2;y<=x;++y){
                                System.out.print("*");
                            }
                            System.out.println("*");
                            for(v=3;v<=x;++v){
                                System.out.print("*");
                                for(y=3;y<=x;++y){
                                    System.out.print(" ");
                                }
                                System.out.println("*");
                            }
                            for(y=1;y<=x;++y){
                                System.out.print("*");
                            }
                        }
                        do{                                   
                            System.out.println();
                            System.out.println("1.- Repetir");
                            System.out.println("2.- Menu principal");
                            System.out.println("3.- Salir");
                            j = entrada.nextInt();
                            System.out.println();
                            if((j!=3)&&(j!=2)&&(j!=1)){
                                System.out.println("Ingrese un valor valido");
                            }
                        }while((j!=3)&&(j!=2)&&(j!=1));
                        if(j==3){
                            System.out.println("Denada vuelva pronto");
                        }
                    }while((j!=2)&&(j!=3));
                    break;
                
                case 11:
                    do{
                        do{
                            System.out.println("Ingrese la cantidad de filas");
                            x = entrada.nextInt();
                            System.out.println();
                            if(x<1){
                                System.out.println("Por favor ingrese un numero positivo");
                            }
                        }while(x<1);
                        for(v=1;v<=x;++v){
                            z = v%2;
                            if(z==0){
                                System.out.print(" ");
                            }
                            for(y=2;y<=x;++y){
                                System.out.print("*");
                            }
                            System.out.println("*");                           
                        }  
                        do{                                   
                            System.out.println();
                            System.out.println("1.- Repetir");
                            System.out.println("2.- Menu principal");
                            System.out.println("3.- Salir");
                            j = entrada.nextInt();
                            System.out.println();
                            if((j!=3)&&(j!=2)&&(j!=1)){
                                System.out.println("Ingrese un valor valido");
                            }
                        }while((j!=3)&&(j!=2)&&(j!=1));
                        if(j==3){
                            System.out.println("Denada vuelva pronto");
                        }
                    }while((j!=2)&&(j!=3));
                    break;

                case 12:
                    do{
                        do{
                            System.out.println("Ingrese el tamano");
                            x = entrada.nextInt();
                            System.out.println();
                            if(x<1){
                                System.out.println("Por favor ingrese un numero positivo");
                            }
                        }while(x<1);
                        for(v=1;v<=x;++v){
                            for(y=x-v;y>0;--y){
                                System.out.print(" ");
                            }
                            for(z=1;z<2*v;++z){
                                System.out.print("*");
                            }
                            System.out.println(" ");                                                           
                        }
                        for(v=x-1;v>=1;--v){
                            for(y=x-v;y>0;--y){
                                System.out.print(" ");
                            }
                            for(z=1;z<2*v;++z){
                                System.out.print("*");
                            }
                            System.out.println(" ");                                                 
                        }                                          
                        do{                                   
                            System.out.println();
                            System.out.println("1.- Repetir");
                            System.out.println("2.- Menu principal");
                            System.out.println("3.- Salir");
                            j = entrada.nextInt();
                            System.out.println();
                            if((j!=3)&&(j!=2)&&(j!=1)){
                                System.out.println("Ingrese un valor valido");
                            }
                        }while((j!=3)&&(j!=2)&&(j!=1));
                        if(j==3){
                            System.out.println("Denada vuelva pronto");
                        }
                    }while((j!=2)&&(j!=3));
                    break;

                case 13:
                    do{                       
                        System.out.println("Simbolos para operaciones");
                        System.out.println("+.- Suma");
                        System.out.println("-.- Resta");
                        System.out.println("*.- Multiplicacion");
                        System.out.println("/.- Division");
                        System.out.println("=.- Resultado");
                        System.out.println(); 
                        a = entrada.nextDouble();
                        b = a;
                        do{
                            s = entrada.next();                   
                            switch(s){
                                case "+":
                                    a = entrada.nextDouble(); 
                                    b = b+a;
                                    break;

                                case "-":
                                    a = entrada.nextDouble(); 
                                    b = b-a;
                                    break;

                                case "*":
                                    a = entrada.nextDouble(); 
                                    b = b*a;
                                    break;

                                case "/":
                                    a = entrada.nextDouble(); 
                                     b = b/a;
                                    break;

                                case "=":
                                    a = 0.0;
                                    break;

                               default:
                                    System.out.println("Caracter no valido");
                                    break;

                                }
                                System.out.println();
                            }while(a!=0);
                            System.out.println("El resultado es: "+b);                          
                        do{                                   
                            System.out.println();
                            System.out.println("1.- Repetir");
                            System.out.println("2.- Menu principal");
                            System.out.println("3.- Salir");
                            j = entrada.nextInt();
                            System.out.println();
                            if((j!=3)&&(j!=2)&&(j!=1)){
                                System.out.println("Ingrese un valor valido");
                            }
                        }while((j!=3)&&(j!=2)&&(j!=1));
                        if(j==3){
                            System.out.println("Denada vuelva pronto");
                        }
                    }while((j!=2)&&(j!=3));
                    break;

                case 14:
                    System.out.println("Denada vuelva pronto");
                    break;
            
                default:                  
                    System.out.println("Porfavor ingrese un valor valido");
                    break;

            }
        }while((o!=14)&&(j!=3));
    }
}