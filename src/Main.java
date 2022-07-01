import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

	

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Scanner scan= new Scanner(System.in);
       
		System.out.println("Benvenuto in EventiJava");
		int cap = 0;	
		int giorno = 0;		
		int mese = 0;
		int anno = 0;
		Evento concerto = null;
		boolean primo = true;
		
		System.out.print("Inserisci titolo Evento:");
		String evento = scan.nextLine();
		
		do {
			try {
				System.out.print("Inserisci capienza dell' evento:");
				cap = Integer.parseInt(scan.nextLine());
				System.out.println("Inserisci la Data.");
				System.out.print("Inserisci giorno:");
				giorno = Integer.parseInt(scan.nextLine());
				System.out.print("Inserisci mese:");
				mese = Integer.parseInt(scan.nextLine());
				System.out.print("Inserisci anno:");
				anno = Integer.parseInt(scan.nextLine());
				LocalDate data = LocalDate.of(anno, mese, giorno);

				concerto = new Evento(evento, data, cap);
				System.out.println("Evento creato.");
                primo = false;
				
			} catch (DateTimeException e) {
				System.out.println("I valori devono essere numeri.");
			} catch (NumberFormatException e) {
				System.out.println("I valori devono essere numeri.");
			} catch (Exception e) {
				System.out.println("E' stato riscontrato un errore, riprova.");
				System.out.println(e.getMessage());
			} 
		} while (primo);
		
		
		//Creazione programma per prenotazioni utente
		
		boolean flag = true;
		int scelta=0;
			do {
				
				System.out.println("Scrivi: \n1: Assegna posti \n2: Rimuovi posti assegnati \n3: Termina programma ");
				
				try {
					scelta = Integer.parseInt(scan.nextLine());
				} catch (NumberFormatException e) {
					System.out.println("I valori devono essere numeri.");
				}
				switch (scelta) {
				case 1: {
					try {
						System.out.println("Quante prenotazioni vuoi fare?");
						int prenotazioni = Integer.parseInt(scan.nextLine());
						concerto.prenota(prenotazioni);
					} catch (NumberFormatException e) {
						System.out.println("I valori devono essere numeri.");
					} catch (Exception e) {
						System.out.println(e.getMessage());
					}
					
					break;
				}
				case 2: {
					try {
						System.out.println("Quante prenotazioni vuoi disdire?");
						int disdetta = Integer.parseInt(scan.nextLine());
						concerto.disdici(disdetta);
					} catch (NumberFormatException e) {
						System.out.println("I valori devono essere numeri.");
					} catch (Exception e) {
						System.out.println(e.getMessage());
					}
					break;
				}
				case 3: {
					flag = false;
					break;
				}
				default: {
					System.out.println("Scelta non valida, riprova.");
					break;
				}
				}
			} while (flag == true);
			
		
		System.out.println(concerto.toString());
		
		
		
		
		
		
		
		
		
		
		
		
		scan.close();
	}
		
}
		
	


