import java.util.Scanner;

public class Figuras{

    public static void eleccion(){
        Scanner entrada = new Scanner(System.in);

        int o;

        do{
            System.out.println("Elija una figura");
            System.out.println("1. Circulo");
            System.out.println("2. Rectangulo");
            System.out.println("3. Cuadrado");
            System.out.println("4. Triangulo");
            System.out.println("5. Menu Principal");
            o = entrada.nextInt();

        
            switch(o){
                case 1:
                    circuloEntrada();
                    break;
                
                case 2:
                    rectanguloEntrada();
                    break;

                case 3:
                    cuadradoEntrada();
                    break;
                    
                case 4:
                    trianguloEntrada();
                    break;

                case 5:
                    System.out.println("...");
                    break;

                default:
                    System.out.println("Ingrese un numero valido");
                    System.out.println();
                    break;

            }
        }while(o!=5);
    }
    public static void circuloEntrada(){
        Scanner entrada = new Scanner(System.in);

        double r,a,p;

        System.out.println("Ingrese el radio");
        r = entrada.nextInt();

        p = circuloPerimetro(r);
        a = circuloArea(r);

        System.out.println("El perimetro del circulo es: "+p);
        System.out.println("El area del circulo es: "+a);
    }
    public static double circuloPerimetro(double R){
        double p;
        p = (R*2)*3.1416;
        return p;
    }
    public static double circuloArea(double R){
        double a;
        a = (R*R)*3.1416;
        return a;
    }
    public static void rectanguloEntrada(){
        Scanner entrada = new Scanner(System.in);

        double h,w,a,p;

        System.out.println("Ingrese la altura");
        h = entrada.nextInt();
        System.out.println("Ingrese el ancho");
        w = entrada.nextInt();

        p = rectanguloPerimetro(h,w);
        a = rectanguloArea(h,w);

        System.out.println("El perimetro del rectangulo es: "+p);
        System.out.println("El area del rectangulo es: "+a);
    }
    public static double rectanguloPerimetro(double H, double W){
        double p;
        p = (H*2)+(W*2);
        return p;
    }
    public static double rectanguloArea(double H, double W){
        double a;
        a = H*W;
        return a;
    }
    public static void cuadradoEntrada(){
        Scanner entrada = new Scanner(System.in);

        double l,a,p;

        System.out.println("Ingrese un lado");
        l = entrada.nextInt();

        p = cuadradoPerimetro(l);
        a = cuadradoArea(l);

        System.out.println("El perimetro del cuadrado es: "+p);
        System.out.println("El area del cuadrado es: "+a);
    }
    public static double cuadradoPerimetro(double L){
        double p;
        p = L*4;
        return p;
    }
    public static double cuadradoArea(double L){
        double a;
        a = L*L;
        return a;
    }
    public static void trianguloEntrada(){
        Scanner entrada = new Scanner(System.in);

        double h,l,a,p;

        System.out.println("Ingrese la altura");
        h = entrada.nextInt();
        System.out.println("Ingrese su base");
        l = entrada.nextInt();

        p = trianguloPerimetro(l);
        a = trianguloArea(h,l);

        System.out.println("El perimetro del rectangulo es: "+p);
        System.out.println("El area del rectangulo es: "+a);
    }
    public static double trianguloPerimetro(double L){
        double p;
        p =  L*3;
        return p;
    }
    public static double trianguloArea(double H, double L){
        double a;
        a = (H*L)/2;
        return a;
    }
}