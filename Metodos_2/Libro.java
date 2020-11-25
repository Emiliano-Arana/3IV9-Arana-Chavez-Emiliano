public class Libro{
    
    private String titulo,autor;
    private int noLibro,noPrestados;

    public Libro(){
        this.titulo = titulo;
        this.autor = autor;
        this.noLibro = noLibro;
        this.noPrestados = noPrestados;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public String getTitulo(){
        return titulo;
    }

    public void setAutor(String autor){
        this.autor = autor;
    }
    public String getAutor(){
        return autor;
    }

    public void setNoLibro(int noLibro){
        this.noLibro = noLibro;
    }
    public int getNoLibro(){
        return noLibro;
    }

    public void setNoPrestados(int noPrestados){
        this.noPrestados = noPrestados;
    }
    public int getNoPrestados(){
        return noPrestados;
    }
}