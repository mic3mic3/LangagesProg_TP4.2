import java.util.ArrayList;
import java.util.List;
public class Aeroport implements TourControle, LieuAtterrissage {
	public final int QUANTITE_ESSENCE_UTILISEE_PAR_TOUR = 1;
	
	Piste[] pistes;
	List<Avion> avions;
	Ciel ciel;
	public Aeroport() {
		pistes = new Piste[3];
		pistes[0] = new Piste(1);
		pistes[1] = new Piste(2);
		pistes[2] = new Piste(3);
		avions = new ArrayList<Avion>();
		ciel = new Ciel(this);
		ciel.start();		
	}
	
	public void survoler(Avion avion)
	{
		avions.add(avion);
		//System.out.println("****************************");
		//for(Avion a : avions)
		//{
		//	System.out.println(a.getDescription());
		//}
		//System.out.println("****************************");
	}
	
	public void afficherAvionsEnVol()
	{
		System.out.println("Avions en survol");
		for(Avion avion : avions)
		{
			System.out.println(avion.getDescription());
		}
	}
	
	public void afficherStatutPistes()
	{
		System.out.println("Etat des pistes");
		for(int index = 0; index < pistes.length; index++)
		{
			System.out.println(pistes[index].getDescription());
		}
	}
	
	public void faireSurvolerAvions()  throws EcrasementAvionException
	{
		for(Avion avion : avions)
		{
			avion.diminuerQuantiteEssence(QUANTITE_ESSENCE_UTILISEE_PAR_TOUR);
		}
		for (Piste piste : pistes)
		{
			piste.update();
		}
		
	}
	
	public void faireAtterrirAvion(String noAvion, String noPiste)  throws EcrasementAvionException
	{
		// Validation du num�ro d'avion
		int indexAvion;
		boolean avionTrouve = false;
		for(indexAvion = 0; indexAvion < avions.size() && avionTrouve == false;)
		{
			if(avions.get(indexAvion).getNumeroSerie().compareTo(noAvion) == 0)
				avionTrouve = true;
			else
				++indexAvion;
		}
		if(avionTrouve == false)
		{
			System.out.println("L'avion num�ro " + noAvion + " n'a pas �t� trouv� dans le ciel.");
			return;
		}
		
		// Validation du num�ro de piste (nombre entier)
		int noPisteInt;
		try
		{
			noPisteInt = Integer.parseInt(noPiste);
		}
		catch(NumberFormatException numberFormatException)
		{
			System.out.println("Le num�ro de piste " + noPiste + " est invalide; celui-ci doit correspondre � un nombre entier.");
			return;
		}
		
		// Validation du num�ro de piste (num�ro valide)
		int indexPiste;
		boolean pisteTrouvee = false;
		int test = pistes.length;
		for(indexPiste = 0; indexPiste < pistes.length && pisteTrouvee == false;)
		{
			if(pistes[indexPiste].getNumero() == noPisteInt)
				pisteTrouvee = true;
			else
				++indexPiste;
		}
		if(pisteTrouvee == false)
		{
			System.out.println("La piste num�ro " + noPiste + " n'existe pas.");
			return;
		}
		
		// Atterrissage de l'avion � la piste demand�e
		pistes[indexPiste].setAvion(avions.get(indexAvion));
		
		// On retire l'avion du ciel
		avions.remove(indexAvion);
		
		// Mise � jour du tour effectu�
		faireSurvolerAvions();
	}
}
