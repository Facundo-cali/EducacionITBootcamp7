package practicaCheque;
import java.util.*;

public class main {

	public static void main(String[] args) {
		

		 // Crear un conjunto de Cheques usando TreeSet
        Set<Cheque> conjuntoCheques = new TreeSet<>(new ComparadorChequesPorTitularYBanco());
        
        
        //Agregar al conjunto
        conjuntoCheques.add(new Cheque("Banco B", 2000, "Maria"));
        conjuntoCheques.add(new Cheque("Banco A", 1000, "Juan"));
        conjuntoCheques.add(new Cheque("Banco C", 1500, "Carlos"));
        conjuntoCheques.add(new Cheque("Banco A", 1000, "Juan"));  // Duplicado, no se agregará
        
     // Iterar a través del conjunto de Cheques y mostrar el nombre de cada cheque
        for (Cheque cheque : conjuntoCheques) {
            System.out.println("Nombre del cheque: " + cheque.getTitular());
        }
        
	}
}


class ComparadorChequesPorTitularYBanco implements Comparator<Cheque> {
    @Override
    public int compare(Cheque cheque1, Cheque cheque2) {
        // Comparar por titular primero
        int comparacionPorTitular = cheque1.getTitular().compareTo(cheque2.getTitular());

        if (comparacionPorTitular != 0) {
            return comparacionPorTitular;
        } else {
            // Si los titulares son iguales, comparar por banco
            return cheque1.getBanco().compareTo(cheque2.getBanco());
        }
    }
}