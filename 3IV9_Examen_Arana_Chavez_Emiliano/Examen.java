import java.util.*;

class Examen{

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        String b,c,s;
        String apb,apc,aps;
        String asb,asc,ass;
        int idb,idc,ids;
        int fb,fc,fs;
        int db,dc,ds;
        int vb,vc,vs;
        int o,j,ar;
        int d,dr,a;
        Double v,x,z;

        //id, nombre, fuerza, defensa vida, ataque principal, ataque secundario
        
        System.out.println("Arana Chavez Emiliano");
        System.out.println("Bienvenido al programa alfa de la pokedex");
        System.out.println();

        do{
            System.out.println("1.- Bulbasaur");
            System.out.println("2.- Charmander");
            System.out.println("3.- Squirtle");
            System.out.println("4.- Batalla Pokemon");
            System.out.println("5.- Salir");
            o = entrada.nextInt();
            j = 1;

            b = "Bulbasaur";
            apb = "Placaje";
            asb = "Malicioso";
            idb = 1;
            fb = 8;
            db = 10;
            vb = 100;
            c = "Charmander";
            apc = "Aranazo";
            asc = "Malicioso";
            idc = 2;
            fc = 10;
            dc = 8;
            vc = 100;
            s = "Squirtle";
            aps = "Placaje";
            ass = "Malicioso";
            ids = 3;
            fs = 9;
            ds = 9;
            vs = 100;

            switch(o){
                case 1:
                    while(j==1){
                        System.out.println("ID "+idb);
                        System.out.println("Nombre "+b);
                        System.out.println("Fuerza "+fb);
                        System.out.println("Defensa "+db);
                        System.out.println("Vida "+vb);
                        System.out.println("Ataque Principal "+apb);
                        System.out.println("Ataque Secundario "+asb);
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
                    }
                    
                    break;

                case 2:
                    while(j==1){
                        System.out.println("ID "+idc);
                        System.out.println("Nombre "+c);
                        System.out.println("Fuerza "+fc);
                        System.out.println("Defensa "+dc);
                        System.out.println("Vida "+vc);
                        System.out.println("Ataque Principal "+apc);
                        System.out.println("Ataque Secundario "+asc);
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
                    }
                    break;

                case 3:
                    while(j==1){
                        System.out.println("ID "+ids);
                        System.out.println("Nombre "+s);
                        System.out.println("Fuerza "+fs);
                        System.out.println("Defensa "+ds);
                        System.out.println("Vida "+vs);
                        System.out.println("Ataque Principal "+aps);
                        System.out.println("Ataque Secundario "+ass);
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
                    }
                    break;

                case 4:
                    while(j==1){
                        b = "Bulbasaur";
                        apb = "Placaje";
                        asb = "Malicioso";
                        idb = 1;
                        fb = 8;
                        db = 10;
                        vb = 100;
                        c = "Charmander";
                        apc = "Aranazo";
                        asc = "Malicioso";
                        idc = 2;
                        fc = 10;
                        dc = 8;
                        vc = 100;
                        s = "Squirtle";
                        aps = "Placaje";
                        ass = "Malicioso";
                        ids = 3;
                        fs = 9;
                        ds = 9;
                        vs = 100;
                        x = Math.floor(Math.random()*3);
                        if(x==1){
                            System.out.println(b+" vs "+c);
                            System.out.println("Estadisticas de tu pokemon "+b);
                            System.out.println();
                            System.out.println("Fuerza: "+fb);
                            System.out.println("Defensa: "+db);
                            System.out.println();
                            System.out.println("Estadisticas de tu rival "+c);
                            System.out.println();
                            System.out.println("Fuerza: "+fc);
                            System.out.println("Defensa: "+dc);
                            System.out.println();
                                
                            do{   
                                System.out.println("Elige un ataque");
                                System.out.println("1.- "+apb);
                                System.out.println("2.- "+asb);
                                System.out.println();                               
                                a = entrada.nextInt();
                                System.out.println();                                                                     
                                if(a==1){
                                    d = (fb*db)/3;
                                    vc = vc-d;
                                }else{
                                    fb = fb + 1;
                                }
                                z = Math.floor(Math.random()*3);
                                if(z==2){
                                    System.out.println("Rival realizo placaje");
                                    dr = (fc*dc)/3;
                                    vb = vb-dr;
                                }else{
                                    System.out.println("Rival realizo malicioso");
                                    fc = fc + 1;
                                }
                                System.out.println("Vida de Boulbasaur "+vb);
                                System.out.println("Vida de Charmander "+vc);
                            }while((vb>0)&&(vc>0));
                            if(vb<=0){
                                System.out.println("Pokemon debilitado");
                            }else{
                                System.out.println("Ganaste");
                            }
                        }
                        if(x==2){
                            System.out.println(b+" vs "+s);
                            System.out.println("Estadisticas de tu pokemon "+b);
                            System.out.println();
                            System.out.println("Fuerza: "+fb);
                            System.out.println("Defensa: "+db);
                            System.out.println();
                            System.out.println("Estadisticas de tu rival "+s);
                            System.out.println();
                            System.out.println("Fuerza: "+fs);
                            System.out.println("Defensa: "+ds);
                            System.out.println();
                                
                            do{   
                                System.out.println("Elige un ataque");
                                System.out.println("1.- "+apb);
                                System.out.println("2.- "+asb);
                                System.out.println();                               
                                a = entrada.nextInt();
                                System.out.println();                                                                     
                                if(a==1){
                                    d = (fb*db)/3;
                                    vc = vc-d;
                                }else{
                                    fb = fb + 1;
                                }
                                z = Math.floor(Math.random()*3);
                                if(z==2){
                                    System.out.println("Rival realizo placaje");
                                    dr = (fc*dc)/3;
                                    vb = vb-dr;
                                }else{
                                    System.out.println("Rival realizo malicioso");
                                    fc = fc + 1;
                                }
                                System.out.println("Vida de Boulbasaur "+vb);
                                System.out.println("Vida de Charmander "+vc);
                            }while((vb>0)&&(vc>0));
                            if(vb<=0){
                                System.out.println("Pokemon debilitado");
                            }else{
                                System.out.println("Ganaste");
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
                    }
                        break;

                case 5:
                    System.out.println("Denada vuelva pronto");
                    break;
            
                default:                  
                    System.out.println("Porfavor ingrese un valor valido");
                    break;
        
            }
        }while((o!=5)&&(j!=3));
    }
}
