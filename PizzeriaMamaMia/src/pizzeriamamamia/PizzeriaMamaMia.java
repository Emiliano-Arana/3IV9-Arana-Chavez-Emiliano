
package pizzeriamamamia;

public class PizzeriaMamaMia {
            
    public static void main(String[] args) {
        while(true){
            try{
                Menu men = new Menu();
                men.MenuOperaciones();
            }catch (Exception e){
                System.out.println("Error, solo se aceptan numeros enteros");
            }
        }
    }
}
