package registro;

import java.util.ArrayList;

public class Registro
{
	ArrayList<Studenti> registro;

	public Registro(ArrayList<Studenti> registro)
	{
		this.registro = registro;
	}

	public static void aggiungiStudente(ArrayList<Studenti> registro, Studenti studente) //Si aggiunge uno studente se ha matricola univoca
	{
		int checkCounter = 0; //Parte da 1 perché deve arrivare a registro.size
		for (int i = 0; i < registro.size(); i++)
		{
			if (studente.getMatrNumber() != registro.get(i).getMatrNumber())
				checkCounter++; //Per il momento è unico
			else
				break; //Non è unico si interrompe il for
		}
		if (checkCounter == registro.size()) //Si aggiunge
		{
			registro.add(studente);
			System.out.println("Studente aggiunto con successo.");
		} else
			System.out.println("La matricola è già in uso.");
	}

	public static void visualizzaStudenti(ArrayList<Studenti> registro) //Stampa il registro stuenti in base a nome e cognome
	{
		for (int i = 0; i < registro.size(); i++)
		{
			Studenti.stampaStudenti(registro.get(i));
		}
	}

	public static void cercaStudente(ArrayList<Studenti> registro, int matricola) //Cerca lo studente in base a numero matricola
	{
		int c = 0;
		for (int i = 0; i < registro.size(); i++)
		{
			if (matricola == registro.get(i).getMatrNumber())
			{
				System.out.println("Studente trovato");
				Studenti.stampaStudenti(registro.get(i));
				break;
			} else
				c++;
		}
		if (c == registro.size())
			System.out.println("Studente non trovato");
	}

}
