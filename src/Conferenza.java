import java.time.LocalDate;

public class Conferenza extends Evento {
	
	private String argomento;
	private Oratore oratore;

	public Conferenza(String titolo, LocalDate data, int capienza, String argomento, Oratore oratore) throws Exception {
		super(titolo, data, capienza);
		this.argomento=argomento;
		this.oratore=oratore;
		argomentovuoto();
			
	}
	
	private void argomentovuoto() throws Exception {
		if (argomento == null || argomento.equalsIgnoreCase("")) {
			throw new Exception("il campo argomento non puo' essere vuoto");
	}
	}
	@Override
	public String toString() {
		return "Nome: " + oratore.getNome() + "\nCognome: " + oratore.getCognome() + "\nTitolo di studio: " +oratore.getTitolo()+ "\nArgomento di studio: " + argomento;
	}


}
