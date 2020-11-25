public class DatosSupervisores extends EmpleadosDatos{
    private String puesto;
    private int id;
    private double quincenal;

    public DatosSupervisores(){   
        puesto = "supervisor";
        id = 1;
        quincenal = sueldo[id];
        
        this.quincenal = quincenal;
        this.puesto = puesto;
        this.id = id;
    }

    public String getPuesto(){
        puesto = "supervisor";
        return puesto;
    }

    public void setPuesto(String puesto){
        this.puesto = puesto;
    }

    public int getId(){
        id = 1;
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public double getQuincenal(){
        quincenal = sueldo[id];
        return quincenal;
    }

    public void setQuincenal(){
        this.quincenal = quincenal;
    }
}