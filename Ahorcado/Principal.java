import java.util.Scanner;

public class Principal{
    public static void main(String[] args){
        //todas los objetos y variables
        Scanner entrada = new Scanner(System.in);
        Operaciones op = new Operaciones();
        Dificil dificil = new Dificil();
        Medio medio = new Medio();
        Facil facil = new Facil();
        int d,x,vida,tamano;
        String palabra,muestra;
        char l;

        //le asigno un valor a vida y a d
        d = 0;
        vida = 0;
        System.out.println("Bienvenido a Ahorcado");
        System.out.println();

        do{
            x=0;
            try{
                System.out.println("NOTA: los espacios no cuentan como letra");
                System.out.println("NOTA: si tu amigo es no te pone una palabra existente no es mi culpa");

                //menu de opciones
                System.out.println("Ingrese una dificultad");
                System.out.println("1. Facil (Literal para principiantes)");
                System.out.println("2. Medio");
                System.out.println("3. Dificil");
                System.out.println("4. Salir");
                d = entrada.nextInt();
                entrada.nextLine();

                //switch para la opcion elegida
                switch(d){
                    case 1:
                        System.out.println("Ya que elegiste modo facil tienes vidas infinitas");
                        System.out.println("Por  otro lado no vas a salir hasta que lo completes");
                        System.out.println("Ademas en este modo no hay un monigote");
                        System.out.println();
                        //le asigna un valor minimo a la palabra
                        do{
                            System.out.println("Ingresa la palabra que tu amigo va a adivinar");
                            palabra = entrada.nextLine();
                            tamano = op.tamanio(palabra);
                            if(tamano<7){
                                System.out.println("En este modo solo se aceptan palabras de minimo 7 letras");
                            }
                        }while(tamano<7);
                        System.out.println("Listo, ahora pasale el dispositivo a tu amigo");
                        palabra = op.conversion(palabra);
                        muestra = op.facilConvertir(palabra);
                        facil.setMuestra(muestra);
                        facil.setPalabra(palabra);
                        
                        //se repite hasta que adivine la palabra
                        do{
                            System.out.println(muestra);
                            System.out.println();
                            System.out.println("Ingresa una letra que crees que corresponde a la palabra");
                            l = entrada.next().charAt(0);
                            muestra = op.comprobacion(palabra,muestra,l);
                            if(muestra.equals(facil.getMuestra())){
                                System.out.println("Incorrecto");
                            }else{
                                System.out.println("Correcto");
                            }
                            facil.setMuestra(muestra);
                            if(muestra.equals(palabra)){
                                x = 1;
                            }
                        }while(x!=1);
                        System.out.println();
                        System.out.println("Ganaste");
              
                        break;

                    case 2:
                        //le asigna un valor minimo a la palabra
                        System.out.println("Tienes 6 vidas");
                        System.out.println();
                        do{
                            System.out.println("Ingresa la palabra que tu amigo va a adivinar");
                            palabra = entrada.nextLine();
                            tamano = op.tamanio(palabra);
                            if(tamano<4){
                                System.out.println("En este modo solo se aceptan palabras de minimo 4 letras");
                            }
                        }while(tamano<4);
                        System.out.println("Listo, ahora pasale el dispositivo a tu amigo");
                        palabra = op.conversion(palabra);
                        muestra = op.medioConvertir(palabra);
                        medio.setMuestra(muestra);
                        medio.setPalabra(palabra);
                        vida = medio.getVida();
                        
                        //se repite hasta que se le acaben las vidas o adivine la palabra
                        do{
                            op.medioDibujo(vida);
                            System.out.println();
                            System.out.println();
                            System.out.println(muestra);
                            System.out.println();
                            System.out.println("Ingresa una letra que crees que corresponde a la palabra");
                            l = entrada.next().charAt(0);
                            muestra = op.comprobacion(palabra,muestra,l);
                            if(muestra.equals(medio.getMuestra())){
                                vida -= 1;
                                medio.setVida(vida);
                                System.out.println("Incorrecto");
                                System.out.println(vida);
                            }else{
                                System.out.println("Correcto");
                            }
                            medio.setMuestra(muestra);
                            if(muestra.equals(palabra)){
                                x = 1;
                            }
                        }while(x!=1&&vida!=0);
                        if(vida==0){
                            System.out.println();
                            System.out.println("Perdiste");
                            System.out.println();
                            op.medioDibujo(vida);
                            System.out.println();
                            System.out.println();
                        }else{
                            System.out.println();
                            System.out.println("Ganaste");
                        }
                        break;

                    case 3:
                        System.out.println("Asi que has elegido el camino de la muerte");
                        System.out.println("Tienes 3 vidas");
                        System.out.println();
                        //le asigna un valor minimo a la palabra
                        do{
                            System.out.println("Ingresa la palabra que tu amigo va a adivinar");
                            palabra = entrada.nextLine();
                            tamano = op.tamanio(palabra);
                            if(tamano<1){
                                System.out.println("Minimo pon una letra no te pases");
                            }
                        }while(tamano<1);
                        System.out.println("Listo, ahora pasale el dispositivo a tu amigo");
                        palabra = op.conversion(palabra);
                        muestra = op.dificilConvertir(palabra);
                        dificil.setMuestra(muestra);
                        dificil.setPalabra(palabra);
                        vida = dificil.getVida();
                        
                        //se repite hasta que se le acaben las vidas o adivine la palabra
                        do{
                            op.dificilDibujo(vida);
                            System.out.println();
                            System.out.println();
                            System.out.println(muestra);
                            System.out.println();
                            System.out.println("Ingresa una letra que crees que corresponde a la palabra");
                            l = entrada.next().charAt(0);
                            muestra = op.comprobacion(palabra,muestra,l);
                            if(muestra.equals(dificil.getMuestra())){
                                vida -= 1;
                                dificil.setVida(vida);
                                System.out.println("Incorrecto");
                                System.out.println(vida);
                            }else{
                                System.out.println("Correcto");
                            }
                            dificil.setMuestra(muestra);
                            if(muestra.equals(palabra)){
                                x = 1;
                            }
                        }while(x!=1&&vida!=0);
                        if(vida==0){
                            System.out.println();
                            System.out.println("Perdiste");
                            System.out.println();
                            op.dificilDibujo(vida);
                            System.out.println();
                            System.out.println();
                        }else{
                            System.out.println();
                            System.out.println("Ganaste");
                        }
                        break;

                    case 4:
                        System.out.println("Hasta Otra");              
                        break;

                    default:
                    //en caso de que ingresen un entero no considerado
                        System.out.println();
                        System.out.println("Ingrese un valor valido");
                        System.out.println();
                        break;
                }

            }catch(Exception e){
                //en caso de que ingresen un tipo de dato inadecuado
                System.out.println("Error, valor no valido");
            }
        }while(d!=4);
    }
}