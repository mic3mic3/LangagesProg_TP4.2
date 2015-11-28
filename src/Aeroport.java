import java.util.ArrayList;
import java.util.List;
import java.lang.System;
public class Aeroport implements TourControle, LieuAtterrissage {
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
		for(Avion a : avions)
		{
			System.out.println(a.getDescription());
		}	
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
