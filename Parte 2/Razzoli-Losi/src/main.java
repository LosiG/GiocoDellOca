import java.util.Scanner;

public class main {

	
	
	public static void main(String[] args) {
		
		Scanner input= new Scanner(System.in);
		
		
		System.out.println("Inserire numero di giocatori");
		
		 
		int numGiocatori= input.nextInt();
		 
		Giocatore giocatori[]= new Giocatore[numGiocatori];
		Tabellone tabellone = new Tabellone();
		 
		for(int i = 1; i<numGiocatori;i++) {
			 System.out.println("Inserisci nome Giocatore "+i);
			 giocatori[i].setNome(input.nextLine());
			 System.out.println(giocatori[i].getNome() +", inserisci un colore per la pedina" );
			 giocatori[i].getPedina().setColore(input.nextLine());
			 
		 }
		do {
			
			for(int i=0;i<numGiocatori;i++) {
				
				
				System.out.println("Turno di " + giocatori[i].getNome() + " :");
				if (giocatori[i].getTurno()>0)
					System.out.println("1) Salta turno");
				else {
					System.out.println("1) Lancia dado");
				}
				System.out.println("2) Salva Partita");
				System.out.println("3) Carica Partita");
				System.out.println("4) Salva ed esci");
				int scelta = input.nextInt();
				switch(scelta) {
				
				case 1:
					if (giocatori[i].getTurno()>0)
						giocatori[i].setTurno(giocatori[i].getTurno()-1);
					else
						giocatori[i].muovi();
						giocatori[i].controllo(tabellone,giocatori[i].getPedina().getPosizione());
					if(giocatori[i].getPedina().getFine()==true){
						
						System.out.println("La partita è finita, "+giocatori[i].getNome() + " ha vinto!");
						System.exit(1);
						
					}
						
					break;
				}
				
			}
			
		}while(true);
		 
	}

}
