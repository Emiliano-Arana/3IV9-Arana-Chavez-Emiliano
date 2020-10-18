import java.util.Scanner;

class MenuFiguras{

    public static void main(String[] args){
        
        Scanner entrada = new Scanner(System.in);
        String o;
        double altura, base;
        double perimetro, area;
        int x, n;
        x=1;

        System.out.println("Bienvenido al programa de calculo de areas y perimetros");

        do{
            System.out.println("Elija una de las siguientes opciones:");
            System.out.println("1.- Calcular area y perimetro de un cuadrado");
            System.out.println("2.- Calcular area y perimetro de un triangulo");
            System.out.println("3.- Calcular area y perimetro de un circulo");
            System.out.println("4.- Calcular area y perimetro de un rectangulo");
            System.out.println("5.- Calcular area y perimetro de un rombo");
            System.out.println("6.- Calcular area y perimetro de un hexagono");
            System.out.println("S o s.- Salir");
            o = entrada.next();



            switch(o){
                case "1":
                    System.out.println("Ingresa el valor de un lado");
                    base = entrada.nextDouble();
                    do{     
                        if(base<=0){             
                            System.out.println("El valor debe ser mayor que 0");
                            System.out.println("Ingresa el valor de un lado");
                            base = entrada.nextDouble();
                        }
                    }while(base<0);
                    area = base*base;
                    perimetro = base*4;
                    System.out.println("El perimetro es de: "+perimetro);
                    System.out.println("El area es de: "+area);
                    break;

                    case "2":
                    System.out.println("Ingresa el valor de la base");
                    base = entrada.nextDouble();
                    System.out.println("Ingresa el valor de la altura");
                    altura = entrada.nextDouble();
                    if(base<=0){
                        do{
                            System.out.println("El valor de la base debe ser mayor que 0");
                            System.out.println("Ingresa el valor de la base");
                            base = entrada.nextDouble();
                        }while(base<=0);
                    }
                    if(altura<=0){
                        do{
                            System.out.println("El valor de la altura debe ser mayor que 0");
                            System.out.println("Ingresa el valor de la altura");
                            altura = entrada.nextDouble();
                        }while(altura<=0);
                    }
                    perimetro = base*3;
                    area = (base*altura)/2;
                    System.out.println("El perimetro es de: "+perimetro);
                    System.out.println("El area es de: "+area);
                    break;

                case "3":
                    System.out.println("Ingresa el valor del radio");
                    base = entrada.nextDouble();
                    do{     
                        if(base<=0){             
                            System.out.println("El radio debe ser mayor que 0");
                            System.out.println("Ingresa el valor del radio");
                            base = entrada.nextDouble();
                        }
                    }while(base<0);
                    perimetro = 3.1416*(base*2);
                    area = 3.1416*(base*base);
                    System.out.println("El perimetro es de: "+perimetro);
                    System.out.println("El area es de: "+area);
                    break;
                    
                case "4":
                    System.out.println("Ingresa el valor de la base");
                    base = entrada.nextDouble();
                    System.out.println("Ingresa el valor de la altura");
                    altura = entrada.nextDouble();
                    if(base<=0){
                        do{
                            System.out.println("El valor de la base debe ser mayor que 0");
                            System.out.println("Ingresa el valor de la base");
                            base = entrada.nextDouble();
                        }while(base<=0);
                    }
                    if(altura<=0){
                        do{
                            System.out.println("El valor de la altura debe ser mayor que 0");
                            System.out.println("Ingresa el valor de la altura");
                            altura = entrada.nextDouble();
                        }while(altura<=0);
                    }
                    perimetro = (base*2)*(altura*2);
                    area = base*altura;
                    System.out.println("El perimetro es de: "+perimetro);
                    System.out.println("El area es de: "+area);
                    break;

                case "5":
                    System.out.println("Ingresa el valor de la diagonal mayor");
                    base = entrada.nextDouble();
                    System.out.println("Ingresa el valor de la diagonal menor");
                    altura = entrada.nextDouble();
                    if(base<=0){
                        do{
                            System.out.println("El valor de la diagonal mayor debe ser mayor que 0");
                            System.out.println("Ingresa el valor de la diagonal mayor");
                            base = entrada.nextDouble();
                        }while(base<=0);
                    }
                    if(altura<=0){
                        do{
                            System.out.println("El valor de la diagonal menor debe ser mayor que 0");
                            System.out.println("Ingresa el valor de la diagonal menor");
                            altura = entrada.nextDouble();
                        }while(altura<=0);
                    }
                    perimetro = (Math.sqrt(((base/2)*(base/2))+((altura/2)*(altura/2)))*4);
                    area = (base*altura)/2;
                    System.out.println("El perimetro es de: "+perimetro);
                    System.out.println("El area es de: "+area);
                    break;

                case "6":
                    System.out.println("Ingresa el valor de la apotema");
                    base = entrada.nextDouble();
                    System.out.println("Ingresa el valor de un lado");
                    altura = entrada.nextDouble();
                    if(base<=0){
                        do{
                            System.out.println("El valor de la apotema debe ser mayor que 0");
                            System.out.println("Ingresa el valor de la apotema");
                            base = entrada.nextDouble();
                        }while(base<=0);
                    }
                    if(altura<=0){
                        do{
                            System.out.println("El valor del lado debe ser mayor que 0");
                            System.out.println("Ingresa el valor de un lado");
                            altura = entrada.nextDouble();
                        }while(altura<=0);
                    }
                    perimetro = altura*6;
                    area = (perimetro*base)/2;
                    System.out.println("El perimetro es de: "+perimetro);
                    System.out.println("El area es de: "+area);
                    break;

                case "S":
                    System.out.println("Hasta la proxima");
                    x=2;
                    break;

                default:
                    System.out.println("Hasta la proxima");
                    x=2;
            }
        }while(x==1);
    }
}       