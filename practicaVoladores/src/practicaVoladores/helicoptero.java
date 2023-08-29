package practicaVoladores;

public class helicoptero extends Voladores implements Aterrizable   {

	//Attributes
	String color="blanco"; 
	
	//Constructor
	public helicoptero(String nombre) {
		super(nombre);
	}

	//Methods
	public void aterrizar() {
		System.out.println("El helicoptero aterriza");
	}
	
}
