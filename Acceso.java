
/**
 * Write a description of class Acceso here.
 * 
 * @author (fernando) 
 * @version (1.0)
 */
public class Acceso
{
    private int año;
    private int mes; 
    private int dia;
    private int hora;
    private int minutos;
    private int numeroAccesos;
    /**
     * Constructor for objects of class Acceso
     */
    public Acceso(int año,int mes, int dia, int hora, int minutos)
    {
        this.año= año;
        this.mes= mes;
        this.dia=dia;
        this.hora=hora;
        this.minutos=minutos;
    }  

    /**
     * Metodo getter para obtener la hora del log
     * 
     * @return devuelve un int con la hora del log
     */
    public int getHoraDeAcceso()
    {
        return hora;
    }

}