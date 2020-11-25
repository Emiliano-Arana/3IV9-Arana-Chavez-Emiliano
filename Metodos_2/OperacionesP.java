public class OperacionesP{
    public static int SumaTotal(int costo[]){
        int total,i;
        total = 0;
        for(i=0;i<costo.length;i++){
            total += costo[i];
        }
        return total;
    }
    public static int CostoMayor(int costo[]){
        int Mayor,i;
        Mayor = -1;
        for(i=0;i<costo.length;i++){
            if(costo[i]>Mayor){
                Mayor = costo[i];
            }
        }
        return Mayor;
    }
    public static int CostoMenor(int costo[]){
        int menor,i;
        menor = costo[0];
        for(i=0;i<costo.length;i++){
            if(costo[i]<menor){
                menor = costo[i];
            }
        }
        return menor;
    }
    public static double Promedio(int costo[]){
        double promedio;
        int i;
        promedio = 0;
        for(i=0;i<costo.length;i++){
            promedio += costo[i];
        }
        promedio /= costo.length;
        return promedio;
    }
    public static int TotalP(int costo[], int cantidad[]){
        int total,i;
        total = 0;
        for(i=0;i<costo.length;i++){
            total += (costo[i]*cantidad[i]);
        }
        return total;
    }
}