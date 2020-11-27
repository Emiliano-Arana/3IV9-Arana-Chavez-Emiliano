public class Operaciones{

    //metodo para cambiar todas las letras a minisculas
    public static String conversion(String palabra){
        palabra = palabra.toLowerCase();
        palabra = palabra.trim();
        return palabra;
    }

    //le cambia los espacios por la letra que pusieron si esta en la palabra
    public static String comprobacion(String palabra, String muestra, char l){
        StringBuilder SB = new StringBuilder(muestra);
        String p="";
        String j="";
        p = p.valueOf(l);
        p = p.toLowerCase();
        for(int i=0;i<palabra.length();i++){
            j = j.valueOf(palabra.charAt(i));
            if(p.equals(j)){
                SB.setCharAt(i, l); 
                muestra = SB.toString();
            }
        }
        return muestra;
    }

    //estos 3 metodos convierten la palabra a guiones dependiendo de la dificultad
    public static String dificilConvertir(String palabra){
        StringBuilder SB = new StringBuilder(palabra);
        int i,t;
        String p="";
        t = palabra.length()-1;
        for(i=1;i<(t);i++){
            p = p.valueOf(palabra.charAt(i));
            if(p.equals(" ")||p.equals("\t")){

            }else{
                SB.setCharAt(i,'-');
            }     
        }
        palabra = SB.toString();
        return palabra;
    }

    public static String medioConvertir(String palabra){
        StringBuilder SB = new StringBuilder(palabra);
        int i,t,e;
        String p="";
        t = palabra.length()-1;
        do{
            e = ((int)Math.round(Math.random()*t));
        }while(e==0);
        for(i=1;i<(t);i++){
            if(e!=i){
                p = p.valueOf(palabra.charAt(i));
                if(p.equals(" ")||p.equals("\t")){

                }else{
                    SB.setCharAt(i,'-');
                }
            }
        }
        palabra = SB.toString();
        return palabra;
    }

    public static String facilConvertir(String palabra){
        StringBuilder SB = new StringBuilder(palabra);
        int e[] = new int[3];
        int i,t;
        String p="";
        t = palabra.length()-1;
        do{
            for(i=0;i<3;i++){
                e[i] = ((int)Math.floor(Math.random()*(t-1)));
            }
        }while(e[0]==e[1]||e[0]==e[2]||e[1]==e[2]);
        for(i=1;i<(t);i++){
            if(e[0]!=i&&e[1]!=i&&e[2]!=2){
                p = p.valueOf(palabra.charAt(i));
                if(p.equals(" ")||p.equals("\t")){

                }else{
                    SB.setCharAt(i,'-');
                }
            }
        }
        palabra = SB.toString();
        return palabra;
    }

    //dibuja el monigote dependiendo de la dificultad
    public static void dificilDibujo(int vida){
        if(vida==3){
            System.out.println("	 _________________");
            System.out.println("	|                 |");
            System.out.println("	|                 |");
            System.out.println("	|");
            System.out.println("	|");
            System.out.println("	|");
            System.out.println("	|");
            System.out.println("	|");
            System.out.println("	|");
            System.out.println("	|");
            System.out.println("	|");
            System.out.println("	|");
            System.out.println("	|");
            System.out.println("	|");
            System.out.println("	|");
            System.out.println(" ______________");
        }
        if(vida==2){
            System.out.println("	 _________________");
            System.out.println("	|                 |");
            System.out.println("	|                 |");
            System.out.println("	|               _____");
            System.out.println("	|              |     |");
            System.out.println("	|              |     |");
            System.out.println("	|               _____");
            System.out.println("	|");
            System.out.println("	|");
            System.out.println("	|");
            System.out.println("	|");
            System.out.println("	|");
            System.out.println("	|");
            System.out.println("	|");
            System.out.println("	|");
            System.out.println(" ______________");
        }
        if(vida==1){
            System.out.println("	 _________________");
            System.out.println("	|                 |");
            System.out.println("	|                 |");
            System.out.println("	|               _____");
            System.out.println("	|              |     |");
            System.out.println("	|              |     |");
            System.out.println("	|               _____");
            System.out.println("	|                 |");
            System.out.println("	|                 |");
            System.out.println("	|                 |");
            System.out.println("	|                 |");
            System.out.println("	|                | |");
            System.out.println("	|                | |");
            System.out.println("	|                | |");
            System.out.println("	|");
            System.out.println(" ______________");
        }
        if(vida==0){
            System.out.println("	 _________________");
            System.out.println("	|                 |");
            System.out.println("	|                 |");
            System.out.println("	|               _____");
            System.out.println("	|              |     |");
            System.out.println("	|              |     |");
            System.out.println("	|               _____");
            System.out.println("	|                 |");
            System.out.println("	|            _____|_____");
            System.out.println("	|                 |");
            System.out.println("	|                 |");
            System.out.println("	|                | |");
            System.out.println("	|                | |");
            System.out.println("	|                | |");
            System.out.println("	|");
            System.out.println(" ______________");
        }
    }

    public static void medioDibujo(int vida){
        if(vida==6){
            System.out.println("	 _________________");
            System.out.println("	|                 |");
            System.out.println("	|                 |");
            System.out.println("	|");
            System.out.println("	|");
            System.out.println("	|");
            System.out.println("	|");
            System.out.println("	|");
            System.out.println("	|");
            System.out.println("	|");
            System.out.println("	|");
            System.out.println("	|");
            System.out.println("	|");
            System.out.println("	|");
            System.out.println("	|");
            System.out.println(" ______________");
        }
        if(vida==5){
            System.out.println("	 _________________");
            System.out.println("	|                 |");
            System.out.println("	|                 |");
            System.out.println("	|               _____");
            System.out.println("	|              |     |");
            System.out.println("	|              |     |");
            System.out.println("	|               _____");
            System.out.println("	|");
            System.out.println("	|");
            System.out.println("	|");
            System.out.println("	|");
            System.out.println("	|");
            System.out.println("	|");
            System.out.println("	|");
            System.out.println("	|");
            System.out.println(" ______________");
        }
        if(vida==4){
            System.out.println("	 _________________");
            System.out.println("	|                 |");
            System.out.println("	|                 |");
            System.out.println("	|               _____");
            System.out.println("	|              |     |");
            System.out.println("	|              |     |");
            System.out.println("	|               _____");
            System.out.println("	|                 |");
            System.out.println("	|                 |");
            System.out.println("	|                 |");
            System.out.println("	|                 |");
            System.out.println("	|");
            System.out.println("	|");
            System.out.println("	|");
            System.out.println("	|");
            System.out.println(" ______________");
        }
        if(vida==3){
            System.out.println("	 _________________");
            System.out.println("	|                 |");
            System.out.println("	|                 |");
            System.out.println("	|               _____");
            System.out.println("	|              |     |");
            System.out.println("	|              |     |");
            System.out.println("	|               _____");
            System.out.println("	|                 |");
            System.out.println("	|                 |");
            System.out.println("	|                 |");
            System.out.println("	|                 |");
            System.out.println("	|                |");
            System.out.println("	|                |");
            System.out.println("	|                |");
            System.out.println("	|");
            System.out.println(" ______________");
        }
        if(vida==2){
            System.out.println("	 _________________");
            System.out.println("	|                 |");
            System.out.println("	|                 |");
            System.out.println("	|               _____");
            System.out.println("	|              |     |");
            System.out.println("	|              |     |");
            System.out.println("	|               _____");
            System.out.println("	|                 |");
            System.out.println("	|                 |");
            System.out.println("	|                 |");
            System.out.println("	|                 |");
            System.out.println("	|                | |");
            System.out.println("	|                | |");
            System.out.println("	|                | |");
            System.out.println("	|");
            System.out.println(" ______________");
        }
        if(vida==1){
            System.out.println("	 _________________");
            System.out.println("	|                 |");
            System.out.println("	|                 |");
            System.out.println("	|               _____");
            System.out.println("	|              |     |");
            System.out.println("	|              |     |");
            System.out.println("	|               _____");
            System.out.println("	|                 |");
            System.out.println("	|            _____|");
            System.out.println("	|                 |");
            System.out.println("	|                 |");
            System.out.println("	|                | |");
            System.out.println("	|                | |");
            System.out.println("	|                | |");
            System.out.println("	|");
            System.out.println(" ______________");
        }
        if(vida==0){
            System.out.println("	 _________________");
            System.out.println("	|                 |");
            System.out.println("	|                 |");
            System.out.println("	|               _____");
            System.out.println("	|              |     |");
            System.out.println("	|              |     |");
            System.out.println("	|               _____");
            System.out.println("	|                 |");
            System.out.println("	|            _____|_____");
            System.out.println("	|                 |");
            System.out.println("	|                 |");
            System.out.println("	|                | |");
            System.out.println("	|                | |");
            System.out.println("	|                | |");
            System.out.println("	|");
            System.out.println(" ______________");
        }
    }

    //le quita los espacios a la palabra para calcular solo las letras que cuentan
    public static int tamanio(String palabra){
        palabra = palabra.replaceAll("\\s", "");
        return palabra.length();
    }
}