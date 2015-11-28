
public class Piste {

	public final int MAX_TOURS_SUR_PISTE = 5;
	
	private Avion avion;
	private int nbrTours;
	private int numero;
	
	public Piste() {
		avion = null;
		numero = 0;
		nbrTours = 0;
	}
	
	public Piste(int numero) {
		avion = null;
		this.numero = numero;
		nbrTours = 0;
	}
	
	private boolean avionPretPourAllerAuHangar()
	{
		return nbrTours >= MAX_TOURS_SUR_PISTE;
	}
	
	public boolean contientAvion()
	{
		return avion != null;
	}
	
	public String getDescription()
	{
		String description = "(" + Integer.toString(numero) + ") ";
		if(avion == null)
			description += "Libre";
		else
			description += "Occup�: " + avion.getDescription() + "(" + Integer.toString(this.nbrTours) + "/" + Integer.toString(MAX_TOURS_SUR_PISTE) + ")";	
		return description;
	}
	
	public int getNumero()
	{
		return numero;
	}
	
	public void setAvion(Avion value) throws EcrasementAvionException
	{
		if(this.contientAvion())
			throw new EcrasementAvionException();
		
		avion = value;
	}
	
	// Update qui se fait � chaque tour.
	public void update()
	{
		// S'il n'y a pas d'avion sur la piste, rien � faire.
		if(this.contientAvion() == false)
			return;
		
		// On incr�mente le nombre de tours depuis lequel
		// l'avion est pr�sent sur la piste.
		++nbrTours;
		
		// Si l'avion a atteint le nombre maximal de tours
		// pour lequel il peut �tre pr�sent sur la piste,
		// on le retire de la piste (on supprime l'objet).
		if(this.avionPretPourAllerAuHangar())
			avion = null;
	}

}
