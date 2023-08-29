package practicaVoladores;

public class avion extends Voladores implements Aterrizable{

	//Attributes
	int cantAsientos = 55;
	
	//Constructor
	public avion(String nombre) {
		super(nombre);
	}
	
	//Methods
	public void aterrizar() {
		System.out.println("El avion aterriza");
	}

}
