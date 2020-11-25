import java.util.Scanner;

public class Biblioteca{
    public void biblioteca(){
        //variables y objetos
        Scanner entrada = new Scanner(System.in);
        OperacionesL op = new OperacionesL();
        Libros l = new Libros();
        int o,i,c,ID;

        try{
            //entrada de datos
            do{
                System.out.println("Ingrese la cantidad de libros que va a registrar");
                c = entrada.nextInt();
                if(c<=0){
                    System.out.println("Ingrese solo numeros mayores que 0");
                }
            }while(c<=0);
            
            entrada.nextLine();

            //arreglos
            String titulos[] = new String[c];
            String autores[] = new String[c];
            int libros[] = new int[c];
            int prestados[] = new int[c];
            int disponibles[] = new int[c];

            //entrada de datos, autor y titulo
            for(i=0;i<c;i++){
                System.out.println("Ingrese el titulo del libro del libro "+(i+1));
                titulos[i] = entrada.nextLine();
                System.out.println("Ingrese el nombre del autor del libro "+(i+1));
                autores[i] = entrada.nextLine();
                l.random();
                libros[i] = l.getNoLibro();
                prestados[i] = l.getNoPrestados();
            }

            //calculo de libros disponibles
            for(i=0;i<c;i++){
                disponibles[i] = (libros[i]-prestados[i]);
                System.out.println(titulos[i]+", "+autores[i]+", disponibles: "+disponibles[i]);
            }

            do{
                //menu
                System.out.println("Elija una opcion");
                System.out.println("1.- Prestamo");
                System.out.println("2.- Devolucion");
                System.out.println("3.- Salir");
                o = entrada.nextInt();

                //operaciones segun eleccion
                switch(o){
                    case 1:
                        op.mostrar(titulos,autores,disponibles);
                        do{
                            System.out.println("Ingrese el ID del libro que va a solicitar");
                            ID = entrada.nextInt();
                            if(ID<0||ID>=c){
                                System.out.println("ID no valido");
                            }
                        }while(ID<0||ID>=c);
                        if(disponibles[ID]>0){
                            disponibles[ID] -= 1;
                        }else{
                            System.out.println("No disponibles por el momento");
                        }
                        break;

                    case 2:
                        op.mostrar(titulos,autores,disponibles);
                        do{
                            System.out.println("Ingrese el ID del libro que va a devolver");
                            ID = entrada.nextInt();
                            if(ID<0||ID>=c){
                                System.out.println("ID no valido");
                            }
                        }while(ID<0||ID>=c);
                        disponibles[ID] += 1;
                        break;

                    case 3:
                        System.out.println("Denada Vuelva Pronto");
                        break;

                    default:
                        System.out.println("Ingrese un numero valido");
                        break;
                }
            }while(o!=3);
        }catch(Exception e){
            //excepcion
            System.out.println("Error, Valor no valido");
        }
    }
}