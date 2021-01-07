
package calendario;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Operaciones {
    
    public int diaActual(){
        Calendar fecha = new GregorianCalendar();
        int d = fecha.get(Calendar.DAY_OF_MONTH);
        return d;
    }
    
    public int mesActual(){
        Calendar fecha = new GregorianCalendar();
        int m = fecha.get(Calendar.MONTH);
        return (m+1);
    }
    
    public int anoActual(){
        Calendar fecha = new GregorianCalendar();
        int a = fecha.get(Calendar.YEAR);
        return a;
    }
    
}
