
/**
 * Write a description of class Acceso here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Acceso
{
    private int a�o;
    private int mes; 
    private int dia;
    private int hora;
    private int minutos;
    private int numeroAccesos;
    /**
     * Constructor for objects of class Acceso
     */
    public Acceso(int a�o,int mes, int dia, int hora, int minutos)
    {
        this.a�o= a�o;
        this.mes= mes;
        this.dia=dia;
        this.hora=hora;
        this.minutos=minutos;
    }  

    /**
     * devuelve hora
     */
    public int getHoraDeAcceso()
    {
        return hora;
    }

}