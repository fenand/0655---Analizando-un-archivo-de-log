import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

/**
 * Write a description of class AnalizadorAccesosAServidor here.
 * 
 * @author (fernando) 
 * @version (1.0)
 */
public class AnalizadorAccesosAServidor
{

    private ArrayList<Acceso> logServidor;

    /**
     * Constructor de la clase AnalizadorAccesosAServidor
     */
    public AnalizadorAccesosAServidor()
    {
        logServidor = new ArrayList<>();
    }

    /**
     * Tener un método llamado analizarArchivoDeLog que requiere de un parámetro 
     * de tipo String que informe del nombre del archivo de log a leer. 
     * Este método debe leer el archivo de log y analizarlo para que
     * luego podamos invocar el siguiente método.
     * 
     * @param Nombre del archivo de log con extension.log ya incluida solo poner el nombre del archivo
     */
    public void  analizarArchivoDeLog(String nombreArchivoALeer){
        try {
            File archivo = new File(nombreArchivoALeer + ".log");
            Scanner sc = new Scanner(archivo);
            while (sc.hasNextLine()) {
                String linea = sc.nextLine();
                String[] arrayDeString = linea.split(" ");
                //int año,int mes, int dia, int hora, int minutos
                logServidor.add(new Acceso (Integer.parseInt(arrayDeString[0]),Integer.parseInt(arrayDeString[1]),Integer.parseInt(arrayDeString[2]),
                        Integer.parseInt(arrayDeString[3]),Integer.parseInt(arrayDeString[4])));
            }
            sc.close();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    // /**
    // * Tener un método llamado obtenerHoraMasAccesos que, a partir de los procesos hechos por el método anterior, 
    // * encuentra la hora (solo la hora, sin tener en cuenta los minutos) a la que se producen más accesos al servidor. 
    // * El método muestra por pantalla dicha hora y la devuelve. Si hay empate, devuelve la hora más alta. 
    // * En caso de que se invoque este método sin haberse invocado el anterior el método informa 
    // * por pantalla de que no tiene datos, devuelve -1 y no hace nada más.
    // * 
    // * @return devuelve un int con la hora con mas accesos al servidor si no existen horas devuelve -1
    // */
    // public int obtenerHoraMasAccesos(){
    // int horaConMasAccesos = -1;
    // int contadorDeHorasIguales = 0;

    // if(logServidor.size() > 0){

    // }
    // return horaConMasAccesos;
    // }
}