package registro;

public class Studenti //Classe studente separata per organizzare meglio il codice.
{
	final private String nome; //final perché non credo che il nome, cognome e matricola di uno studente possano cambiare.  
	final private String cognome; //private perché solamente gli "admin" possono accedere a tali attributi, professore lo fanno solo tramite i get*(); 
	final private int matricola;

	public Studenti(String nome, String cognome, int matricola) //Costruttore con controllo su matricola negativa
	{
		if (matricola < 1)
			throw new IllegalArgumentException("Il numero matricola non può essere non positivo."); //Se durante la creazione dell'oggetto si inserisce un numero negativo (o 0) stampa un errore
		this.nome = nome;
		this.cognome = cognome;
		this.matricola = matricola;
	}

	public String getFirstName() //Per ottenere attributi privati (senza la possibilità di modificarli)
	{
		return nome;
	}

	public String getLastName()
	{
		return cognome;
	}

	public int getMatrNumber()
	{
		return matricola;
	}

	public static void stampaStudenti(Studenti studente) //Stampa personalizzata
	{
		System.out.println("Nome: " + studente.getFirstName() + ". Cognome: " + studente.getLastName() + "."); //Solo nome e cognome
	}

}
