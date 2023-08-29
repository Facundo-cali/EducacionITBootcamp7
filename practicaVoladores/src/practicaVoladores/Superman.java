package practicaVoladores;

public class Superman extends Voladores implements Aterrizable {

	//Attributes
	int edad = 29;
	
	//Constructor
	public Superman(String nombre) {
		super(nombre);
	}

	//Methods
	public void aterrizar() {
		System.out.println("Superman aterriza!");	
	}

}
