import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Evento {

	
    private LocalDate oggi= LocalDate.now();
	private LocalDate data ;
	private int capienza ;
	private String titolo;
	
	private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	
	public Evento(String titolo, LocalDate data, int capienza) throws Exception {
		
		this.titolo=titolo;
		this.data=data;
		this.capienza=capienza;
		validaData();
		validaPosti();
		
		
	}
	
	
	
	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public int getCapienza() {
		return capienza;
	}

	
	
	
	public void validaData() throws Exception {
		if (oggi.isAfter(data)) {
			throw new Exception("La data inserita non e' corretta");
		}
	}
	
     public void validaPosti() throws Exception {
    	 if (this.capienza <= 0) {
    		throw new Exception("Inserire un numero di posti valido");
    	 }
     }
		
	
	
	
	//METODI
     
     
    private int posti=0;
    
    public int getPosti() {
		return posti;
	}
    
    public void prenota(int numeroprenotazioni)throws Exception {
    	 if (numeroprenotazioni > capienza) {
			throw new Exception("Non puoi assegnare posti inesistenti");
		}
    	 if (numeroprenotazioni < 0 ) {
 			throw new Exception("Il numero inserito non e' valido");
 		}
    	 
		posti = posti + numeroprenotazioni;
		
	}
	
    public void disdici(int disdetta) throws Exception{
    	if (disdetta > posti) {
			throw new Exception("Il numero non puo' ritornare negativo");
		}
    	 if (disdetta < 0 ) {
 			throw new Exception("Il numero inserito non e' valido");
 		}
		posti = posti - disdetta;
		
	}
    
    private int capienzatotale() {
    	return capienza - posti;
    }
	

	
	@Override
	public String toString() {
		return "Prenotazioni effettuate: " + posti + ", Totale posti disponibili: " + capienzatotale() + ", Evento: " + titolo +" "+ formatter.format(data);
	}

}
