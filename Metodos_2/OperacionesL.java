public class OperacionesL{
    public static void mostrar(String titulo[], String autor[], int disponibles[]){
        int i;
        for(i=0;i<autor.length;i++){
            System.out.println("ID: "+i+" "+titulo[i]+", "+autor[i]+", disponibles: "+disponibles[i]);
        }
    }
}