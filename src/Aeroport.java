import java.util.List;
public class Aeroport implements TourControle, LieuAtterrissage {
	Piste[] pistes;
	List<Avion> avions;
	Ciel ciel;
	public Aeroport() {
		pistes = new Piste[3];
		pistes[0] = new Piste(1);
		pistes[1] = new Piste(2);
		pistes[2] = new Piste(3);
		ciel = new Ciel(this);
		ciel.start();		
	}
	
	public void survoler(Avion avion)
	{
		
	}
	
	public void afficherAvionsEnVol()
	{
		for(Avion avion : avions)
		{
			System.out.println(avion.getDescription());
		}
	}
	
	public void afficherStatutPistes()
	{
		for(int index = 0; index < pistes.length; index++)
		{
			
		}
	}

}
