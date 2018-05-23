
import java.util.Calendar;
import java.util.GregorianCalendar;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mac
 */
public class pruebasII {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Calendar fecha = new GregorianCalendar();
        
        int anio = fecha.get(Calendar.YEAR);
        int mes = fecha.get(Calendar.MONTH);
        int dia = fecha.get(Calendar.DAY_OF_MONTH);
        int hora = fecha.get(Calendar.HOUR_OF_DAY);
        int minuto = fecha.get(Calendar.MINUTE);
        int segundo = fecha.get(Calendar.SECOND);
        
        System.out.println(anio+" "+" "+mes+" "+dia);
        System.out.println("----------------------");
        System.out.println(hora+" "+minuto+" "+segundo);
        
        
    }
    
}
