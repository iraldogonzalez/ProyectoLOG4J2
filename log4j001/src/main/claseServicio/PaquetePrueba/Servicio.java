package PaquetePrueba;

//import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Servicio {
	static String nombreClase = Servicio.class.getName();
	private static Logger ServicioLogger = LogManager.getLogger("LoggerServicio");
	
	public static String warningMessage() {
		
		System.out.println(nombreClase);
		
		/*@SuppressWarnings("resource")
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter a line of text followed by <enter>: ");
		String str = reader.nextLine();*/
		String str = "ABC";
		
		ServicioLogger.info("Servicio1",1,nombreClase,"Info desde Servicio: "+str);
		ServicioLogger.error("Servicio5", 5, nombreClase, "Error desde Servicio");
		return str;
	}
	
}