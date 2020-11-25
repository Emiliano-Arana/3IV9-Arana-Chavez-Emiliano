public class Libros extends Libro{
    private int rLibro,rPrestados;

    public Libros(){

    }
    //calculo aleatorio de libros prestados y totales
    public void random(){
        rLibro = ((int)Math.round(Math.random()*20));
        do{
            rPrestados = ((int)Math.round(Math.random()*20));
        }while(rPrestados>rLibro);
        setNoLibro(rLibro);
        setNoPrestados(rPrestados);
    }

}