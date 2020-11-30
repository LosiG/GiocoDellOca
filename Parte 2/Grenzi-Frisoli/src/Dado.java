
import java.util.Random;

public class Dado {
	private int numero_casuale;
	
	public int lancia() {
		Random random = new Random();
		numero_casuale = random.nextInt(6);	
		numero_casuale = numero_casuale + 1;
		return numero_casuale;
		}
}
