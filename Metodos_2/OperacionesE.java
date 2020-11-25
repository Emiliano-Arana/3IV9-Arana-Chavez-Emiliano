public class OperacionesE{
    public static double Empleados(int HN, int HD, double sueldo){
        sueldo += (HN*60)+(HD*50);
        return sueldo;
    }
    public static double Supervisores(double sueldo){
        sueldo = sueldo - (sueldo*0.002) - (sueldo*0.001) - (sueldo*0.0016);
        return sueldo;
    }
    public static String text(String puesto){
        puesto = puesto.toLowerCase();
        puesto = puesto.replace(" ","");
        return puesto;
    }
}