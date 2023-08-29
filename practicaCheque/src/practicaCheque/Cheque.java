package practicaCheque;

public class Cheque {
	//Attributes
	private String banco;
	private int importe;
	private String titular;
	
	//Constructor
	public Cheque(String banco, int importe, String titular) {
        this.banco = banco;
        this.importe = importe;
        this.titular = titular;
    }
	
	//Methods
	public String getBanco() {
        return banco;
    }

    public int getImporte() {
        return importe;
    }

    public String getTitular() {
        return titular;
    }
	
}
