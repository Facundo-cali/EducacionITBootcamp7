package practicaVoladores;

public class ovni extends Voladores implements Aterrizable {
	
	//Attributes
	int numeroLuces = 5;
	
	//Constructor
	public ovni(String nombre) {
		super(nombre);
	}

	//Methods
	public void aterrizar() {
		System.out.println("El ovni aterriza");
	}
}
