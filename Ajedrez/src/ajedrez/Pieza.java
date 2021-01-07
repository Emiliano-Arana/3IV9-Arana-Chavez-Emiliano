
package ajedrez;

public class Pieza {
    private String color;
    private int valor;
    
    public Pieza(){
        
    }

    public Pieza(String color, int valor) {
        this.color = color;
        this.valor = valor;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    
}
