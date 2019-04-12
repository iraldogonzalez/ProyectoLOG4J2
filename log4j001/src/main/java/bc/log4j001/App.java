package bc.log4j001;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import PaquetePrueba.Servicio;

public class App {
	
	static String nombreClase = App.class.getName();
	private static Logger AppLogger = LogManager.getLogger("LoggerApp");
	private static Logger AppLogger_Prueba = LogManager.getLogger("LoggerPrueba");
	
    public static void main( String[] args ) {
    	
    	System.out.println(nombreClase);
    	
    	AppLogger.warn("App0", 0, nombreClase,"Aun no se ha llamado a 'warningMessage()'");
    	
    	String logm = Servicio.warningMessage();
    	
    	AppLogger.info("App3",3,nombreClase,"Info desde App "+logm);
    	AppLogger.error("App4", 4, nombreClase, "Error");
    	
    	
    	AppLogger_Prueba.warn("PruebaApp6", 6, nombreClase, "Warn de prueba");
    	
    }
    
}